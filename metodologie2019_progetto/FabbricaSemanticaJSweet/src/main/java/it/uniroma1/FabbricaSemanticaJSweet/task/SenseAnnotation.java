package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

public class SenseAnnotation extends TaskPage 
{
	public static void main(String[] args) { new SenseAnnotation(); }
	
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