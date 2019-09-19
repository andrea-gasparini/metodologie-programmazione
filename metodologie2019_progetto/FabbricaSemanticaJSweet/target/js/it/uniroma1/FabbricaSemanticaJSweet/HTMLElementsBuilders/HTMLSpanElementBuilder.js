/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLSpanElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                if (this.spanElement === undefined)
                                    this.spanElement = null;
                                if (this.spanElement === undefined)
                                    this.spanElement = null;
                                (() => {
                                    this.spanElement = document.createElement("span");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            if (this.spanElement === undefined)
                                this.spanElement = null;
                            if (this.spanElement === undefined)
                                this.spanElement = null;
                            (() => {
                                this.spanElement = document.createElement("span");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.spanElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.spanElement.className = className;
                        return this;
                    }
                    addText(text) {
                        this.spanElement.innerText = text;
                        return this;
                    }
                    addCss(css) {
                        this.spanElement.setAttribute("style", css);
                        return this;
                    }
                    build() {
                        return this.spanElement;
                    }
                }
                HTMLElementsBuilders.HTMLSpanElementBuilder = HTMLSpanElementBuilder;
                HTMLSpanElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder";
                HTMLSpanElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
