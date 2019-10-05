/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * Costruisce il Builder del pulsante HTML e gli imposta un ID
     * 
     * @param {string} id identificatore da assegnare al pulsante
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
     * @author Andrea Gasparini (1813486)
     */
    export class HTMLButtonElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * Il pulsante HTML vero e proprio che verra' restituito a seguito della chiamata
         * al metodo build
         */
        buttonElement : HTMLButtonElement = document.createElement("button");

        public constructor(id : string) {
            super();
            this.addId(id);
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder}
         */
        public addId(id : string) : HTMLButtonElementBuilder {
            this.buttonElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder}
         */
        public addClass(className : string) : HTMLButtonElementBuilder {
            this.buttonElement.className = className;
            return this;
        }

        /**
         * Imposta l'etichetta del pulsante HTML
         * 
         * @param {string} text testo da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder} l'elemento Builder stesso
         */
        public addText(text : string) : HTMLButtonElementBuilder {
            this.buttonElement.innerText = text;
            return this;
        }

        /**
         * Imposta il tipo del pulsante HTML
         * 
         * @param {string} type tipo da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder} l'elemento Builder stesso
         */
        public addType(type : string) : HTMLButtonElementBuilder {
            this.buttonElement.type = type;
            return this;
        }

        /**
         * Imposta il valore del pulsante HTML
         * 
         * @param {string} value valore da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder} l'elemento Builder stesso
         */
        public addValue(value : string) : HTMLButtonElementBuilder {
            this.buttonElement.value = value;
            return this;
        }

        /**
         * Imposta il nome del pulsante HTML
         * 
         * @param {string} name nome da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder} l'elemento Builder stesso
         */
        public addName(name : string) : HTMLButtonElementBuilder {
            this.buttonElement.name = name;
            return this;
        }

        /**
         * 
         * @return {HTMLButtonElement}
         */
        public build() : HTMLButtonElement {
            return this.buttonElement;
        }
    }
    HTMLButtonElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder";

}

