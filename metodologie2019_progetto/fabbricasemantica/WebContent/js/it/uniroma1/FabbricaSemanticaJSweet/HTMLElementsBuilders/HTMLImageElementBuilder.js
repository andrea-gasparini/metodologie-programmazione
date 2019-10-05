/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var HTMLElementsBuilders;
            (function (HTMLElementsBuilders) {
                class HTMLImageElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
                    constructor(id) {
                        if (((typeof id === 'string') || id === null)) {
                            let __args = arguments;
                            {
                                let __args = arguments;
                                super();
                                if (this.imageElement === undefined)
                                    this.imageElement = null;
                                if (this.imageElement === undefined)
                                    this.imageElement = null;
                                (() => {
                                    this.imageElement = document.createElement("img");
                                })();
                            }
                            (() => {
                                this.addId(id);
                            })();
                        }
                        else if (id === undefined) {
                            let __args = arguments;
                            super();
                            if (this.imageElement === undefined)
                                this.imageElement = null;
                            if (this.imageElement === undefined)
                                this.imageElement = null;
                            (() => {
                                this.imageElement = document.createElement("img");
                            })();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    addId(id) {
                        this.imageElement.id = id;
                        return this;
                    }
                    addClass(className) {
                        this.imageElement.className = className;
                        return this;
                    }
                    addSrc(url) {
                        this.imageElement.src = url;
                        return this;
                    }
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
