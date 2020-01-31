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
                 * Costruisce il Builder dell'elemento HTML e gli imposta un ID
                 *
                 * @param {string} id identificatore da assegnare all'elemento
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
                 */
                class HTMLSpanElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            super();
                            this.spanElement = document.createElement("span");
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            this.spanElement = document.createElement("span");
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder}
                     */
                    addId(id) {
                        this.spanElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder}
                     */
                    addClass(className) {
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
                    addText(text) {
                        this.spanElement.innerText = text;
                        return this;
                    }
                    /**
                     * Imposta una stringa come css dell'elemento HTML
                     *
                     * @param {string} css il css dell'elemento HTML
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder} l'elemento Builder stesso
                     */
                    addCss(css) {
                        this.spanElement.setAttribute("style", css);
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLSpanElement}
                     */
                    build() {
                        return this.spanElement;
                    }
                }
                HTMLElementsBuilders.HTMLSpanElementBuilder = HTMLSpanElementBuilder;
                HTMLSpanElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
