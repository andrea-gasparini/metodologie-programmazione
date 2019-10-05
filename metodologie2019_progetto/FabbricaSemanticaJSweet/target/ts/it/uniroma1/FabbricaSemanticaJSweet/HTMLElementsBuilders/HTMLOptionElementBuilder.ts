/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * Costruisce il Builder dell'elemento di Opzione HTML e gli imposta un ID
     * 
     * @param {string} id identificatore da assegnare all'elemento
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
     * @author Andrea Gasparini (1813486)
     */
    export class HTMLOptionElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * L'elemento di Opzione HTML vero e proprio che verra' restituito a seguito della chiamata al
         * metodo build
         */
        /*private*/ optionElement : HTMLOptionElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                super();
                this.optionElement = document.createElement("option");
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                super();
                this.optionElement = document.createElement("option");
            } else throw new Error('invalid overload');
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder}
         */
        public addId(id : string) : HTMLOptionElementBuilder {
            this.optionElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder}
         */
        public addClass(className : string) : HTMLOptionElementBuilder {
            this.optionElement.classList.add(className);
            return this;
        }

        /**
         * Imposta il testo dell'elemento di Opzione HTML
         * 
         * @param value testo da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder} l'elemento Builder stesso
         * @param {string} text
         */
        public addText(text : string) : HTMLOptionElementBuilder {
            this.optionElement.innerText = text;
            return this;
        }

        /**
         * Imposta il valore dell'elemento di Opzione HTML
         * 
         * @param {string} value valore da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder} l'elemento Builder stesso
         */
        public addValue(value : string) : HTMLOptionElementBuilder {
            this.optionElement.value = value;
            return this;
        }

        /**
         * 
         * @return {HTMLOptionElement}
         */
        public build() : HTMLOptionElement {
            return this.optionElement;
        }
    }
    HTMLOptionElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder";

}

