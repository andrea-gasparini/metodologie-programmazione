package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLOptionElement;
import jsweet.util.StringTypes;

/**
 * La classe HTMLOptionElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Option.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLOptionElementBuilder extends HTMLElementBuilder
{
	/**
	 * L'elemento di Opzione HTML vero e proprio che verra' restituito a seguito della chiamata al
	 * metodo build
	 */
	private HTMLOptionElement optionElement = document.createElement(StringTypes.option);
	
	/**
	 * Costruisce il Builder dell'elemento di Opzione HTML
	 */
	public HTMLOptionElementBuilder() {}
	
	/**
	 * Costruisce il Builder dell'elemento di Opzione HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare all'elemento
	 */
	public HTMLOptionElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLOptionElementBuilder addId(String id) { optionElement.id = id; return this; }
	
	@Override
	public HTMLOptionElementBuilder addClass(String className) { optionElement.classList.add(className); return this; }
	
	/**
	 * Imposta il testo dell'elemento di Opzione HTML
	 * 
	 * @param value testo da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLOptionElementBuilder addText(String text) { optionElement.innerText = text; return this; }
	
	/**
	 * Imposta il valore dell'elemento di Opzione HTML
	 * 
	 * @param value valore da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLOptionElementBuilder addValue(String value) { optionElement.value = value; return this; }
	
	@Override
	public HTMLOptionElement build() { return optionElement; }
}
