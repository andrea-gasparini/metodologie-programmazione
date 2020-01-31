package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLSelectElement;
import jsweet.util.StringTypes;

/**
 * La classe HTMLSelectElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Select.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLSelectElementBuilder extends HTMLElementBuilder
{
	/**
	 * Il selettore HTML vero e proprio che verra' restituito a seguito della chiamata al
	 * metodo build
	 */
	private HTMLSelectElement selectElement = document.createElement(StringTypes.select);
	
	/**
	 * Costruisce il Builder del selettore HTML
	 */
	public HTMLSelectElementBuilder() {}
	
	/**
	 * Costruisce il Builder del selettore HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare al selettore
	 */
	public HTMLSelectElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLSelectElementBuilder addId(String id) { selectElement.id = id; return this; }
	
	@Override
	public HTMLSelectElementBuilder addClass(String className) { selectElement.className = className; return this; }
	
	/**
	 * Imposta il nome del selettore HTML
	 * 
	 * @param value nome da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLSelectElementBuilder addName(String name) { selectElement.name = name; return this; }

	/**
	 * Aggiunge un elemento di Opzione al selettore HTML
	 * 
	 * @param content testo da impostare come testo e valore dell'Opzione HTML
	 * @return l'elemento Builder stesso
	 */
	public HTMLSelectElementBuilder addOptionElement(String content) 
	{ 
		selectElement.add(new HTMLOptionElementBuilder().addText(content).addValue(content).build()); 
		return this; 
	}
	
	@Override
	public HTMLSelectElement build() { return selectElement; }
}
