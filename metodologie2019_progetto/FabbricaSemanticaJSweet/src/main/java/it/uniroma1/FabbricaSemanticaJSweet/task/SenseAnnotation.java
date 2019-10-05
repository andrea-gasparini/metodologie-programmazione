package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

/**
 * La classe SenseAnnotation rappresenta la pagina del Task in cui data una
 * parola e una frase in cui la parola appare, l’utente deve selezionare il
 * senso appropriato.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class SenseAnnotation extends TaskPage 
{
	/**
	 * Crea la pagina SenseAnnotation
	 */
	public static void main(String[] args) { new SenseAnnotation(); }
	
	/**
	 * Costruisce la pagina SenseAnnotation con gli elementi di contesto Word e
	 * Sentence. Al form vengono aggiunte le risposte tra cui scegliere, gli
	 * elementi nascosti relativi al contesto e i pulsanti per inviare o saltare il
	 * Task. Viene chiamato il metodo per recuperare i dati del Task dal back-end.
	 */
	public SenseAnnotation()
	{
		super("SENSE_ANNOTATION", "Select the correct meaning of the word in the following sentence", new String[] {"Word", "Sentence"}, "./senseAnnotation.jsp");
		$("#box").append(new HTMLFormElementBuilder("form").changeMethod("POST").addAction(servletUrl).build());
		$("#form").append(
				new HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(),
				createInputHiddenElem(contextElems[0]),
				createInputHiddenElem(contextElems[1]),
				createBottomButtons("bottom-buttons", "space-between"));
		$("#form-div").append(
				createRadioResponse("response-1", "meaning"),
				createRadioResponse("response-2", "meaning"),
				createRadioResponse("response-3", "meaning"),
				createRadioResponse("response-4", "meaning"));
		fillTaskContext("senses", 4);
	}
}