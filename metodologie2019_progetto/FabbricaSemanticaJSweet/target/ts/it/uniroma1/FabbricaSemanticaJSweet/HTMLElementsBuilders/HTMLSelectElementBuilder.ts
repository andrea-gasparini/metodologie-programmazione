/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * Costruisce il Builder del selettore HTML e gli imposta un ID
     * 
     * @param {string} id identificatore da assegnare al selettore
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
     * @author Andrea Gasparini (1813486)
     */
    export class HTMLSelectElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * Il selettore HTML vero e proprio che verra' restituito a seguito della chiamata al
         * metodo build
         */
        /*private*/ selectElement : HTMLSelectElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                super();
                this.selectElement = document.createElement("select");
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                super();
                this.selectElement = document.createElement("select");
            } else throw new Error('invalid overload');
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder}
         */
        public addId(id : string) : HTMLSelectElementBuilder {
            this.selectElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder}
         */
        public addClass(className : string) : HTMLSelectElementBuilder {
            this.selectElement.className = className;
            return this;
        }

        /**
         * Imposta il nome del selettore HTML
         * 
         * @param value nome da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder} l'elemento Builder stesso
         * @param {string} name
         */
        public addName(name : string) : HTMLSelectElementBuilder {
            this.selectElement.name = name;
            return this;
        }

        /**
         * Aggiunge un elemento di Opzione al selettore HTML
         * 
         * @param {string} content testo da impostare come testo e valore dell'Opzione HTML
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder} l'elemento Builder stesso
         */
        public addOptionElement(content : string) : HTMLSelectElementBuilder {
            this.selectElement.add(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder().addText(content).addValue(content).build());
            return this;
        }

        /**
         * 
         * @return {HTMLSelectElement}
         */
        public build() : HTMLSelectElement {
            return this.selectElement;
        }
    }
    HTMLSelectElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder";

}

