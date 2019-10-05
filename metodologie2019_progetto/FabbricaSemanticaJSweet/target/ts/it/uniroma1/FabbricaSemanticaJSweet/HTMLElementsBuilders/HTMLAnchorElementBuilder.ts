/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * Costruisce il Builder dell'elemento HTML e gli imposta un ID
     * 
     * @param {string} id identificatore da assegnare all'elemento
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
     * @author Andrea Gasparini (1813486)
     */
    export class HTMLAnchorElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * L'elemento HTML vero e proprio che verra' restituito a seguito della chiamata
         * al metodo build
         */
        /*private*/ anchorElement : HTMLAnchorElement = document.createElement("a");

        public constructor(id : string) {
            super();
            this.addId(id);
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder}
         */
        public addId(id : string) : HTMLAnchorElementBuilder {
            this.anchorElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder}
         */
        public addClass(className : string) : HTMLAnchorElementBuilder {
            this.anchorElement.className = className;
            return this;
        }

        /**
         * Imposta l'indirizzo a cui l'elemento rimanda
         * 
         * @param {string} url indirizzo a cui rimandare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder} l'elemento Builder stesso
         */
        public addHref(url : string) : HTMLAnchorElementBuilder {
            this.anchorElement.href = url;
            return this;
        }

        /**
         * Imposta il testo contenuto nell'elemento
         * 
         * @param {string} text testo da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder} l'elemento Builder stesso
         */
        public addText(text : string) : HTMLAnchorElementBuilder {
            this.anchorElement.innerText = text;
            return this;
        }

        /**
         * Imposta una funzione che viene richiamata al click dell'elemento
         * 
         * @param {*} func funzione da chiamare al click
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder} l'elemento Builder stesso
         */
        public onClick(func : (p1: MouseEvent) => any) : HTMLAnchorElementBuilder {
            this.anchorElement.onclick = <any>(func);
            return this;
        }

        /**
         * 
         * @return {HTMLAnchorElement}
         */
        public build() : HTMLAnchorElement {
            return this.anchorElement;
        }
    }
    HTMLAnchorElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder";

}

