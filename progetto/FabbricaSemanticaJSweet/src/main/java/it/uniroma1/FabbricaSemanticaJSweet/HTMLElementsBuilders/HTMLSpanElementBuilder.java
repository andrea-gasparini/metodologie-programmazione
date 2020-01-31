package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLSpanElement;
import jsweet.util.StringTypes;

public class HTMLSpanElementBuilder extends HTMLElementBuilder
{
	/**
	 * L'elemento HTML vero e proprio che verra' restituito a seguito della chiamata
	 * al metodo build
	 */
	private HTMLSpanElement spanElement = document.createElement(StringTypes.span);
	
	/**
	 * Costruisce il Builder dell'elemento HTML
	 */
	public HTMLSpanElementBuilder() {}
	
	/**
	 * Costruisce il Builder dell'elemento HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare all'elemento
	 */
	public HTMLSpanElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLSpanElementBuilder addId(String id) { spanElement.id = id; return this; }

	@Override
	public HTMLSpanElementBuilder addClass(String className) { spanElement.className = className; return this; }
	
	/**
	 * Imposta il testo dell'elemento HTML
	 * 
	 * @param value testo da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLSpanElementBuilder addText(String text) { spanElement.innerText = text; return this; }
	
	/**
	 * Imposta una stringa come css dell'elemento HTML
	 * 
	 * @param css il css dell'elemento HTML
	 * @return l'elemento Builder stesso
	 */
	public HTMLSpanElementBuilder addCss(String css) { spanElement.setAttribute("style", css); return this; }
	
	@Override
	public HTMLSpanElement build() { return spanElement; }
}
