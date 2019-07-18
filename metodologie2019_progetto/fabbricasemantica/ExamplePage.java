import static def.dom.Globals.console;
import static def.dom.Globals.document;
import static def.jquery.Globals.$;

import def.dom.HTMLDivElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;
import def.dom.HTMLTextAreaElement;
import def.jquery.JQueryXHR;
import def.js.JSON;
import jsweet.util.StringTypes;


/**
 * La vostra implementazione delle pagine dovrebbe essere modulare
 * e non un unico grande main() 
 * */
public class ExamplePage {
	
	public static final String SERVLET_URL = "example.jsp";
	public static final String REST_URL = "nextExample.jsp";
	
	public static void main(String[] args) {
		//creaiamo una form, che e' il contenitore di tutti i pulsanti, caselle di testo, ecc.
		console.log("Creating form");
		HTMLFormElement form = document.createElement(StringTypes.form); //creiamo l'oggetto form
		form.action = SERVLET_URL; //impostiamo a quale URL inviare i dati quando premiamo "Invio" o un pulsante submit.
		form.method = "POST"; //usare sempre POST come metodo
		console.log("Form Done");
		
		//creiamo una etichetta che contiene la descrizione
		console.log("creating desct");
		HTMLLabelElement description = document.createElement(StringTypes.label);
		description.className =  "form-control-plaintext"; //l'attributo className permette a bootstrap di formattare meglio gli elementi
		description.setAttribute("style", "font-weight:bold"); //mettiamo la descrizione in BOLD
		//oppure, in alternativa alla riga sopra possiamo usare la riga sotto
		//$(description).css("font-weight", "bold");
		
		//una etichetta che contiene la parola
		console.log("creating word");
		HTMLLabelElement word = document.createElement(StringTypes.label);
		word.className =  "form-control-plaintext";
		
		console.log("creating translation");
		HTMLTextAreaElement translation = document.createElement(StringTypes.textarea);
		translation.name = "translation"; //lato backend usiamo l'attributo name per ottenere l'input inserito dall'utente: request.getParameter("translation")
		translation.className =  "form-control";
		translation.placeholder = "Scrivi la traduzione qui...";

		HTMLInputElement submit = document.createElement(StringTypes.input);
		submit.type = "submit";
		submit.name = "submit_button";
		submit.className =  "btn btn-primary";
		submit.value = "Avanti";

		HTMLInputElement skip = document.createElement(StringTypes.input);
		skip.type = "submit";
		skip.name = "skip_button";
		skip.className =  "btn btn-primary";
		skip.value = "Skip";
		$(skip).css("float", "right"); //il pulsante skip sara' messo piu' a destra possibile
		
		// ---------------PRENDIAMO L'ESEMPIO DAL SERVER ------------------- 
		//Object result e' il nostro oggetto JSON
		$.getJSON(REST_URL, "task=TRANSLATION_ANNOTATION", (Object result, String a, JQueryXHR ctx) -> {
			JSON json = (JSON) result;
			String sWord = json.$get("word"); //i.e. json.get("word")
			String sDescription = json.$get("description"); //i.e. json.get("description")
			$(word).text(sWord);
			$(description).text(sDescription);
			return null;
		});
		
		
		//---------------FORMATTIAMO LA PAGINA CON BOOTSTRAP -------------------
		//per formattare meglio la pagina si usano dei contenitori chiamati <div>
		//in bootstrap ogni div con calsse form-group viene visualizzato come blocco separato, uno sotto l'altro
		HTMLDivElement divWord = document.createElement(StringTypes.div);
		divWord.className = "form-group";
		$(divWord).append(word);

		HTMLDivElement divDescription = document.createElement(StringTypes.div);
		divDescription.className = "form-group";
		$(divDescription).append(description);
		
		HTMLDivElement divTranslation = document.createElement(StringTypes.div);
		divTranslation.className = "form-group";
		HTMLLabelElement label = document.createElement(StringTypes.label);
		label.textContent = "Traduzione:";
		$(divTranslation).append(label);
		$(divTranslation).append(translation);
		
		HTMLDivElement divButtons= document.createElement(StringTypes.div);
		divButtons.className = "form-group";
		$(divButtons).append(submit, skip);
		
		$(form).css("margin", "0% 1.5%"); // mettiamo un po' di spazio ai lati dx e sx della form e 0% di spazio sopra e sotto 
		
		console.log("adding to form");
		// aggiungiamo tutti gli elementi alla form, l'ordine e' importante
		$(form).append(divWord);
		$(form).append(divDescription);
		$(form).append(divTranslation);
		$(form).append(divButtons);
		console.log("adding to body");
		//aggiungiamo la form al corpo della pagina
		$("body").append(form);
	}
	

}
