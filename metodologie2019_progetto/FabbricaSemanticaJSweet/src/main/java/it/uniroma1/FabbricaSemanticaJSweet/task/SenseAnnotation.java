package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.dom.Globals.alert;
import static def.jquery.Globals.$;

import def.dom.Event;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

public class SenseAnnotation extends TaskPage 
{
	public static void main(String[] args) { new SenseAnnotation(); }
	
	public SenseAnnotation()
	{
		super("SENSE_ANNOTATION", "Select the correct meaning of the word in the following sentence", new String[] {"Word", "Sentence"}, "./senseAnnotation.jsp");
		$("#box").append(new HTMLFormElementBuilder("form").changeMethod("POST").addAction(servletUrl).onSubmit(this::checkForm).build());
		$("#form").append(
				new HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(),
				createBottomButtons("bottom-buttons", "space-between"));
		$("#form-div").append( //TODO nella documentazione è scritto che vanno messe delle checkbox ma non ha senso -> chiedere sul gruppo // ho mandato una mail
				createCheckResponse("test1", "checkbox", "sentence"),
				createCheckResponse("test2", "checkbox", "sentence"),
				createCheckResponse("test3", "checkbox", "sentence"),
				createCheckResponse("test4", "checkbox", "sentence"));
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