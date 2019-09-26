package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLInputElement;
import def.jquery.JQueryXHR;
import def.js.JSON;
import it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage;
import it.uniroma1.FabbricaSemanticaJSweet.PageType;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder;

public class TaskPage extends FabbricaSemanticaPage
{
	public static final String REST_URL = "./nextExample.jsp";
	
	protected String servletUrl;
	
	protected String taskName;
	
	protected String[] contextElems;
	
	public TaskPage(String taskName, String title, String[] contextElems, String servletUrl) 
	{ 
		super(PageType.TASK_PAGE);
		this.servletUrl = servletUrl;
		this.taskName = taskName;
		this.contextElems = contextElems;
		$("#page").append(new HTMLDivElementBuilder("box").addClass("vertical container").build());
		$("#box").append(
				new HTMLHeadingElementBuilder(3).addText(title).build(),
				new HTMLDivElementBuilder("first-div").addClass("bold-text").build());
		$("#first-div").append(
				new HTMLSpanElementBuilder().addText(contextElems[0] + ": ").build(),
				new HTMLSpanElementBuilder(contextElems[0].toLowerCase()).addClass("grey-text").build());
		for (int i = 1; i < contextElems.length; i++)
		{
			HTMLDivElement otherDiv = new HTMLDivElementBuilder("second-div").build(); 
			$("#box").append(otherDiv);
			$(otherDiv).append(
					new HTMLSpanElementBuilder().addClass("bold-text").addText(contextElems[i] + ": ").build(),
					new HTMLSpanElementBuilder(contextElems[i].toLowerCase()).addClass("grey-text").build());
		}
	}	
	
	protected void createBasicTask()
	{
		$("#box").append(new HTMLDivElementBuilder("div-form").addClass("horizontal container").build());
		$("#div-form").append(
				new HTMLFormElementBuilder("form-1").addClass("horizontal container width-90").changeMethod("POST").addAction(servletUrl).build(),
				new HTMLAnchorElementBuilder("button-2").addHref(servletUrl).build());
		$("#form-1").append(
				new HTMLInputElementBuilder().addClass("form-field").isRequired().addName("translation").build(),
				new HTMLInputElementBuilder("fixd-margin-top").addType("submit").addName("submit").addValue("NEXT").build());
		$("#button-2").append(new HTMLButtonElementBuilder("form-button").addName("submit").addValue("SKIP").addText("SKIP").build());
		
		fillTaskContext();
	}
	
	protected HTMLDivElement createRadioResponse(String id, String text, String name, String justifyContent)
	{
		HTMLDivElement elem = new HTMLDivElementBuilder().addClass("horizontal container radio-div " + justifyContent).build();
		$(elem).append(
				new HTMLInputElementBuilder().isRequired().addType("radio").addName(name).build(),
				new HTMLSpanElementBuilder(id).addClass("form-text").addText(text).build());
		return elem;
	}
	
	protected HTMLDivElement createRadioResponse(String id, String text, String name) { return createRadioResponse(id, text, name, ""); }

	protected HTMLDivElement createBottomButtons(String divId, String justifyContent)
	{
		HTMLDivElement elem = new HTMLDivElementBuilder(divId).addClass("horizontal container " + justifyContent).build();
		HTMLAnchorElement secondButton = new HTMLAnchorElementBuilder("skip-button").addHref(servletUrl).build();
		$(elem).append(new HTMLInputElementBuilder().isRequired().addType("submit").addName("submit").addValue("NEXT").build(), secondButton);
		$(secondButton).append(new HTMLButtonElementBuilder("form-button").addName("submit").addValue("SKIP").addType("button").addText("SKIP").build());
		return elem;
	}
	
	protected HTMLInputElement createInputHiddenElem(int contextElemIndex)
	{
		return new HTMLInputElementBuilder(contextElems[contextElemIndex].toLowerCase() + "-hidden").addName(contextElems[contextElemIndex].toLowerCase()).addType("hidden").build();
	}
	
	protected void fillTaskContext()
	{	
		$.getJSON(REST_URL, "task=" + taskName, (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			for (String elem : contextElems)
			{
				String response = json.$get(elem.toLowerCase());
				$("#" + elem.toLowerCase()).text(response);
				$("#" + elem.toLowerCase() + "-hidden").val(response);
			}
			return null;
		});
	}
	
	protected void fillTaskContext(String responsesName, int nResponses)
	{	
		$.getJSON(REST_URL, "task=" + taskName, (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			for (String elem : contextElems)
			{
				String response = json.$get(elem.toLowerCase());
				$("#" + elem.toLowerCase()).text(response);
				$("#" + elem.toLowerCase() + "-hidden").val(response);
			}
			String[] senses = json.$get(responsesName);
			for (int i = 1; i <= nResponses; i++)
				$("#response-" + i).text(senses[i-1]);
			
			return null;
		});
	}	
}
