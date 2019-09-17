/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet {
    export class Signup extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
        public static LANGUAGE_LEVELS : string[]; public static LANGUAGE_LEVELS_$LI$() : string[] { if(Signup.LANGUAGE_LEVELS == null) Signup.LANGUAGE_LEVELS = ["A1", "A2", "B1", "B2", "C1", "C2"]; return Signup.LANGUAGE_LEVELS; };

        public static main(args : string[]) {
            new Signup(it.uniroma1.FabbricaSemanticaJSweet.PageType.SIGNUP_PAGE);
        }

        public constructor(pageName : it.uniroma1.FabbricaSemanticaJSweet.PageType) {
            super(pageName);
            $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").build());
            $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder().addText("Welcome!").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please register a new account :-)").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./signup.jsp").onSubmit((event) => { return this.checkForm(event) }).build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("bottom-text").addText("Already have an account? ").build());
            $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Email Address*").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("email").addType("email").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Password*").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("password").addType("password").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Confirm Password*").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("confirm-password").addType("password").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("languages").addClass("horizontal container").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder("signup").addType("submit").addValue("Sign up").build());
            $("#languages").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("languages-left").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("languages-right").build());
            $("#languages-left").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Main Language(s)*").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("checkbox-list").addClass("vertical container").build());
            $("#checkbox-list").append(this.createCheckboxDiv("English"), this.createCheckboxDiv("Italian"));
            $("#languages-right").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Other Languages").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("other-languages").addClass("vertical container").build());
            $("#other-languages").append(this.createOtherLanguageDiv(), this.createOtherLanguageDiv());
            $("#bottom-text").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("change-page").addHref("./login.html").addText("Log in!").build());
        }

        /*private*/ createCheckboxDiv(language : string) : HTMLDivElement {
            let checkboxDiv : HTMLDivElement = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("checkbox-text").build();
            $(checkboxDiv).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addName("language-checkbox").addType("checkbox").addValue(language.toLowerCase()).build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("margin-left: 5px;").addText(language).build());
            return checkboxDiv;
        }

        /*private*/ createOtherLanguageDiv() : HTMLDivElement {
            let otherLanguageDiv : HTMLDivElement = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("other-language horizontal container").build();
            let otherLanguageSelect : it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder().addName("language-level").addClass("level-select");
            for(let index121=0; index121 < Signup.LANGUAGE_LEVELS_$LI$().length; index121++) {
                let level = Signup.LANGUAGE_LEVELS_$LI$()[index121];
                otherLanguageSelect.addOptionElement(level)
            }
            $(otherLanguageDiv).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addName("other-language").addClass("language-field").build(), otherLanguageSelect.build());
            return otherLanguageDiv;
        }

        /*private*/ getInputElem(name : string) : HTMLInputElement {
            return <HTMLInputElement>document.querySelector("[name=\'" + name + "\']");
        }

        /*private*/ checkForm(event : Event) : boolean {
            if(!/* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(this.getInputElem("password").value,this.getInputElem("confirm-password").value))) {
                alert("Passwords don\'t match!");
                return false;
            } else if($("input[type=\'checkbox\']:checked").length === 0) {
                alert("You must choose at least 1 Main Language!");
                return false;
            }
            return true;
        }
    }
    Signup["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.Signup";

}


it.uniroma1.FabbricaSemanticaJSweet.Signup.LANGUAGE_LEVELS_$LI$();

it.uniroma1.FabbricaSemanticaJSweet.Signup.main(null);
