package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLImageElement;
import jsweet.util.StringTypes;

public class HTMLImageElementBuilder implements HTMLElementBuilder
{
	private HTMLImageElement imageElement;
	
	public HTMLImageElementBuilder() { imageElement = document.createElement(StringTypes.img); }
	
	public HTMLImageElementBuilder(String id) { this(); addId(id); }
	
	public HTMLImageElementBuilder addId(String id) { imageElement.id = id; return this; }
	
	public HTMLImageElementBuilder addClass(String className) { imageElement.className = className; return this; }
	
	public HTMLImageElementBuilder addSrc(String url) { imageElement.src = url; return this; }
	
	public HTMLImageElement build() { return imageElement; }
}
