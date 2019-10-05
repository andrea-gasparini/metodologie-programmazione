package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLDivElement;
import jsweet.util.StringTypes;

/**
 * La classe HTMLDivElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Div.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLDivElementBuilder extends HTMLElementBuilder
{
	/**
	 * L'elemento HTML vero e proprio che verra' restituito a seguito della chiamata
	 * al metodo build
	 */
	private HTMLDivElement divElement = document.createElement(StringTypes.div);
	
	/**
	 * Costruisce il Builder dell'elemento HTML
	 */
	public HTMLDivElementBuilder() {}
	
	/**
	 * Costruisce il Builder dell'elemento HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare all'elemento
	 */
	public HTMLDivElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLDivElementBuilder addId(String id) { divElement.id = id; return this; }
	
	@Override
	public HTMLDivElementBuilder addClass(String className) { divElement.className = className; return this; }
	
	@Override
	public HTMLDivElement build() { return divElement; }
}
