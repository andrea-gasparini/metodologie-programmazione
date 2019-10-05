package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLSpanElement;
import jsweet.util.StringTypes;

public class HTMLSpanElementBuilder extends HTMLElementBuilder
{
	private HTMLSpanElement spanElement;
	
	public HTMLSpanElementBuilder() { spanElement = document.createElement(StringTypes.span); }
	
	public HTMLSpanElementBuilder(String id) { this(); addId(id); }
	
	public HTMLSpanElementBuilder addId(String id) { spanElement.id = id; return this; }
	
	public HTMLSpanElementBuilder addClass(String className) { spanElement.className = className; return this; }
	
	public HTMLSpanElementBuilder addText(String text) { spanElement.innerText = text; return this; }
	
	public HTMLSpanElementBuilder addCss(String css) { spanElement.setAttribute("style", css); return this; }
	
	public HTMLSpanElement build() { return spanElement; }
}
