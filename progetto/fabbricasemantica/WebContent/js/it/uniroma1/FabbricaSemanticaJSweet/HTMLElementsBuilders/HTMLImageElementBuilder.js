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
                 * Costruisce il Builder dell'immagine HTML e gli imposta un ID
                 *
                 * @param {string} id identificatore da assegnare all'immagine
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder
                 * @author Andrea Gasparini (1813486)
                 */
                class HTMLImageElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        super();
                        /**
                         * L'immagine HTML vera e propria che verra' restituita a seguito della chiamata
                         * al metodo build
                         */
                        /*private*/ this.imageElement = document.createElement("img");
                        this.addId(id);
                    }
                    /**
                     *
                     * @param {string} id
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLImageElementBuilder}
                     */
                    addId(id) {
                        this.imageElement.id = id;
                        return this;
                    }
                    /**
                     *
                     * @param {string} className
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLImageElementBuilder}
                     */
                    addClass(className) {
                        this.imageElement.className = className;
                        return this;
                    }
                    /**
                     * Imposta l'indirizzo in cui e' situato il file dell'immagine
                     *
                     * @param {string} url indirizzo in cui e' situata l'immagine
                     * @return {it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLImageElementBuilder} l'elemento Builder stesso
                     */
                    addSrc(url) {
                        this.imageElement.src = url;
                        return this;
                    }
                    /**
                     *
                     * @return {HTMLImageElement}
                     */
                    build() {
                        return this.imageElement;
                    }
                }
                HTMLElementsBuilders.HTMLImageElementBuilder = HTMLImageElementBuilder;
                HTMLImageElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLImageElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
