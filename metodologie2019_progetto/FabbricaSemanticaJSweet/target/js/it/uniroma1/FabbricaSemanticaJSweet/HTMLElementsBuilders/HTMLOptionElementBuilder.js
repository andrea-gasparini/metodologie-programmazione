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
                 * Costruisce il Builder dell'elemento di Opzione HTML e gli imposta un ID
                 *
                 * @param {string} id identificatore da assegnare all'elemento
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
                 * @author Andrea Gasparini (1813486)
                 */
                class HTMLOptionElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            super();
                            this.optionElement = document.createElement("option");
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            this.optionElement = document.createElement("option");
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder}
                     */
                    addId(id) {
                        this.optionElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder}
                     */
                    addClass(className) {
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
                    addText(text) {
                        this.optionElement.innerText = text;
                        return this;
                    }
                    /**
                     * Imposta il valore dell'elemento di Opzione HTML
                     *
                     * @param {string} value valore da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder} l'elemento Builder stesso
                     */
                    addValue(value) {
                        this.optionElement.value = value;
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLOptionElement}
                     */
                    build() {
                        return this.optionElement;
                    }
                }
                HTMLElementsBuilders.HTMLOptionElementBuilder = HTMLOptionElementBuilder;
                HTMLOptionElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
