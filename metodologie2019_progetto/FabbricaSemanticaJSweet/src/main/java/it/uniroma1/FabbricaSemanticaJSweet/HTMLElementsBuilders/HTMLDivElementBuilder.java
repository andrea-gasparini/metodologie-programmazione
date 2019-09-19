package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLDivElement;
import jsweet.util.StringTypes;

public class HTMLDivElementBuilder implements HTMLElementBuilder
{
	private HTMLDivElement divElement;
	
	public HTMLDivElementBuilder() { divElement = document.createElement(StringTypes.div); }
	
	public HTMLDivElementBuilder(String id) { this(); addId(id); }
	
	public HTMLDivElementBuilder addId(String id) { divElement.id = id; return this; }
	
	public HTMLDivElementBuilder addClass(String className) { divElement.className = className; return this; }
	
	public HTMLDivElement build() { return divElement; }
}
