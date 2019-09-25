package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.dom.Globals.alert;
import static def.jquery.Globals.$;

import def.dom.Event;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

public class TranslationValidation extends TaskPage 
{
	public static void main(String[] args) { new TranslationValidation(); }
	
	public TranslationValidation()
	{
		super("TRANSLATION_VALIDATION", "Select the correct translation of this word and his definition", new String[] {"Word", "Definition"}, "./translationValidation.jsp");
		$("#box").append(new HTMLFormElementBuilder("form").changeMethod("POST").addAction(servletUrl).onSubmit(this::checkForm).build());
		$("#form").append(
				new HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(),
				createBottomButtons("bottom-buttons", "space-between"));
		$("#form-div").append( //TODO nella documentazione è scritto che vanno messe delle checkbox ma non ha senso -> chiedere sul gruppo // ho mandato una mail
				createCheckResponse("test1", "checkbox", "translation"),
				createCheckResponse("test2", "checkbox", "translation"),
				createCheckResponse("test3", "checkbox", "translation"),
				createCheckResponse("Nessuna", "checkbox", "translation"));
		fillTaskContext();
	}
	
	private boolean checkForm(Event event)
	{
		if ($("input[type='checkbox']:checked").length == 0)
		{
			alert("You must choose at least 1 option!");
			return false;
		}
		
		return true;
	}
}
