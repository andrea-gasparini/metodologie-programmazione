package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import static def.dom.Globals.document;

import def.dom.HTMLHeadingElement;
import jsweet.util.StringTypes;

public class HTMLHeadingElementBuilder implements HTMLElementBuilder
{
	private HTMLHeadingElement headingElement;
	
	public HTMLHeadingElementBuilder() { this(1); }
	
	public HTMLHeadingElementBuilder(String id) { this(1, id); }
	
	public HTMLHeadingElementBuilder(int headingDimension, String id) { this(headingDimension); addId(id); }
	
	public HTMLHeadingElementBuilder(int headingDimension) 
	{ 
		headingElement = headingDimension == 1 ? document.createElement(StringTypes.h1) : document.createElement(StringTypes.h2);
	}
	
	public HTMLHeadingElementBuilder addId(String id) { headingElement.id = id; return this; }
	
	public HTMLHeadingElementBuilder addClass(String className) { headingElement.className = className; return this; }
	
	public HTMLHeadingElementBuilder addText(String text) { headingElement.innerText = text; return this; }
	
	public HTMLHeadingElement toHTMLElement() { return headingElement; }
}