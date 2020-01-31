package it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders;

import def.dom.HTMLElement;

/**
 * La classe astratta HTMLElementBuilder rappresenta le funzionalita' di base
 * delle classi Builder utilizzate per costruire gli elementi HTML nelle pagine
 * di FabbricaSemantica.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
abstract public class HTMLElementBuilder 
{
	/**
	 * Imposta un ID all'elemento HTML
	 * 
	 * @param id identificatore da assegnare all'elemento
	 * @return l'elemento Builder stesso
	 */
	abstract HTMLElementBuilder addId(String id);

	/**
	 * Imposta una stringa come classi dell'elemento HTML
	 * 
	 * @param className le classi dell'elemento HTML
	 * @return l'elemento Builder stesso
	 */
	abstract HTMLElementBuilder addClass(String className);

	/**
	 * Crea l'elemento HTML vero e proprio
	 * 
	 * @return l'elemento HTML
	 */
	abstract HTMLElement build();
}
