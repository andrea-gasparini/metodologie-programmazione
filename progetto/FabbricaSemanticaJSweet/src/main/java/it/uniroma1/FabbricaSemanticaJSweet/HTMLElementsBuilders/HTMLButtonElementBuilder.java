package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLButtonElement;
import jsweet.util.StringTypes;

/**
 * La classe HTMLButtonElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Button.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLButtonElementBuilder extends HTMLElementBuilder
{
	/**
	 * Il pulsante HTML vero e proprio che verra' restituito a seguito della chiamata
	 * al metodo build
	 */
	HTMLButtonElement buttonElement = document.createElement(StringTypes.button);
	
	/**
	 * Costruisce il Builder del pulsante HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare al pulsante 
	 */
	public HTMLButtonElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLButtonElementBuilder addId(String id) { buttonElement.id = id; return this; }
	
	@Override
	public HTMLButtonElementBuilder addClass(String className) { buttonElement.className = className; return this; }
	
	/**
	 * Imposta l'etichetta del pulsante HTML
	 * 
	 * @param text testo da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLButtonElementBuilder addText(String text) { buttonElement.innerText = text; return this; }

	/**
	 * Imposta il tipo del pulsante HTML 
	 * 
	 * @param type tipo da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLButtonElementBuilder addType(String type) { buttonElement.type = type; return this; }
	
	/**
	 * Imposta il valore del pulsante HTML
	 * 
	 * @param value valore da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLButtonElementBuilder addValue(String value) { buttonElement.value = value; return this; }
	
	/**
	 * Imposta il nome del pulsante HTML
	 * 
	 * @param name nome da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLButtonElementBuilder addName(String name) { buttonElement.name = name; return this; }
	
	@Override
	public HTMLButtonElement build() { return buttonElement; }
}
