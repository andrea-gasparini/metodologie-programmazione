/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLAnchorElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                if (this.anchorElement === undefined)
                                    this.anchorElement = null;
                                if (this.anchorElement === undefined)
                                    this.anchorElement = null;
                                (() => {
                                    this.anchorElement = document.createElement("a");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            if (this.anchorElement === undefined)
                                this.anchorElement = null;
                            if (this.anchorElement === undefined)
                                this.anchorElement = null;
                            (() => {
                                this.anchorElement = document.createElement("a");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.anchorElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.anchorElement.className = className;
                        return this;
                    }
                    addHref(url) {
                        this.anchorElement.href = url;
                        return this;
                    }
                    addText(text) {
                        this.anchorElement.innerText = text;
                        return this;
                    }
                    build() {
                        return this.anchorElement;
                    }
                }
                HTMLElementsBuilders.HTMLAnchorElementBuilder = HTMLAnchorElementBuilder;
                HTMLAnchorElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder";
                HTMLAnchorElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
