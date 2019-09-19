package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLSelectElement;
import jsweet.util.StringTypes;

public class HTMLSelectElementBuilder implements HTMLElementBuilder
{
	private HTMLSelectElement selectElement;
	
	public HTMLSelectElementBuilder() { selectElement = document.createElement(StringTypes.select); }
	
	public HTMLSelectElementBuilder(String id) { this(); addId(id); }
	
	public HTMLSelectElementBuilder addId(String id) { selectElement.id = id; return this; }
	
	public HTMLSelectElementBuilder addClass(String className) { selectElement.className = className; return this; }
	
	public HTMLSelectElementBuilder addName(String name) { selectElement.name = name; return this; }

	public HTMLSelectElementBuilder addOptionElement(String content) 
	{ 
		selectElement.add(new HTMLOptionElementBuilder().addText(content).addValue(content).build()); 
		return this; 
	}
	
	public HTMLSelectElement build() { return selectElement; }
}
