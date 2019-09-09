/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.HTMLElementsBuilders {
    export class HTMLSpanElementBuilder {
        /*private*/ spanElement : HTMLSpanElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    if(this.spanElement===undefined) this.spanElement = null;
                    if(this.spanElement===undefined) this.spanElement = null;
                    (() => {
                        this.spanElement = document.createElement("span");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                if(this.spanElement===undefined) this.spanElement = null;
                if(this.spanElement===undefined) this.spanElement = null;
                (() => {
                    this.spanElement = document.createElement("span");
                })();
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLSpanElementBuilder {
            this.spanElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLSpanElementBuilder {
            this.spanElement.className = className;
            return this;
        }

        public addText(text : string) : HTMLSpanElementBuilder {
            this.spanElement.innerText = text;
            return this;
        }

        public addCss(css : string) : HTMLSpanElementBuilder {
            this.spanElement.setAttribute("style", css);
            return this;
        }

        public toHTMLElement() : HTMLSpanElement {
            return this.spanElement;
        }
    }
    HTMLSpanElementBuilder["__class"] = "it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder";

}

