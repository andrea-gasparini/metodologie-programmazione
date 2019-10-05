/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLInputElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                super();
                                if (this.inputElement === undefined)
                                    this.inputElement = null;
                                if (this.inputElement === undefined)
                                    this.inputElement = null;
                                (() => {
                                    this.inputElement = document.createElement("input");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            if (this.inputElement === undefined)
                                this.inputElement = null;
                            if (this.inputElement === undefined)
                                this.inputElement = null;
                            (() => {
                                this.inputElement = document.createElement("input");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.inputElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.inputElement.className = className;
                        return this;
                    }
                    addType(type) {
                        this.inputElement.type = type;
                        return this;
                    }
                    isRequired() {
                        this.inputElement.required = true;
                        return this;
                    }
                    addValue(value) {
                        this.inputElement.value = value;
                        return this;
                    }
                    addName(name) {
                        this.inputElement.name = name;
                        return this;
                    }
                    build() {
                        return this.inputElement;
                    }
                }
                HTMLElementsBuilders.HTMLInputElementBuilder = HTMLInputElementBuilder;
                HTMLInputElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder";
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
