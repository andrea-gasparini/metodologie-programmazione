package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import def.jquery.JQueryXHR;
import def.js.JSON;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;

public class TranslationValidation extends TaskPage 
{
	public static void main(String[] args) { new TranslationValidation(); }
	
	public TranslationValidation()
	{
		super("TRANSLATION_VALIDATION", "Select the correct translation of this word and his definition", new String[] {"Word", "Definition"}, "./translationValidation.jsp");
		$("#box").append(new HTMLFormElementBuilder("form").changeMethod("POST").addAction(servletUrl).build());
		$("#form").append(
				new HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(),
				createBottomButtons("bottom-buttons", "space-between"));
		$("#form-div").append( //TODO inserire le risposte dal dataProvider
				createRadioResponse("test1", "translation"),
				createRadioResponse("test2", "translation"),
				createRadioResponse("test3", "translation"),
				createRadioResponse("Nessuna", "translation"));
		fillTaskContext();
	}
	
	@Override
	protected void fillTaskContext()
	{	
		$.getJSON(REST_URL, "task=" + taskName, (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			for (String elem : contextElems)
			{
				String response = json.$get(elem.toLowerCase());
				$("#" + elem.toLowerCase()).text(response);
			}
			return null;
		});
	}	
}
