package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

/**
 * La classe SenseValidation rappresenta la pagina del Task in cui data una
 * parola e una frase in cui appare, l'utente deve verificare se il senso
 * fornito dal sistema e' appropriato.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class SenseValidation extends TaskPage
{
	/**
	 * Crea la pagina SenseValidation 
	 */
	public static void main(String[] args) { new SenseValidation(); }
	
	/**
	 * Costruisce la pagina SenseValidation con gli elementi di contesto Word,
	 * Sentence e Definition. Al form vengono aggiunti una scelta fra Yes e No, gli
	 * elementi nascosti relativi al contesto e i pulsanti per inviare o saltare il
	 * Task. Viene chiamato il metodo per recuperare i dati del Task dal back-end.
	 */
	public SenseValidation() 
	{
		super("SENSE_VALIDATION", "Is the word in the following sentence the right term for this definition?", new String[] {"Word", "Sentence", "Definition"}, "./senseValidation.jsp");
		$("#box").append(new HTMLFormElementBuilder("form").changeMethod("POST").addAction(servletUrl).build());
		$("#form").append(
				new HTMLDivElementBuilder("radio-div").addClass("horizontal container grey-text align-center").build(),
				createInputHiddenElem(contextElems[0]),
				createInputHiddenElem(contextElems[1]),
				createInputHiddenElem(contextElems[2]),
				createBottomButtons("buttons-div", "align-center"));
		$("#radio-div").append(
				createRadioResponse("Yes", "Yes", "response", "space-between"),
				createRadioResponse("No", "No", "response", "space-between"));
		fillTaskContext();
	}
}
