/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLButtonElementBuilder implements it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        buttonElement : HTMLButtonElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    if(this.buttonElement===undefined) this.buttonElement = null;
                    if(this.buttonElement===undefined) this.buttonElement = null;
                    (() => {
                        this.buttonElement = document.createElement("button");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                if(this.buttonElement===undefined) this.buttonElement = null;
                if(this.buttonElement===undefined) this.buttonElement = null;
                (() => {
                    this.buttonElement = document.createElement("button");
                })();
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLButtonElementBuilder {
            this.buttonElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLButtonElementBuilder {
            this.buttonElement.className = className;
            return this;
        }

        public addText(text : string) : HTMLButtonElementBuilder {
            this.buttonElement.innerText = text;
            return this;
        }

        public addType(type : string) : HTMLButtonElementBuilder {
            this.buttonElement.type = type;
            return this;
        }

        public build() : HTMLButtonElement {
            return this.buttonElement;
        }
    }
    HTMLButtonElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder";
    HTMLButtonElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];


}

