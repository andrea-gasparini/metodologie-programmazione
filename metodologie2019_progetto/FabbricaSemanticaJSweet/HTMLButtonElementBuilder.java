package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLButtonElement;
import jsweet.util.StringTypes;

public class HTMLButtonElementBuilder
{
	HTMLButtonElement buttonElement;
	
	public HTMLButtonElementBuilder() { buttonElement = document.createElement(StringTypes.button); }
	
	public HTMLButtonElementBuilder(String id) { this(); addId(id); }
	
	public HTMLButtonElementBuilder addId(String id) { buttonElement.id = id; return this; }
	
	public HTMLButtonElementBuilder addClass(String className) { buttonElement.className = className; return this; }
	
	public HTMLButtonElementBuilder addText(String text) { buttonElement.innerText = text; return this; }
	
	public HTMLButtonElement toHTMLElement() { return buttonElement; }
}
