package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

/**
 * La classe TranslationValidation rappresenta la pagina del Task in cui data
 * una parola e una sua definizione in inglese, l’utente deve scegliere la
 * miglior traduzione tra quelle fornite o specificare Nessuna.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class TranslationValidation extends TaskPage 
{
	/**
	 * Crea la pagina TranslationValidation
	 */
	public static void main(String[] args) { new TranslationValidation(); }
	
	/**
	 * Costruisce la pagina TranslationValidation con gli elementi di contesto Word e
	 * Definition. Al form vengono aggiunte le risposte tra cui scegliere, gli
	 * elementi nascosti relativi al contesto e i pulsanti per inviare o saltare il
	 * Task. Viene chiamato il metodo per recuperare i dati del Task dal back-end.
	 */
	public TranslationValidation()
	{
		super("TRANSLATION_VALIDATION", "Select the better translation of this word and his definition", new String[] {"Word", "Definition"}, "./translationValidation.jsp");
		$("#box").append(new HTMLFormElementBuilder("form").changeMethod("POST").addAction(servletUrl).build());
		$("#form").append(
				new HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(),
				createInputHiddenElem(contextElems[0]),
				createInputHiddenElem(contextElems[1]),
				createBottomButtons("bottom-buttons", "space-between"));
		$("#form-div").append(
				createRadioResponse("response-1", "translation"),
				createRadioResponse("response-2", "translation"),
				createRadioResponse("response-3", "translation"),
				createRadioResponse("response-4", "Nessuna", "translation"));
		fillTaskContext("translations", 3);
	}
}
