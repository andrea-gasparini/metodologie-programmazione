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
				createBottomButtons("bottom-buttons", "space-between"));
		$("#form-div").append( //TODO nella documentazione c'è scritto checkbox e non radio, in caso basta cambiare il metodo
				createRadioResponse("test1", "sentence"),
				createRadioResponse("test2", "sentence"),
				createRadioResponse("test3", "sentence"),
				createRadioResponse("test4", "sentence"));
		fillTaskContext();
	}
}