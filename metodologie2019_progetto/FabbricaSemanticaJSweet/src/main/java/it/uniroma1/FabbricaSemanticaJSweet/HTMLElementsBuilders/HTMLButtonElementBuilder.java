package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLButtonElement;
import jsweet.util.StringTypes;

public class HTMLButtonElementBuilder implements HTMLElementBuilder
{
	HTMLButtonElement buttonElement;
	
	public HTMLButtonElementBuilder() { buttonElement = document.createElement(StringTypes.button); }
	
	public HTMLButtonElementBuilder(String id) { this(); addId(id); }
	
	public HTMLButtonElementBuilder addId(String id) { buttonElement.id = id; return this; }
	
	public HTMLButtonElementBuilder addClass(String className) { buttonElement.className = className; return this; }
	
	public HTMLButtonElementBuilder addText(String text) { buttonElement.innerText = text; return this; }

	public HTMLButtonElementBuilder addType(String type) { buttonElement.type = type; return this; }
	
	public HTMLButtonElement build() { return buttonElement; }
}
