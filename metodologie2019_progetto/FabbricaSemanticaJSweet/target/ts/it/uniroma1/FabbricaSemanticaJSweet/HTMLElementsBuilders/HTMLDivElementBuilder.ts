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
    export class HTMLDivElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * L'elemento HTML vero e proprio che verra' restituito a seguito della chiamata
         * al metodo build
         */
        /*private*/ divElement : HTMLDivElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                super();
                this.divElement = document.createElement("div");
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                super();
                this.divElement = document.createElement("div");
            } else throw new Error('invalid overload');
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder}
         */
        public addId(id : string) : HTMLDivElementBuilder {
            this.divElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder}
         */
        public addClass(className : string) : HTMLDivElementBuilder {
            this.divElement.className = className;
            return this;
        }

        /**
         * 
         * @return {HTMLDivElement}
         */
        public build() : HTMLDivElement {
            return this.divElement;
        }
    }
    HTMLDivElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder";

}

