package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import def.dom.HTMLElement;

abstract public class HTMLElementBuilder  
{
	abstract HTMLElementBuilder addId(String id);
	
	abstract HTMLElementBuilder addClass(String className);
	
	abstract HTMLElement build();
}
