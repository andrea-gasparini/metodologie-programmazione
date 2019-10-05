/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLButtonElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                super();
                                if (this.buttonElement === undefined)
                                    this.buttonElement = null;
                                if (this.buttonElement === undefined)
                                    this.buttonElement = null;
                                (() => {
                                    this.buttonElement = document.createElement("button");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            if (this.buttonElement === undefined)
                                this.buttonElement = null;
                            if (this.buttonElement === undefined)
                                this.buttonElement = null;
                            (() => {
                                this.buttonElement = document.createElement("button");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.buttonElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.buttonElement.className = className;
                        return this;
                    }
                    addText(text) {
                        this.buttonElement.innerText = text;
                        return this;
                    }
                    addType(type) {
                        this.buttonElement.type = type;
                        return this;
                    }
                    addValue(value) {
                        this.buttonElement.value = value;
                        return this;
                    }
                    addName(name) {
                        this.buttonElement.name = name;
                        return this;
                    }
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
