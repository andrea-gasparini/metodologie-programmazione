package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLOptionElement;
import jsweet.util.StringTypes;

public class HTMLOptionElementBuilder implements HTMLElementBuilder
{
	private HTMLOptionElement optionElement;
	
	public HTMLOptionElementBuilder() { optionElement = document.createElement(StringTypes.option); }
	
	public HTMLOptionElementBuilder(String id) { this(); addId(id); }
	
	public HTMLOptionElementBuilder addId(String id) { optionElement.id = id; return this; }
	
	public HTMLOptionElementBuilder addClass(String className) { optionElement.classList.add(className); return this; }
	
	public HTMLOptionElementBuilder addText(String text) { optionElement.innerText = text; return this; }
	
	public HTMLOptionElement toHTMLElement() { return optionElement; }
}
