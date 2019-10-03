package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import def.dom.HTMLDivElement;
import def.dom.MouseEvent;
import def.jquery.JQueryAjaxSettings;
import def.jquery.JQueryXHR;
import def.js.JSON;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLImageElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder;

public class MyAnnotation extends TaskPage 
{
	public static final Character[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	private boolean canPlay = true;
	
	private List<Character> usedLetters = new ArrayList<>();
	
	private String synonym;
	
	private List<Character> mask = new ArrayList<>();;
	
	private int wrongGuesses = 0;
	
	public static void main(String[] args) { new MyAnnotation(); }
	
	public MyAnnotation()
	{
		super("MY_ANNOTATION", "Try to guess the right synonym of this word and save the stickman", new String[] {"Word"}, "./myAnnotation.jsp");
		$(new HTMLHeadingElementBuilder(2).addText("The synonyms hangman").build()).insertBefore("h3");
		$("#box").append(
				new HTMLImageElementBuilder("Hangman").addSrc("./images/hmstart.gif").build(),
				new HTMLSpanElementBuilder("final-word").build(),
				new HTMLDivElementBuilder("keyboard").addClass("vertical container").build(),
				new HTMLFormElementBuilder("form").addClass("vertical container width-90").addAction(servletUrl).build());
		$("#keyboard").append(
				createKeyboardRow(0, 10),
				createKeyboardRow(10, 19),
				createKeyboardRow(19));
		$("#form").append( 
				createInputHiddenElem(contextElems[0]),
				createInputHiddenElem("synonym"),
				createInputHiddenElem("result"),
				createBottomButtons("bottom-buttons", "space-between"));
		$("#next-button").prop("disabled", canPlay + "");
		fillTaskContext();
		synonym = ((String) $("#synonym-hidden").val()).toUpperCase();
		createMask();
	}
	
	private HTMLDivElement createKeyboardRow(int firstIndex, int lastIndex)
	{
		HTMLDivElement row = new HTMLDivElementBuilder().addClass("horizontal container align-center").build();
		for (int i = firstIndex; i < lastIndex; i++)
			$(row).append(new HTMLAnchorElementBuilder(ALPHABET[i].toString()).onClick(selectLetterClick(ALPHABET[i])).addClass("letter").addText(ALPHABET[i].toString()).build());
		return row;
	}
	
	private HTMLDivElement createKeyboardRow(int firstIndex) { return createKeyboardRow(firstIndex, ALPHABET.length); }
	
	@Override
	protected void fillTaskContext()
	{	
		$.ajax(new JQueryAjaxSettings() {
			{
				url = REST_URL;
				dataType = "json";
				data = "task=" + taskName;
				async = false;
			}
			
			@Override
			public Object success(Object result, String a, JQueryXHR ctx) 
			{
				JSON json = (JSON) result;
				String text = json.$get(contextElems[0].toLowerCase());
				$("#" + contextElems[0].toLowerCase()).text(text);
				$("#" + contextElems[0].toLowerCase() + "-hidden").val(text);
				$("#" + "synonym-hidden").val((String) json.$get("synonym"));
				return null;
			}
		});
	}
	
	private void createMask()
	{
		for (int i = 0; i < synonym.length(); i++)
			mask.add(synonym.charAt(i) == ' ' ? ' ' : '_');
		saveMask();
	}
	
	private void editMask(Character letter, List<Integer> letterIndexes)
	{
		for (Integer i: letterIndexes)
				mask.set(i, letter);
		saveMask();
	}
	
	private void saveMask()
	{
		String maskString = "";
		for (int i = 0; i < mask.size(); i++)
			maskString += i == synonym.length() - 1 ? mask.get(i) : mask.get(i) + '\xa0'; //TODO sto carattere non esiste in Java ma in JS si
		$("#final-word").text(maskString);
	}
	
	private boolean selectLetter(Character letter)
	{
		if ((! canPlay) || usedLetters.contains(letter)) 
			return false;
		
		usedLetters.add(letter);
		
		if (synonym.indexOf(letter) != -1)
		{
			$("#" + letter).css("border-color", "green").css("color", "green");
			editMask(letter, occurrencesPositions(letter));
			
			if (! ((String) $("#final-word").text()).contains("_"))
				endGame(true);
		}
		else
		{
			$("#" + letter).css("border-color", "red").css("color", "red");
			wrongGuesses++;
			$("#Hangman").attr("src", "images/hm" + wrongGuesses + ".gif"); //TODO ridisegnare lo stickman
			if (wrongGuesses == 6)
				endGame(false);
		}
		return true;
	}
	
	private Function<MouseEvent, Object> selectLetterClick(Character c) { return e -> selectLetter(c); }
	
	private void endGame(boolean outcome)
	{
		if (outcome)
			$("#final-word").css("border-color", "green").css("color", "green");
		else
			$("#final-word").text("The stickman died :(").css("border-color", "red").css("color", "red");
		
		$("#result-hidden").val(outcome ? "Win!" : "Lose :(");
		canPlay = false;
		$("#next-button").removeAttr("disabled");
	}
	
	private List<Integer> occurrencesPositions(Character letter)
	{
		List<Integer> letterIndexes = new ArrayList<>();
		for (int index = synonym.indexOf(letter); index >= 0; index = synonym.indexOf(letter, index + 1))
		    letterIndexes.add(index);
		return letterIndexes;
	}
}
