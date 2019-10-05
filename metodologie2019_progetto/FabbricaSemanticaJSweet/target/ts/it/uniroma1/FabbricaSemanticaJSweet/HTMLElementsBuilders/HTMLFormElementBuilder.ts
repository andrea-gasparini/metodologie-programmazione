/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * Costruisce il Builder del form HTML e gli imposta un ID
     * 
     * @param {string} id identificatore da assegnare al form
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
     * @author Andrea Gasparini (1813486)
     */
    export class HTMLFormElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * Il form HTML vero e proprio che verra' restituito a seguito della chiamata al
         * metodo build
         */
        /*private*/ formElement : HTMLFormElement = document.createElement("form");

        public constructor(id : string) {
            super();
            this.addId(id);
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder}
         */
        public addId(id : string) : HTMLFormElementBuilder {
            this.formElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder}
         */
        public addClass(className : string) : HTMLFormElementBuilder {
            this.formElement.className = className;
            return this;
        }

        /**
         * Imposta l'indirizzo a cui il form invia i dati
         * 
         * @param {string} url indirizzo a cui inviare i dati
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder} l'elemento Builder stesso
         */
        public addAction(url : string) : HTMLFormElementBuilder {
            this.formElement.action = url;
            return this;
        }

        /**
         * Imposta il metodo di invio dei dati al server
         * 
         * @param {string} method metodo di invio
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder} l'elemento Builder stesso
         */
        public changeMethod(method : string) : HTMLFormElementBuilder {
            this.formElement.method = method;
            return this;
        }

        /**
         * Imposta una funzione che viene richiamata nel momento in cui il form viene
         * inviato al server
         * 
         * @param {*} func funzione da chiamare al momento dell'invio
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder} l'elemento Builder stesso
         */
        public onSubmit(func : (p1: Event) => any) : HTMLFormElementBuilder {
            this.formElement.onsubmit = <any>(func);
            return this;
        }

        /**
         * 
         * @return {HTMLFormElement}
         */
        public build() : HTMLFormElement {
            return this.formElement;
        }
    }
    HTMLFormElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder";

}

