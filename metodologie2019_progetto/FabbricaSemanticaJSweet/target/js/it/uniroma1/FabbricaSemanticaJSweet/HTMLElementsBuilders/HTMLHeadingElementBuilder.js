/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLHeadingElementBuilder {
                    constructor(headingDimension, id) {
                        if (((typeof headingDimension === 'number') || headingDimension === null) && ((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                if (this.headingElement === undefined)
                                    this.headingElement = null;
                                if (this.headingElement === undefined)
                                    this.headingElement = null;
                                (() => {
                                    this.headingElement = headingDimension === 1 ? document.createElement("h1") : document.createElement("h2");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (((typeof headingDimension === 'string') || headingDimension === null) && id === undefined) {
                            let __args = arguments;
                            let id = __args[0];
                            {
                                let __args = arguments;
                                let headingDimension = 1;
                                {
                                    let __args = arguments;
                                    if (this.headingElement === undefined)
                                        this.headingElement = null;
                                    if (this.headingElement === undefined)
                                        this.headingElement = null;
                                    (() => {
                                        this.headingElement = headingDimension === 1 ? document.createElement("h1") : document.createElement("h2");
                                    })();
                                }
                                (() => {
                                    this.addId(id);
                                })();
                            }
                        }
                        else if (((typeof headingDimension === 'number') || headingDimension === null) && id === undefined) {
                            let __args = arguments;
                            if (this.headingElement === undefined)
                                this.headingElement = null;
                            if (this.headingElement === undefined)
                                this.headingElement = null;
                            (() => {
                                this.headingElement = headingDimension === 1 ? document.createElement("h1") : document.createElement("h2");
                            })();
                        }
                        else if (headingDimension === undefined && id === undefined) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                let headingDimension = 1;
                                if (this.headingElement === undefined)
                                    this.headingElement = null;
                                if (this.headingElement === undefined)
                                    this.headingElement = null;
                                (() => {
                                    this.headingElement = headingDimension === 1 ? document.createElement("h1") : document.createElement("h2");
                                })();
                            }
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.headingElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.headingElement.className = className;
                        return this;
                    }
                    addText(text) {
                        this.headingElement.innerText = text;
                        return this;
                    }
                    toHTMLElement() {
                        return this.headingElement;
                    }
                }
                HTMLElementsBuilders.HTMLHeadingElementBuilder = HTMLHeadingElementBuilder;
                HTMLHeadingElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder";
                HTMLHeadingElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];
            })(HTMLElementsBuilders = FabbricaSemanticaJSweet.HTMLElementsBuilders || (FabbricaSemanticaJSweet.HTMLElementsBuilders = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
