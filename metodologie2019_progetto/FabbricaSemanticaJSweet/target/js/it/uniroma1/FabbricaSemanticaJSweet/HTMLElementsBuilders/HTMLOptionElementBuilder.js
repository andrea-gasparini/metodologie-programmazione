/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLOptionElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                if (this.optionElement === undefined)
                                    this.optionElement = null;
                                if (this.optionElement === undefined)
                                    this.optionElement = null;
                                (() => {
                                    this.optionElement = document.createElement("option");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            if (this.optionElement === undefined)
                                this.optionElement = null;
                            if (this.optionElement === undefined)
                                this.optionElement = null;
                            (() => {
                                this.optionElement = document.createElement("option");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.optionElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.optionElement.classList.add(className);
                        return this;
                    }
                    addText(text) {
                        this.optionElement.innerText = text;
                        return this;
                    }
                    addValue(value) {
                        this.optionElement.value = value;
                        return this;
                    }
                    toHTMLElement() {
                        return this.optionElement;
                    }
                }
                HTMLElementsBuilders.HTMLOptionElementBuilder = HTMLOptionElementBuilder;
                HTMLOptionElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder";
                HTMLOptionElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
