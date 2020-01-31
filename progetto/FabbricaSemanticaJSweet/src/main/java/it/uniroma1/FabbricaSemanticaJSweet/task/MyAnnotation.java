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

/**
 * La classe MyAnnotation rappresenta la pagina del Task in cui data una parola
 * bisogna giocare al classico gioco dell'Impiccato per indovinare il sinonimo
 * fornito dal sistema.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class MyAnnotation extends TaskPage 
{
	/**
	 * Alfabeto latino per la creazione della tastiera HTML
	 */
	public static final Character[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	/**
	 * Possibilita' di interagire con il Task
	 */
	private boolean canPlay = true;
	
	/**
	 * Lista delle lettere gia' selezionate nel gioco
	 */
	private List<Character> usedLetters = new ArrayList<>();
	
	/**
	 * Sinonimo da indovinare
	 */
	private String synonym;
	
	/**
	 * Lista dei caratteri "oscurati" del sinonimo da indovinare 
	 */
	private List<Character> mask = new ArrayList<>();
	
	/**
	 * Numero di lettere scelte non presenti nel sinonimo (quindi scelte sbagliate)
	 */
	private int wrongGuesses = 0;
	
	/**
	 * Crea la pagina MyAnnotation 
	 */
	public static void main(String[] args) { new MyAnnotation(); }
	
	/**
	 * Costruisce la pagina MyAnnotation con l'elemento di contesto Word e un
	 * ulteriore titolo oltre quello esplicativo del Task. Aggiunge l'immagine
	 * dell'impiccato, l'elemento che rappresenta la parola da indovinare, una
	 * tastiera HTML e il form in cui son contenuti gli elementi nascosti con la
	 * parola fornita dal sistema, il sinonimo da indovinare e l'esito del gioco,
	 * oltre ai pulsanti per inviare o saltare il Task. Il pulsante per l'invio del
	 * form viene disabilitato fino a che non si indovina il sinonimo o si terminano
	 * i tentativi disponibili.
	 */
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
	
	/**
	 * Crea un elemento HTML contenente una riga della tastiera HTML contenente le
	 * lettere dell'alfabeto ed associa ad ogni "pulsante" l'azione di selezionare
	 * la lettera
	 * 
	 * @param firstIndex indice della prima lettera da inserire nella riga
	 * @param lastIndex  indice dell'ultima lettera da inserire nella riga
	 * @return ritorna l'elemento HTML contenente la riga della tastiera
	 */
	private HTMLDivElement createKeyboardRow(int firstIndex, int lastIndex)
	{
		HTMLDivElement row = new HTMLDivElementBuilder().addClass("horizontal container align-center").build();
		for (int i = firstIndex; i < lastIndex; i++)
			$(row).append(new HTMLAnchorElementBuilder(ALPHABET[i].toString()).onClick(selectLetterClick(ALPHABET[i])).addClass("letter").addText(ALPHABET[i].toString()).build());
		return row;
	}
	
	/**
	 * Crea un elemento HTML contenente una riga della tastiera HTML contenente le
	 * lettere dell'alfabeto ed associa ad ogni "pulsante" l'azione di selezionare
	 * la lettera
	 * 
	 * @param firstIndex indice della prima lettera da inserire nella riga
	 * @return ritorna l'elemento HTML contenente la riga della tastiera
	 */
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
	
	/**
	 * Aggiunge alla lista dei caratteri "oscurati" tanti underscore quante sono le
	 * lettere del sinonimo da indovinare
	 */
	private void createMask()
	{
		for (int i = 0; i < synonym.length(); i++)
			mask.add(synonym.charAt(i) == ' ' ? ' ' : '_');
		saveMask();
	}
	
	/**
	 * Modifica i caratteri della lista degli "oscurati" impostando la nuova lettera
	 * nelle posizioni indicate
	 * 
	 * @param letter lettera da impostare nella maschera
	 * @param letterIndexes indici in cui impostare la lettera
	 */
	private void editMask(Character letter, List<Integer> letterIndexes)
	{
		for (Integer i: letterIndexes)
				mask.set(i, letter);
		saveMask();
	}
	
	/**
	 * Crea una Stringa concatenando i caratteri presenti nella lista dei caratteri
	 * "oscurati" e la imposta nella pagina al posto della precedente
	 */
	private void saveMask()
	{
		String maskString = "";
		for (int i = 0; i < mask.size(); i++)
			maskString += i == synonym.length() - 1 ? mask.get(i) : mask.get(i) + " ";
		$("#final-word").text(maskString);
	}
	
	/**
	 * Dopo aver controllato se e' ancora possibile giocare e se la lettera passata
	 * come parametro e' stata gia' selezionata (in caso contrario la aggiunge a
	 * quelle utilizzate), controlla se questa e' presente nel sinonimo e in caso
	 * positivo modifica la maschera dei caratteri "oscurati" e controlla se il
	 * gioco e' terminato con una vittoria (se non ci sono piu' caratteri oscurati
	 * nella lista). In caso negativo incrementa il numero di tentativi e aggiorna
	 * l'immagine dell'impiccato, se i tentativi sono pari a 6 il gioco termina con
	 * la perdita.
	 * 
	 * @param letter lettera selezionata
	 * @return false se non e' stato possibile selezionarla, true altrimenti
	 */
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
			$("#Hangman").attr("src", "images/hm" + wrongGuesses + ".gif");
			if (wrongGuesses == 6)
				endGame(false);
		}
		return true;
	}
	
	/**
	 * Data una lettera ritorna una Funzione dal click del mouse alla chiamata al
	 * metodo selectLetter della lettera stessa
	 * 
	 * @param letter lettera selezionata
	 * @return Funzione da click del mouse al metodo di selezione lettera
	 */
	private Function<MouseEvent, Object> selectLetterClick(Character letter) { return e -> selectLetter(letter); }
	
	/**
	 * Imposta l'esito della partita, termina il gioco e abilita l'utilizzo del
	 * pulsante di invio del form
	 * 
	 * @param outcome risultato della partita, true se vinta, false altrimenti
	 */
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
	
	/**
	 * Data una lettera, calcola gli indici delle occorrenze del carattere nel
	 * sinonimo
	 * 
	 * @param letter lettera di cui cercare gli indici
	 * @return lista degli indici in cui si trova la lettera (all'interno del sinonimo)
	 */
	private List<Integer> occurrencesPositions(Character letter)
	{
		List<Integer> letterIndexes = new ArrayList<>();
		for (int index = synonym.indexOf(letter); index >= 0; index = synonym.indexOf(letter, index + 1))
		    letterIndexes.add(index);
		return letterIndexes;
	}
}
