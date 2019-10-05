/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * La classe astratta HTMLElementBuilder rappresenta le funzionalita' di base
     * delle classi Builder utilizzate per costruire gli elementi HTML nelle pagine
     * di FabbricaSemantica.
     * 
     * @author Andrea Gasparini (1813486)
     * @class
     */
    export abstract class HTMLElementBuilder {
        /**
         * Imposta un ID all'elemento HTML
         * 
         * @param {string} id identificatore da assegnare all'elemento
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder} l'elemento Builder stesso
         */
        abstract addId(id : string) : HTMLElementBuilder;

        /**
         * Imposta una stringa come classi dell'elemento HTML
         * 
         * @param {string} className le classi dell'elemento HTML
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder} l'elemento Builder stesso
         */
        abstract addClass(className : string) : HTMLElementBuilder;

        /**
         * Crea l'elemento HTML vero e proprio
         * 
         * @return {HTMLElement} l'elemento HTML
         */
        abstract build() : HTMLElement;
    }
    HTMLElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder";

}

