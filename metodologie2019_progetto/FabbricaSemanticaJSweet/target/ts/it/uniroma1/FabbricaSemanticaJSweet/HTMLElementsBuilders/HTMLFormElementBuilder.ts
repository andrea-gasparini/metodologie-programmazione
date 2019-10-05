/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders {
    export class HTMLFormElementBuilder extends it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLElementBuilder {
        /*private*/ formElement : HTMLFormElement;

        public constructor(id? : any) {
            if(((typeof id === 'string') || id === null)) {
                let __args = arguments;
                {
                    let __args = arguments;
                    super();
                    if(this.formElement===undefined) this.formElement = null;
                    if(this.formElement===undefined) this.formElement = null;
                    (() => {
                        this.formElement = document.createElement("form");
                    })();
                }
                (() => {
                    this.addId(id);
                })();
            } else if(id === undefined) {
                let __args = arguments;
                super();
                if(this.formElement===undefined) this.formElement = null;
                if(this.formElement===undefined) this.formElement = null;
                (() => {
                    this.formElement = document.createElement("form");
                })();
            } else throw new Error('invalid overload');
        }

        public addId(id : string) : HTMLFormElementBuilder {
            this.formElement.id = id;
            return this;
        }

        public addClass(className : string) : HTMLFormElementBuilder {
            this.formElement.className = className;
            return this;
        }

        public addAction(action : string) : HTMLFormElementBuilder {
            this.formElement.action = action;
            return this;
        }

        public changeMethod(method : string) : HTMLFormElementBuilder {
            this.formElement.method = method;
            return this;
        }

        public onSubmit(func : (p1: Event) => any) : HTMLFormElementBuilder {
            this.formElement.onsubmit = <any>(func);
            return this;
        }

        public build() : HTMLFormElement {
            return this.formElement;
        }
    }
    HTMLFormElementBuilder["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder";

}

