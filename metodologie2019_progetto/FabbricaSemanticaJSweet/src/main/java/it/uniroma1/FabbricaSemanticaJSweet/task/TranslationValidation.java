package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

public class TranslationValidation extends TaskPage 
{
	public static void main(String[] args) { new TranslationValidation(); }
	
	public TranslationValidation()
	{
		super("TRANSLATION_VALIDATION", "Select the correct translation of this word and his definition", new String[] {"Word", "Definition"},"./translationValidation.jsp");
		$("#box").append(new HTMLFormElementBuilder("form").changeMethod("POST").addAction(servletUrl).build());
		$("#form").append(
				new HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(),
				createBottomButtons("bottom-buttons", "space-between"));
		$("#form-div").append(
				createRadioResponse("test1", "translation"),
				createRadioResponse("test2", "translation"),
				createRadioResponse("test3", "translation"));
		fillTaskContext();
	}
}
