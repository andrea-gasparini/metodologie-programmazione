/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLFormElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                super();
                                if (this.formElement === undefined)
                                    this.formElement = null;
                                if (this.formElement === undefined)
                                    this.formElement = null;
                                (() => {
                                    this.formElement = document.createElement("form");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            if (this.formElement === undefined)
                                this.formElement = null;
                            if (this.formElement === undefined)
                                this.formElement = null;
                            (() => {
                                this.formElement = document.createElement("form");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.formElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.formElement.className = className;
                        return this;
                    }
                    addAction(action) {
                        this.formElement.action = action;
                        return this;
                    }
                    changeMethod(method) {
                        this.formElement.method = method;
                        return this;
                    }
                    onSubmit(func) {
                        this.formElement.onsubmit = (func);
                        return this;
                    }
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
