/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLSelectElementBuilder implements it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /*private*/ selectElement : HTMLSelectElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    if(this.selectElement===undefined) this.selectElement = null;
                    if(this.selectElement===undefined) this.selectElement = null;
                    (() => {
                        this.selectElement = document.createElement("select");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                if(this.selectElement===undefined) this.selectElement = null;
                if(this.selectElement===undefined) this.selectElement = null;
                (() => {
                    this.selectElement = document.createElement("select");
                })();
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLSelectElementBuilder {
            this.selectElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLSelectElementBuilder {
            this.selectElement.className = className;
            return this;
        }

        public addName(name : string) : HTMLSelectElementBuilder {
            this.selectElement.name = name;
            return this;
        }

        public addOptionElement(content : string) : HTMLSelectElementBuilder {
            this.selectElement.add(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLOptionElementBuilder().addText(content).addValue(content).toHTMLElement());
            return this;
        }

        public toHTMLElement() : HTMLSelectElement {
            return this.selectElement;
        }
    }
    HTMLSelectElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder";
    HTMLSelectElementBuilder["__interfaces"] = ["it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder"];


}

