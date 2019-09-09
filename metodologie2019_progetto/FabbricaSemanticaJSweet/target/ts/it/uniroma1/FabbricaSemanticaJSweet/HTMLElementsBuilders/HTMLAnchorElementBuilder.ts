/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLAnchorElementBuilder implements it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /*private*/ anchorElement : HTMLAnchorElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    if(this.anchorElement===undefined) this.anchorElement = null;
                    if(this.anchorElement===undefined) this.anchorElement = null;
                    (() => {
                        this.anchorElement = document.createElement("a");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                if(this.anchorElement===undefined) this.anchorElement = null;
                if(this.anchorElement===undefined) this.anchorElement = null;
                (() => {
                    this.anchorElement = document.createElement("a");
                })();
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLAnchorElementBuilder {
            this.anchorElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLAnchorElementBuilder {
            this.anchorElement.className = className;
            return this;
        }

        public addHref(url : string) : HTMLAnchorElementBuilder {
            this.anchorElement.href = url;
            return this;
        }

        public addText(text : string) : HTMLAnchorElementBuilder {
            this.anchorElement.innerText = text;
            return this;
        }

        public toHTMLElement() : HTMLAnchorElement {
            return this.anchorElement;
        }
    }
    HTMLAnchorElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder";
    HTMLAnchorElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];


}

