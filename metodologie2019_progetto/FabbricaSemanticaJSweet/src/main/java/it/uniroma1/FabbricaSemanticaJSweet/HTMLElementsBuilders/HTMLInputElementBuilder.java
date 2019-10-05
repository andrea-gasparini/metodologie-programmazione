package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLInputElement;
import jsweet.util.StringTypes;

/**
 * La classe HTMLInputElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Input.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLInputElementBuilder extends HTMLElementBuilder
{
	/**
	 * L'elemento di Input HTML vero e proprio che verra' restituito a seguito della chiamata al
	 * metodo build
	 */
	private HTMLInputElement inputElement = document.createElement(StringTypes.input);
	
	/**
	 * Costruisce il Builder dell'elemento di Input HTML
	 */
	public HTMLInputElementBuilder() {}
	
	/**
	 * Costruisce il Builder dell'elemento di Input HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare all'elemento
	 */
	public HTMLInputElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLInputElementBuilder addId(String id) { inputElement.id = id; return this; }
	
	@Override
	public HTMLInputElementBuilder addClass(String className) { inputElement.className = className; return this; }
	
	/**
	 * Imposta il tipo dell'elemento di Input HTML
	 * 
	 * @param type tipo da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLInputElementBuilder addType(String type) { inputElement.type = type; return this; }
	
	/**
	 * Imposta l'elemento di Input HTML come "richiesto" all'interno per poter
	 * procedere all'invio del form in cui e' contenuto
	 * 
	 * @return l'elemento Builder stesso
	 */
	public HTMLInputElementBuilder isRequired() { inputElement.required = true; return this; }
	
	/**
	 * Imposta il valore dell'elemento di Input HTML
	 * 
	 * @param value valore da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLInputElementBuilder addValue(String value) { inputElement.value = value; return this; }
	
	/**
	 * Imposta il nome dell'elemento di Input HTML
	 * 
	 * @param name nome da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLInputElementBuilder addName(String name) { inputElement.name = name; return this; }
	
	@Override
	public HTMLInputElement build() { return inputElement; }
}
