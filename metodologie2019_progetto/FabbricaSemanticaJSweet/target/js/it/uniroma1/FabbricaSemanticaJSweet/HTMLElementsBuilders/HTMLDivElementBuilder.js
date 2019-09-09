/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLDivElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                if (this.divElement === undefined)
                                    this.divElement = null;
                                if (this.divElement === undefined)
                                    this.divElement = null;
                                (() => {
                                    this.divElement = document.createElement("div");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            if (this.divElement === undefined)
                                this.divElement = null;
                            if (this.divElement === undefined)
                                this.divElement = null;
                            (() => {
                                this.divElement = document.createElement("div");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.divElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.divElement.className = className;
                        return this;
                    }
                    toHTMLElement() {
                        return this.divElement;
                    }
                }
                HTMLElementsBuilders.HTMLDivElementBuilder = HTMLDivElementBuilder;
                HTMLDivElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder";
                HTMLDivElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
