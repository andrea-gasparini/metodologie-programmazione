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
                 * Costruisce il Builder dell'elemento di Input HTML e gli imposta un ID
                 *
                 * @param {string} id identificatore da assegnare all'elemento
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
                 * @author Andrea Gasparini (1813486)
                 */
                class HTMLInputElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            super();
                            this.inputElement = document.createElement("input");
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            this.inputElement = document.createElement("input");
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder}
                     */
                    addId(id) {
                        this.inputElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder}
                     */
                    addClass(className) {
                        this.inputElement.className = className;
                        return this;
                    }
                    /**
                     * Imposta il tipo dell'elemento di Input HTML
                     *
                     * @param {string} type tipo da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder} l'elemento Builder stesso
                     */
                    addType(type) {
                        this.inputElement.type = type;
                        return this;
                    }
                    /**
                     * Imposta l'elemento di Input HTML come "richiesto" all'interno per poter
                     * procedere all'invio del form in cui e' contenuto
                     *
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder} l'elemento Builder stesso
                     */
                    isRequired() {
                        this.inputElement.required = true;
                        return this;
                    }
                    /**
                     * Imposta il valore dell'elemento di Input HTML
                     *
                     * @param {string} value valore da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder} l'elemento Builder stesso
                     */
                    addValue(value) {
                        this.inputElement.value = value;
                        return this;
                    }
                    /**
                     * Imposta il nome dell'elemento di Input HTML
                     *
                     * @param {string} name nome da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder} l'elemento Builder stesso
                     */
                    addName(name) {
                        this.inputElement.name = name;
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLInputElement}
                     */
                    build() {
                        return this.inputElement;
                    }
                }
                HTMLElementsBuilders.HTMLInputElementBuilder = HTMLInputElementBuilder;
                HTMLInputElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
