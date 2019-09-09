/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLInputElementBuilder implements it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /*private*/ inputElement : HTMLInputElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    if(this.inputElement===undefined) this.inputElement = null;
                    if(this.inputElement===undefined) this.inputElement = null;
                    (() => {
                        this.inputElement = document.createElement("input");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                if(this.inputElement===undefined) this.inputElement = null;
                if(this.inputElement===undefined) this.inputElement = null;
                (() => {
                    this.inputElement = document.createElement("input");
                })();
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLInputElementBuilder {
            this.inputElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLInputElementBuilder {
            this.inputElement.className = className;
            return this;
        }

        public addType(type : string) : HTMLInputElementBuilder {
            this.inputElement.type = type;
            return this;
        }

        public isRequired() : HTMLInputElementBuilder {
            this.inputElement.required = true;
            return this;
        }

        public addValue(value : string) : HTMLInputElementBuilder {
            this.inputElement.value = value;
            return this;
        }

        public addName(name : string) : HTMLInputElementBuilder {
            this.inputElement.name = name;
            return this;
        }

        public toHTMLElement() : HTMLInputElement {
            return this.inputElement;
        }
    }
    HTMLInputElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder";
    HTMLInputElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];


}

