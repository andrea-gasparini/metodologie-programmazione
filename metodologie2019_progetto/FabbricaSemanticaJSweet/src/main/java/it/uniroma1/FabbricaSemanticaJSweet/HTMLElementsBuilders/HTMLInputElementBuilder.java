package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLInputElement;
import jsweet.util.StringTypes;

public class HTMLInputElementBuilder implements HTMLElementBuilder
{
	private HTMLInputElement inputElement;
	
	public HTMLInputElementBuilder() { inputElement = document.createElement(StringTypes.input); }
	
	public HTMLInputElementBuilder(String id) { this(); addId(id); }
	
	public HTMLInputElementBuilder addId(String id) { inputElement.id = id; return this; }
	
	public HTMLInputElementBuilder addClass(String className) { inputElement.className = className; return this; }
	
	public HTMLInputElementBuilder addType(String type) { inputElement.type = type; return this; }
	
	public HTMLInputElementBuilder isRequired() { inputElement.required = true; return this; }
	
	public HTMLInputElementBuilder addValue(String value) { inputElement.value = value; return this; }
	
	public HTMLInputElementBuilder addName(String name) { inputElement.name = name; return this; }
	
	public HTMLInputElement build() { return inputElement; }
}
