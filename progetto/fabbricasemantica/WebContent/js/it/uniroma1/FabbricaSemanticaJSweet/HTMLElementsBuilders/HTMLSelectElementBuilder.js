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
                 * Costruisce il Builder del selettore HTML e gli imposta un ID
                 *
                 * @param {string} id identificatore da assegnare al selettore
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
                 * @author Andrea Gasparini (1813486)
                 */
                class HTMLSelectElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            super();
                            this.selectElement = document.createElement("select");
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            this.selectElement = document.createElement("select");
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder}
                     */
                    addId(id) {
                        this.selectElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder}
                     */
                    addClass(className) {
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
                    addName(name) {
                        this.selectElement.name = name;
                        return this;
                    }
                    /**
                     * Aggiunge un elemento di Opzione al selettore HTML
                     *
                     * @param {string} content testo da impostare come testo e valore dell'Opzione HTML
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder} l'elemento Builder stesso
                     */
                    addOptionElement(content) {
                        this.selectElement.add(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder().addText(content).addValue(content).build());
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLSelectElement}
                     */
                    build() {
                        return this.selectElement;
                    }
                }
                HTMLElementsBuilders.HTMLSelectElementBuilder = HTMLSelectElementBuilder;
                HTMLSelectElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
