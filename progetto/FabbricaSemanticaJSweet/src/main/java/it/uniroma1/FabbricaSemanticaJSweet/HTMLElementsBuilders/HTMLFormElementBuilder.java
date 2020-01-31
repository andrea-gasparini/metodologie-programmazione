package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import java.util.function.Function;

import def.dom.Event;
import def.dom.HTMLFormElement;
import jsweet.util.StringTypes;

/**
 * La classe HTMLFormElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Form.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLFormElementBuilder extends HTMLElementBuilder
{
	/**
	 * Il form HTML vero e proprio che verra' restituito a seguito della chiamata al
	 * metodo build
	 */
	private HTMLFormElement formElement = document.createElement(StringTypes.form);
	
	/**
	 * Costruisce il Builder del form HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare al form
	 */
	public HTMLFormElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLFormElementBuilder addId(String id) { formElement.id = id; return this; }
	
	@Override
	public HTMLFormElementBuilder addClass(String className) { formElement.className = className; return this; }
	
	/**
	 * Imposta l'indirizzo a cui il form invia i dati
	 * 
	 * @param url indirizzo a cui inviare i dati
	 * @return l'elemento Builder stesso
	 */
	public HTMLFormElementBuilder addAction(String url) { formElement.action = url; return this; }
	
	/**
	 * Imposta il metodo di invio dei dati al server
	 * 
	 * @param method metodo di invio
	 * @return l'elemento Builder stesso
	 */
	public HTMLFormElementBuilder changeMethod(String method) { formElement.method = method; return this; }

	/**
	 * Imposta una funzione che viene richiamata nel momento in cui il form viene
	 * inviato al server
	 * 
	 * @param func funzione da chiamare al momento dell'invio
	 * @return l'elemento Builder stesso
	 */
	public HTMLFormElementBuilder onSubmit(Function<Event, Object> func) { formElement.onsubmit = func; return this; }
	
	@Override
	public HTMLFormElement build() { return formElement; }
}
