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

/**
 * La classe TaskPage rappresenta una pagina di annotazione o validazione.
 * Contiene il titolo con la spiegazione del Task e le etichette relative ai
 * dati forniti dal sistema in base ai quali l'utente dovra' fornire il
 * responso.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class TaskPage extends FabbricaSemanticaPage
{
	/**
	 * Indirizzo della servlet che si occupa di fornire i dati a seconda del Task
	 */
	public static final String REST_URL = "./nextExample.jsp";
	
	/**
	 * Indirizzo della servlet che si occupa di registrare i dati nella base di dati
	 */
	protected String servletUrl;
	
	/**
	 * Nome del Task
	 */
	protected String taskName;
	
	/**
	 * Etichette degli elementi di contesto che verranno forniti dal sistema
	 */
	protected String[] contextElems;
	
	/**
	 * Costruisce la pagina con un titolo relativo al funzionamento del Task e con
	 * le etichette degli elementi di contesto relative ai dati che verranno forniti
	 * dal sistema.
	 * 
	 * @param taskName nome del Task
	 * @param title titolo esplicativo del funzionamento
	 * @param contextElems etichette degli elementi di contesto
	 * @param servletUrl indirizzo della servlet che si occupa di registrare i dati
	 */
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
	
	/**
	 * Aggiunge alla pagina un elemento di Input per inserire il responso da
	 * tastiera e i pulsanti per inviare o saltare il Task. Aggiunge al Task gli
	 * elementi di contesto reperiti dal back-end tramite la Servlet.
	 */
	protected void createBasicTask()
	{
		$("#box").append(new HTMLDivElementBuilder("div-form").addClass("horizontal container").build());
		$("#div-form").append(
				new HTMLFormElementBuilder("form-1").addClass("horizontal container width-90").changeMethod("POST").addAction(servletUrl).build(),
				new HTMLAnchorElementBuilder("button-2").addHref(servletUrl).build());
		$("#form-1").append(
				new HTMLInputElementBuilder().addClass("form-field").isRequired().addName("response").build(),
				new HTMLInputElementBuilder("fixd-margin-top").addType("submit").addName("submit").addValue("NEXT").build());
		$("#button-2").append(new HTMLButtonElementBuilder("form-button").addName("submit").addValue("SKIP").addText("SKIP").build());
		
		fillTaskContext();
	}
	
	/**
	 * Crea un elemento HTML contenente un Input di tipo Radio per la selezione e un
	 * elemento Span come sua etichetta.
	 * 
	 * @param id identificatore di entrambi gli elementi
	 * @param text testo da impostare come etichetta e valore dell'Input Radio
	 * @param name nome dell'elemento Input
	 * @param justifyContent classe css da aggiungere a quelle standard dell'elemento
	 * @return l'elemento Div contenente l'Input e lo Span
	 */
	protected HTMLDivElement createRadioResponse(String id, String text, String name, String justifyContent)
	{
		HTMLDivElement elem = new HTMLDivElementBuilder().addClass("horizontal container radio-div " + justifyContent).build();
		$(elem).append(
				new HTMLInputElementBuilder(id + "-radio").isRequired().addType("radio").addName(name).addValue(text).build(),
				new HTMLSpanElementBuilder(id).addClass("form-text").addText(text).build());
		return elem;
	}
	
	/**
	 * Crea un elemento HTML contenente un Input di tipo Radio per la selezione e un
	 * elemento Span come sua etichetta.
	 * 
	 * @param id identificatore di entrambi gli elementi
	 * @param text testo da impostare come etichetta e valore dell'Input Radio
	 * @param name nome dell'elemento Input
	 * @return l'elemento Div contenente l'Input e lo Span
	 */
	protected HTMLDivElement createRadioResponse(String id, String text, String name) { return createRadioResponse(id, text, name, ""); }
	
	/**
	 * Crea un elemento HTML contenente un Input di tipo Radio per la selezione e un
	 * elemento Span senza testo come sua etichetta vuota.
	 * 
	 * @param id identificatore di entrambi gli elementi
	 * @param name nome dell'elemento Input
	 * @return l'elemento Div contenente l'Input e lo Span
	 */
	protected HTMLDivElement createRadioResponse(String id, String name) { return createRadioResponse(id, "", name, ""); }
	
	/**
	 * Crea un elemento HTML contenente i pulsanti che permettono di inviare e
	 * saltare il Task. Da utilizzare a fondo pagina.
	 * 
	 * @param divId identificatore dell'elemento che contiene i pulsanti
	 * @param justifyContent classe css da aggiungere a quelle standard dell'elemento
	 * @return l'elemento Div contenente i pulsanti
	 */
	protected HTMLDivElement createBottomButtons(String divId, String justifyContent)
	{
		HTMLDivElement elem = new HTMLDivElementBuilder(divId).addClass("horizontal container " + justifyContent).build();
		HTMLAnchorElement secondButton = new HTMLAnchorElementBuilder("skip-button").addHref(servletUrl).build();
		$(elem).append(new HTMLInputElementBuilder("next-button").isRequired().addType("submit").addName("submit").addValue("NEXT").build(), secondButton);
		$(secondButton).append(new HTMLButtonElementBuilder("form-button").addName("submit").addValue("SKIP").addType("button").addText("SKIP").build());
		return elem;
	}
	
	/**
	 * Crea un elemento di Input HTML di tipo nascosto che non verrà quindi mostrato visivamente.
	 * 
	 * @param contextElem testo impostato come nome dell'elemento e concatenato a "-hidden" anche come identificatore
	 * @return l'elemento Input HTML hidden
	 */
	protected HTMLInputElement createInputHiddenElem(String contextElem)
	{
		return new HTMLInputElementBuilder(contextElem.toLowerCase() + "-hidden").addName(contextElem.toLowerCase()).addType("hidden").build();
	}
	
	/**
	 * Aggiunge al Task gli elementi di contesto reperiti dal back-end tramite la Servlet.
	 */
	protected void fillTaskContext()
	{	
		$.getJSON(REST_URL, "task=" + taskName, (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			for (String elem : contextElems)
			{
				String text = json.$get(elem.toLowerCase());
				$("#" + elem.toLowerCase()).text(text);
				$("#" + elem.toLowerCase() + "-hidden").val(text);
			}
			return null;
		});
	}
	
	/**
	 * Aggiunge al Task gli elementi di contesto e le risposte possibili, reperiti
	 * dal back-end tramite la Servlet.
	 * 
	 * @param responsesName nome identificativo delle risposte per reperirle dal JSON nel back-end
	 * @param nResponses numero delle risposte presenti nel Task
	 */
	protected void fillTaskContext(String responsesName, int nResponses)
	{	
		$.getJSON(REST_URL, "task=" + taskName, (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			for (String elem : contextElems)
			{
				String text = json.$get(elem.toLowerCase());
				$("#" + elem.toLowerCase()).text(text);
				$("#" + elem.toLowerCase() + "-hidden").val(text);
			}
			String[] senses = json.$get(responsesName);
			for (int i = 1; i <= nResponses; i++)
			{
				$("#response-" + i).text(senses[i-1]);
				$("#response-" + i + "-radio").val(senses[i-1]);
			}
			return null;
		});
	}	
}
