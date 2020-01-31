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
                 * Costruisce il Builder del form HTML e gli imposta un ID
                 *
                 * @param {string} id identificatore da assegnare al form
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
                 * @author Andrea Gasparini (1813486)
                 */
                class HTMLFormElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        super();
                        /**
                         * Il form HTML vero e proprio che verra' restituito a seguito della chiamata al
                         * metodo build
                         */
                        /*private*/ this.formElement = document.createElement("form");
                        this.addId(id);
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder}
                     */
                    addId(id) {
                        this.formElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder}
                     */
                    addClass(className) {
                        this.formElement.className = className;
                        return this;
                    }
                    /**
                     * Imposta l'indirizzo a cui il form invia i dati
                     *
                     * @param {string} url indirizzo a cui inviare i dati
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder} l'elemento Builder stesso
                     */
                    addAction(url) {
                        this.formElement.action = url;
                        return this;
                    }
                    /**
                     * Imposta il metodo di invio dei dati al server
                     *
                     * @param {string} method metodo di invio
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder} l'elemento Builder stesso
                     */
                    changeMethod(method) {
                        this.formElement.method = method;
                        return this;
                    }
                    /**
                     * Imposta una funzione che viene richiamata nel momento in cui il form viene
                     * inviato al server
                     *
                     * @param {*} func funzione da chiamare al momento dell'invio
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder} l'elemento Builder stesso
                     */
                    onSubmit(func) {
                        this.formElement.onsubmit = (func);
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLFormElement}
                     */
                    build() {
                        return this.formElement;
                    }
                }
                HTMLElementsBuilders.HTMLFormElementBuilder = HTMLFormElementBuilder;
                HTMLFormElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
