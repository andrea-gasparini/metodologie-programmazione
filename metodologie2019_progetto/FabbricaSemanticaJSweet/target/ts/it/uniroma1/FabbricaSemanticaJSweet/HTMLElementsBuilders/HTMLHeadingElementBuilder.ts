/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    /**
     * Costruisce il Builder del titolo HTML con la grandezza passata come parametro
     * e gli imposta un ID
     * 
     * @param {number} headingDimension grandezza del titolo
     * @param {string} id identificatore da assegnare al titolo
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
     * @author Andrea Gasparini (1813486)
     */
    export class HTMLHeadingElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /**
         * Il titolo HTML vero e proprio che verra' restituito a seguito della chiamata al
         * metodo build
         */
        /*private*/ headingElement : HTMLHeadingElement;

        public constructor(headingDimension? : any, id? : any) {
            if(((typeof headingDimension === 'number') || headingDimension === null) && ((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    super();
                    if(this.headingElement===undefined) this.headingElement = null;
                    if(this.headingElement===undefined) this.headingElement = null;
                    (() => {
                        this.headingElement = headingDimension === 1?document.createElement("h1"):headingDimension === 2?document.createElement("h2"):document.createElement("h3");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(((typeof headingDimension === 'string') || headingDimension === null) && id === undefined) {
                let __args = arguments;
                let id : any = __args[0];
                {
                    let __args = arguments;
                    let headingDimension : any = 1;
                    {
                        let __args = arguments;
                        super();
                        if(this.headingElement===undefined) this.headingElement = null;
                        if(this.headingElement===undefined) this.headingElement = null;
                        (() => {
                            this.headingElement = headingDimension === 1?document.createElement("h1"):headingDimension === 2?document.createElement("h2"):document.createElement("h3");
                        })();
                    }
                    (() => {
                        this.addId(id);
                    })();
                }
            } else if(((typeof headingDimension === 'number') || headingDimension === null) && id === undefined) {
                let __args = arguments;
                super();
                if(this.headingElement===undefined) this.headingElement = null;
                if(this.headingElement===undefined) this.headingElement = null;
                (() => {
                    this.headingElement = headingDimension === 1?document.createElement("h1"):headingDimension === 2?document.createElement("h2"):document.createElement("h3");
                })();
            } else if(headingDimension === undefined && id === undefined) {
                let __args = arguments;
                {
                    let __args = arguments;
                    let headingDimension : any = 1;
                    super();
                    if(this.headingElement===undefined) this.headingElement = null;
                    if(this.headingElement===undefined) this.headingElement = null;
                    (() => {
                        this.headingElement = headingDimension === 1?document.createElement("h1"):headingDimension === 2?document.createElement("h2"):document.createElement("h3");
                    })();
                }
            } else throw new Error('invalid overload');
        }

        /**
         * 
         * @param {string} id
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder}
         */
        public addId(id : string) : HTMLHeadingElementBuilder {
            this.headingElement.id = id;
            return this;
        }

        /**
         * 
         * @param {string} className
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder}
         */
        public addClass(className : string) : HTMLHeadingElementBuilder {
            this.headingElement.className = className;
            return this;
        }

        /**
         * Imposta il testo del titolo
         * 
         * @param {string} text testo del titolo
         * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder} l'elemento Builder stesso
         */
        public addText(text : string) : HTMLHeadingElementBuilder {
            this.headingElement.innerText = text;
            return this;
        }

        /**
         * 
         * @return {HTMLHeadingElement}
         */
        public build() : HTMLHeadingElement {
            return this.headingElement;
        }
    }
    HTMLHeadingElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder";

}

