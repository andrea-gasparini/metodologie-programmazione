package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import def.dom.HTMLElement;

public interface HTMLElementBuilder  
{
	HTMLElementBuilder addId(String id);
	
	HTMLElementBuilder addClass(String className);
	
	HTMLElement build();
}
