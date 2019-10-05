/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
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
                class HTMLHeadingElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(headingDimension, id) {
                        if (((typeof headingDimension === 'number') || headingDimension === null) && ((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                super();
                                if (this.headingElement === undefined)
                                    this.headingElement = null;
                                if (this.headingElement === undefined)
                                    this.headingElement = null;
                                (() => {
                                    this.headingElement = headingDimension === 1 ? document.createElement("h1") : headingDimension === 2 ? document.createElement("h2") : document.createElement("h3");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (((typeof headingDimension === 'string') || headingDimension === null) && id === undefined) {
                            let __args = arguments;
                            let id = __args[0];
                            {
                                let __args = arguments;
                                let headingDimension = 1;
                                {
                                    let __args = arguments;
                                    super();
                                    if (this.headingElement === undefined)
                                        this.headingElement = null;
                                    if (this.headingElement === undefined)
                                        this.headingElement = null;
                                    (() => {
                                        this.headingElement = headingDimension === 1 ? document.createElement("h1") : headingDimension === 2 ? document.createElement("h2") : document.createElement("h3");
                                    })();
                                }
                                (() => {
                                    this.addId(id);
                                })();
                            }
                        }
                        else if (((typeof headingDimension === 'number') || headingDimension === null) && id === undefined) {
                            let __args = arguments;
                            super();
                            if (this.headingElement === undefined)
                                this.headingElement = null;
                            if (this.headingElement === undefined)
                                this.headingElement = null;
                            (() => {
                                this.headingElement = headingDimension === 1 ? document.createElement("h1") : headingDimension === 2 ? document.createElement("h2") : document.createElement("h3");
                            })();
                        }
                        else if (headingDimension === undefined && id === undefined) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                let headingDimension = 1;
                                super();
                                if (this.headingElement === undefined)
                                    this.headingElement = null;
                                if (this.headingElement === undefined)
                                    this.headingElement = null;
                                (() => {
                                    this.headingElement = headingDimension === 1 ? document.createElement("h1") : headingDimension === 2 ? document.createElement("h2") : document.createElement("h3");
                                })();
                            }
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder}
                     */
                    addId(id) {
                        this.headingElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder}
                     */
                    addClass(className) {
                        this.headingElement.className = className;
                        return this;
                    }
                    /**
                     * Imposta il testo del titolo
                     *
                     * @param {string} text testo del titolo
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder} l'elemento Builder stesso
                     */
                    addText(text) {
                        this.headingElement.innerText = text;
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLHeadingElement}
                     */
                    build() {
                        return this.headingElement;
                    }
                }
                HTMLElementsBuilders.HTMLHeadingElementBuilder = HTMLHeadingElementBuilder;
                HTMLHeadingElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
