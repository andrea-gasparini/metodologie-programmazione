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
                 * Costruisce il Builder del pulsante HTML e gli imposta un ID
                 *
                 * @param {string} id identificatore da assegnare al pulsante
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
                 * @author Andrea Gasparini (1813486)
                 */
                class HTMLButtonElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        super();
                        /**
                         * Il pulsante HTML vero e proprio che verra' restituito a seguito della chiamata
                         * al metodo build
                         */
                        this.buttonElement = document.createElement("button");
                        this.addId(id);
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder}
                     */
                    addId(id) {
                        this.buttonElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder}
                     */
                    addClass(className) {
                        this.buttonElement.className = className;
                        return this;
                    }
                    /**
                     * Imposta l'etichetta del pulsante HTML
                     *
                     * @param {string} text testo da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder} l'elemento Builder stesso
                     */
                    addText(text) {
                        this.buttonElement.innerText = text;
                        return this;
                    }
                    /**
                     * Imposta il tipo del pulsante HTML
                     *
                     * @param {string} type tipo da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder} l'elemento Builder stesso
                     */
                    addType(type) {
                        this.buttonElement.type = type;
                        return this;
                    }
                    /**
                     * Imposta il valore del pulsante HTML
                     *
                     * @param {string} value valore da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder} l'elemento Builder stesso
                     */
                    addValue(value) {
                        this.buttonElement.value = value;
                        return this;
                    }
                    /**
                     * Imposta il nome del pulsante HTML
                     *
                     * @param {string} name nome da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder} l'elemento Builder stesso
                     */
                    addName(name) {
                        this.buttonElement.name = name;
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLButtonElement}
                     */
                    build() {
                        return this.buttonElement;
                    }
                }
                HTMLElementsBuilders.HTMLButtonElementBuilder = HTMLButtonElementBuilder;
                HTMLButtonElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
