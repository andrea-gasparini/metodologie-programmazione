package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import java.util.function.Function;

import def.dom.HTMLAnchorElement;
import def.dom.MouseEvent;
import jsweet.util.StringTypes;

public class HTMLAnchorElementBuilder implements HTMLElementBuilder
{
	private HTMLAnchorElement anchorElement;
	
	public HTMLAnchorElementBuilder() { anchorElement = document.createElement(StringTypes.a); }
	
	public HTMLAnchorElementBuilder(String id) { this(); addId(id); }
	
	public HTMLAnchorElementBuilder addId(String id) { anchorElement.id = id; return this; }
	
	public HTMLAnchorElementBuilder addClass(String className) { anchorElement.className = className; return this; }
	
	public HTMLAnchorElementBuilder addHref(String url) { anchorElement.href = url; return this; }
	
	public HTMLAnchorElementBuilder addText(String text) { anchorElement.innerText = text; return this; }
	
	public HTMLAnchorElementBuilder onClick(Function<MouseEvent, Object> func) { anchorElement.onclick = func; return this; }
	
	public HTMLAnchorElement build() { return anchorElement; }
}
