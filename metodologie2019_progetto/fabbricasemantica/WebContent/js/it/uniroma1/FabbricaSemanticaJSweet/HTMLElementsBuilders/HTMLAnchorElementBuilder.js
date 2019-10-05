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
                 * @author Andrea Gasparini (1813486)
                 */
                class HTMLAnchorElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        super();
                        /**
                         * L'elemento HTML vero e proprio che verra' restituito a seguito della chiamata
                         * al metodo build
                         */
                        /*private*/ this.anchorElement = document.createElement("a");
                        this.addId(id);
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder}
                     */
                    addId(id) {
                        this.anchorElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder}
                     */
                    addClass(className) {
                        this.anchorElement.className = className;
                        return this;
                    }
                    /**
                     * Imposta l'indirizzo a cui l'elemento rimanda
                     *
                     * @param {string} url indirizzo a cui rimandare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder} l'elemento Builder stesso
                     */
                    addHref(url) {
                        this.anchorElement.href = url;
                        return this;
                    }
                    /**
                     * Imposta il testo contenuto nell'elemento
                     *
                     * @param {string} text testo da impostare
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder} l'elemento Builder stesso
                     */
                    addText(text) {
                        this.anchorElement.innerText = text;
                        return this;
                    }
                    /**
                     * Imposta una funzione che viene richiamata al click dell'elemento
                     *
                     * @param {*} func funzione da chiamare al click
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder} l'elemento Builder stesso
                     */
                    onClick(func) {
                        this.anchorElement.onclick = (func);
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLAnchorElement}
                     */
                    build() {
                        return this.anchorElement;
                    }
                }
                HTMLElementsBuilders.HTMLAnchorElementBuilder = HTMLAnchorElementBuilder;
                HTMLAnchorElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
