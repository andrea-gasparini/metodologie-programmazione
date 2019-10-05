/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * Costruisce il Builder dell'elemento HTML e gli imposta un ID
     * 
     * @param {string} id identificatore da assegnare all'elemento
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
     */
    export class HTMLSpanElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * L'elemento HTML vero e proprio che verra' restituito a seguito della chiamata
         * al metodo build
         */
        /*private*/ spanElement : HTMLSpanElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                super();
                this.spanElement = document.createElement("span");
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                super();
                this.spanElement = document.createElement("span");
            } else throw new Error('invalid overload');
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder}
         */
        public addId(id : string) : HTMLSpanElementBuilder {
            this.spanElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder}
         */
        public addClass(className : string) : HTMLSpanElementBuilder {
            this.spanElement.className = className;
            return this;
        }

        /**
         * Imposta il testo dell'elemento HTML
         * 
         * @param value testo da impostare
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder} l'elemento Builder stesso
         * @param {string} text
         */
        public addText(text : string) : HTMLSpanElementBuilder {
            this.spanElement.innerText = text;
            return this;
        }

        /**
         * Imposta una stringa come css dell'elemento HTML
         * 
         * @param {string} css il css dell'elemento HTML
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder} l'elemento Builder stesso
         */
        public addCss(css : string) : HTMLSpanElementBuilder {
            this.spanElement.setAttribute("style", css);
            return this;
        }

        /**
         * 
         * @return {HTMLSpanElement}
         */
        public build() : HTMLSpanElement {
            return this.spanElement;
        }
    }
    HTMLSpanElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder";

}

