package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import java.util.function.Function;

import def.dom.Event;
import def.dom.HTMLFormElement;
import jsweet.util.StringTypes;

public class HTMLFormElementBuilder extends HTMLElementBuilder
{
	private HTMLFormElement formElement;
	
	public HTMLFormElementBuilder() { formElement = document.createElement(StringTypes.form); }
	
	public HTMLFormElementBuilder(String id) { this(); addId(id); }
	
	public HTMLFormElementBuilder addId(String id) { formElement.id = id; return this; }
	
	public HTMLFormElementBuilder addClass(String className) { formElement.className = className; return this; }
	
	public HTMLFormElementBuilder addAction(String action) { formElement.action = action; return this; }
	
	public HTMLFormElementBuilder changeMethod(String method) { formElement.method = method; return this; }
	
	public HTMLFormElementBuilder onSubmit(Function<Event, Object> func) { formElement.onsubmit = func; return this; }
	
	public HTMLFormElement build() { return formElement; }
}
