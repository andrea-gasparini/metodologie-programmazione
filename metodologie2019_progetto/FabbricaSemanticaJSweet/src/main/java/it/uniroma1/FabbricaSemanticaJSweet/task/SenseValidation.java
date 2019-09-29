package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

public class SenseValidation extends TaskPage
{
	public static void main(String[] args) { new SenseValidation(); }
	
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
