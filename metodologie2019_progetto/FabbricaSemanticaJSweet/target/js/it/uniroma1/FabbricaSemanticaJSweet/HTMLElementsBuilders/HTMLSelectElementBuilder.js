/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLSelectElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                super();
                                if (this.selectElement === undefined)
                                    this.selectElement = null;
                                if (this.selectElement === undefined)
                                    this.selectElement = null;
                                (() => {
                                    this.selectElement = document.createElement("select");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            if (this.selectElement === undefined)
                                this.selectElement = null;
                            if (this.selectElement === undefined)
                                this.selectElement = null;
                            (() => {
                                this.selectElement = document.createElement("select");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.selectElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.selectElement.className = className;
                        return this;
                    }
                    addName(name) {
                        this.selectElement.name = name;
                        return this;
                    }
                    addOptionElement(content) {
                        this.selectElement.add(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder().addText(content).addValue(content).build());
                        return this;
                    }
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
