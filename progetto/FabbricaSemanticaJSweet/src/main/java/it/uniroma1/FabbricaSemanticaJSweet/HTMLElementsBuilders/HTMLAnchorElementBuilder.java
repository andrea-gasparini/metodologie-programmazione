package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import java.util.function.Function;

import def.dom.HTMLAnchorElement;
import def.dom.MouseEvent;
import jsweet.util.StringTypes;

/**
 * La classe HTMLAnchorElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Anchor.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLAnchorElementBuilder extends HTMLElementBuilder
{
	/**
	 * L'elemento HTML vero e proprio che verra' restituito a seguito della chiamata
	 * al metodo build
	 */
	private HTMLAnchorElement anchorElement = document.createElement(StringTypes.a);
	
	/**
	 * Costruisce il Builder dell'elemento HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare all'elemento 
	 */
	public HTMLAnchorElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLAnchorElementBuilder addId(String id) { anchorElement.id = id; return this; }
	
	@Override
	public HTMLAnchorElementBuilder addClass(String className) { anchorElement.className = className; return this; }
	
	/**
	 * Imposta l'indirizzo a cui l'elemento rimanda
	 * 
	 * @param url indirizzo a cui rimandare
	 * @return l'elemento Builder stesso
	 */
	public HTMLAnchorElementBuilder addHref(String url) { anchorElement.href = url; return this; }
	
	/**
	 * Imposta il testo contenuto nell'elemento
	 * 
	 * @param text testo da impostare
	 * @return l'elemento Builder stesso
	 */
	public HTMLAnchorElementBuilder addText(String text) { anchorElement.innerText = text; return this; }
	
	/**
	 * Imposta una funzione che viene richiamata al click dell'elemento
	 * 
	 * @param func funzione da chiamare al click
	 * @return l'elemento Builder stesso
	 */
	public HTMLAnchorElementBuilder onClick(Function<MouseEvent, Object> func) { anchorElement.onclick = func; return this; }
	
	@Override
	public HTMLAnchorElement build() { return anchorElement; }
}
