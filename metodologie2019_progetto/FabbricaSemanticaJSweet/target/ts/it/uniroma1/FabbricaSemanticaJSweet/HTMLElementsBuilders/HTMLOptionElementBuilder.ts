/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLOptionElementBuilder implements it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /*private*/ optionElement : HTMLOptionElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    if(this.optionElement===undefined) this.optionElement = null;
                    if(this.optionElement===undefined) this.optionElement = null;
                    (() => {
                        this.optionElement = document.createElement("option");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                if(this.optionElement===undefined) this.optionElement = null;
                if(this.optionElement===undefined) this.optionElement = null;
                (() => {
                    this.optionElement = document.createElement("option");
                })();
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLOptionElementBuilder {
            this.optionElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLOptionElementBuilder {
            this.optionElement.classList.add(className);
            return this;
        }

        public addText(text : string) : HTMLOptionElementBuilder {
            this.optionElement.innerText = text;
            return this;
        }

        public addValue(value : string) : HTMLOptionElementBuilder {
            this.optionElement.value = value;
            return this;
        }

        public build() : HTMLOptionElement {
            return this.optionElement;
        }
    }
    HTMLOptionElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder";
    HTMLOptionElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];


}

