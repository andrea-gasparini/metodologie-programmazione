/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLHeadingElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /*private*/ headingElement : HTMLHeadingElement;

        public constructor(headingDimension? : any, id? : any) {
            if(((typeof headingDimension === 'number') || headingDimension === null) && ((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    super();
                    if(this.headingElement===undefined) this.headingElement = null;
                    if(this.headingElement===undefined) this.headingElement = null;
                    (() => {
                        this.headingElement = headingDimension === 1?document.createElement("h1"):headingDimension === 2?document.createElement("h2"):document.createElement("h3");
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
                        super();
                        if(this.headingElement===undefined) this.headingElement = null;
                        if(this.headingElement===undefined) this.headingElement = null;
                        (() => {
                            this.headingElement = headingDimension === 1?document.createElement("h1"):headingDimension === 2?document.createElement("h2"):document.createElement("h3");
                        })();
                    }
                    (() => {
                        this.addId(id);
                    })();
                }
            } else if(((typeof headingDimension === 'number') || headingDimension === null) && id === undefined) {
                let __args = arguments;
                super();
                if(this.headingElement===undefined) this.headingElement = null;
                if(this.headingElement===undefined) this.headingElement = null;
                (() => {
                    this.headingElement = headingDimension === 1?document.createElement("h1"):headingDimension === 2?document.createElement("h2"):document.createElement("h3");
                })();
            } else if(headingDimension === undefined && id === undefined) {
                let __args = arguments;
                {
                    let __args = arguments;
                    let headingDimension : any = 1;
                    super();
                    if(this.headingElement===undefined) this.headingElement = null;
                    if(this.headingElement===undefined) this.headingElement = null;
                    (() => {
                        this.headingElement = headingDimension === 1?document.createElement("h1"):headingDimension === 2?document.createElement("h2"):document.createElement("h3");
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

        public build() : HTMLHeadingElement {
            return this.headingElement;
        }
    }
    HTMLHeadingElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder";

}

