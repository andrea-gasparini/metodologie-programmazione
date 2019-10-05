/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * Costruisce il Builder dell'elemento di Input HTML e gli imposta un ID
     * 
     * @param {string} id identificatore da assegnare all'elemento
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
     * @author Andrea Gasparini (1813486)
     */
    export class HTMLInputElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * L'elemento di Input HTML vero e proprio che verra' restituito a seguito della chiamata al
         * metodo build
         */
        /*private*/ inputElement : HTMLInputElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                super();
                this.inputElement = document.createElement("input");
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                super();
                this.inputElement = document.createElement("input");
            } else throw new Error('invalid overload');
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder}
         */
        public addId(id : string) : HTMLInputElementBuilder {
            this.inputElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder}
         */
        public addClass(className : string) : HTMLInputElementBuilder {
            this.inputElement.className = className;
            return this;
        }

        /**
         * Imposta il tipo dell'elemento di Input HTML
         * 
         * @param {string} type tipo da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder} l'elemento Builder stesso
         */
        public addType(type : string) : HTMLInputElementBuilder {
            this.inputElement.type = type;
            return this;
        }

        /**
         * Imposta l'elemento di Input HTML come "richiesto" all'interno per poter
         * procedere all'invio del form in cui e' contenuto
         * 
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder} l'elemento Builder stesso
         */
        public isRequired() : HTMLInputElementBuilder {
            this.inputElement.required = true;
            return this;
        }

        /**
         * Imposta il valore dell'elemento di Input HTML
         * 
         * @param {string} value valore da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder} l'elemento Builder stesso
         */
        public addValue(value : string) : HTMLInputElementBuilder {
            this.inputElement.value = value;
            return this;
        }

        /**
         * Imposta il nome dell'elemento di Input HTML
         * 
         * @param {string} name nome da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder} l'elemento Builder stesso
         */
        public addName(name : string) : HTMLInputElementBuilder {
            this.inputElement.name = name;
            return this;
        }

        /**
         * 
         * @return {HTMLInputElement}
         */
        public build() : HTMLInputElement {
            return this.inputElement;
        }
    }
    HTMLInputElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder";

}

