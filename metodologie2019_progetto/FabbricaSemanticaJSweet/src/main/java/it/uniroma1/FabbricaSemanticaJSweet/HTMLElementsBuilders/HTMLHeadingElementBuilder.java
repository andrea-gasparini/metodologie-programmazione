package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLHeadingElement;
import jsweet.util.StringTypes;

/**
 * La classe HTMLHeadingElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Heading.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLHeadingElementBuilder extends HTMLElementBuilder
{
	/**
	 * Il titolo HTML vero e proprio che verra' restituito a seguito della chiamata al
	 * metodo build
	 */
	private HTMLHeadingElement headingElement;
	
	/**
	 * Costruisce il Builder del titolo HTML con grandezza 1
	 */
	public HTMLHeadingElementBuilder() { this(1); }
	
	/**
	 * Costruisce il Builder del titolo HTML con grandezza 1 e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare al titolo
	 */
	public HTMLHeadingElementBuilder(String id) { this(1, id); }
	
	/**
	 * Costruisce il Builder del titolo HTML con la grandezza passata come parametro
	 * e gli imposta un ID
	 * 
	 * @param headingDimension grandezza del titolo
	 * @param id identificatore da assegnare al titolo
	 */
	public HTMLHeadingElementBuilder(int headingDimension, String id) { this(headingDimension); addId(id); }
	
	/**
	 * Costruisce il Builder del titolo HTML con la grandezza passata come parametro
	 * 
	 * @param headingDimension grandezza del titolo
	 */
	public HTMLHeadingElementBuilder(int headingDimension) 
	{ 
		headingElement = headingDimension == 1 ? document.createElement(StringTypes.h1) : 
			headingDimension == 2 ? document.createElement(StringTypes.h2) : document.createElement(StringTypes.h3);
	}
	
	@Override
	public HTMLHeadingElementBuilder addId(String id) { headingElement.id = id; return this; }
	
	@Override
	public HTMLHeadingElementBuilder addClass(String className) { headingElement.className = className; return this; }
	
	/**
	 * Imposta il testo del titolo
	 * 
	 * @param text testo del titolo
	 * @return l'elemento Builder stesso
	 */
	public HTMLHeadingElementBuilder addText(String text) { headingElement.innerText = text; return this; }
	
	@Override
	public HTMLHeadingElement build() { return headingElement; }
}
