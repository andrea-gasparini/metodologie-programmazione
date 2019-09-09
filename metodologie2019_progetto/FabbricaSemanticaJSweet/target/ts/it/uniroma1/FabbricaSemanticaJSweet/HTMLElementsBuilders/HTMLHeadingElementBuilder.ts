/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLHeadingElementBuilder implements it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /*private*/ headingElement : HTMLHeadingElement;

        public constructor(headingDimension? : any, id? : any) {
            if(((typeof headingDimension === 'number') || headingDimension === null) && ((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    if(this.headingElement===undefined) this.headingElement = null;
                    if(this.headingElement===undefined) this.headingElement = null;
                    (() => {
                        this.headingElement = headingDimension === 1?document.createElement("h1"):document.createElement("h2");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(((typeof headingDimension === 'string') || headingDimension === null) && id === undefined) {
                let __args = arguments;
                let id : any = __args[0];
                {
                    let __args = arguments;
                    let headingDimension : any = 1;
                    {
                        let __args = arguments;
                        if(this.headingElement===undefined) this.headingElement = null;
                        if(this.headingElement===undefined) this.headingElement = null;
                        (() => {
                            this.headingElement = headingDimension === 1?document.createElement("h1"):document.createElement("h2");
                        })();
                    }
                    (() => {
                        this.addId(id);
                    })();
                }
            } else if(((typeof headingDimension === 'number') || headingDimension === null) && id === undefined) {
                let __args = arguments;
                if(this.headingElement===undefined) this.headingElement = null;
                if(this.headingElement===undefined) this.headingElement = null;
                (() => {
                    this.headingElement = headingDimension === 1?document.createElement("h1"):document.createElement("h2");
                })();
            } else if(headingDimension === undefined && id === undefined) {
                let __args = arguments;
                {
                    let __args = arguments;
                    let headingDimension : any = 1;
                    if(this.headingElement===undefined) this.headingElement = null;
                    if(this.headingElement===undefined) this.headingElement = null;
                    (() => {
                        this.headingElement = headingDimension === 1?document.createElement("h1"):document.createElement("h2");
                    })();
                }
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLHeadingElementBuilder {
            this.headingElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLHeadingElementBuilder {
            this.headingElement.className = className;
            return this;
        }

        public addText(text : string) : HTMLHeadingElementBuilder {
            this.headingElement.innerText = text;
            return this;
        }

        public toHTMLElement() : HTMLHeadingElement {
            return this.headingElement;
        }
    }
    HTMLHeadingElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder";
    HTMLHeadingElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];


}

