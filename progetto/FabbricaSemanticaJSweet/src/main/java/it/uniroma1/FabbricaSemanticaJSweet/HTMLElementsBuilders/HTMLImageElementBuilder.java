package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLImageElement;
import jsweet.util.StringTypes;

/**
 * La classe HTMLImageElementBuilder rappresenta il builder degli elementi
 * HTML di tipo Image.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class HTMLImageElementBuilder extends HTMLElementBuilder
{
	/**
	 * L'immagine HTML vera e propria che verra' restituita a seguito della chiamata
	 * al metodo build
	 */
	private HTMLImageElement imageElement = document.createElement(StringTypes.img);
	
	/**
	 * Costruisce il Builder dell'immagine HTML e gli imposta un ID
	 * 
	 * @param id identificatore da assegnare all'immagine
	 */
	public HTMLImageElementBuilder(String id) { addId(id); }
	
	@Override
	public HTMLImageElementBuilder addId(String id) { imageElement.id = id; return this; }
	
	@Override
	public HTMLImageElementBuilder addClass(String className) { imageElement.className = className; return this; }
	
	/**
	 * Imposta l'indirizzo in cui e' situato il file dell'immagine
	 * 
	 * @param url indirizzo in cui e' situata l'immagine
	 * @return l'elemento Builder stesso
	 */
	public HTMLImageElementBuilder addSrc(String url) { imageElement.src = url; return this; }
	
	@Override
	public HTMLImageElement build() { return imageElement; }
}
