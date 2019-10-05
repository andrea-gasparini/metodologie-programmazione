/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLDivElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /*private*/ divElement : HTMLDivElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    super();
                    if(this.divElement===undefined) this.divElement = null;
                    if(this.divElement===undefined) this.divElement = null;
                    (() => {
                        this.divElement = document.createElement("div");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                super();
                if(this.divElement===undefined) this.divElement = null;
                if(this.divElement===undefined) this.divElement = null;
                (() => {
                    this.divElement = document.createElement("div");
                })();
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLDivElementBuilder {
            this.divElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLDivElementBuilder {
            this.divElement.className = className;
            return this;
        }

        public build() : HTMLDivElement {
            return this.divElement;
        }
    }
    HTMLDivElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder";

}

