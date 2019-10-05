/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var user;
            (function (user) {
                /**
                 * Costruisce la pagina Signup con un titolo di benvenuto, i campi obbligatori e
                 * facoltativi da inserire per potersi registrare al sistema e un riferimento
                 * alla pagina di Login.
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage
                 * @author Andrea Gasparini (1813486)
                 */
                class Signup extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
                    constructor() {
                        super(it.uniroma1.FabbricaSemanticaJSweet.PageType.SIGNUP_PAGE);
                        $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").build());
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder().addText("Welcome!").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please register a new account :-)").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./signup.jsp").onSubmit((e) => this.checkForm()).build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("bottom-text").addText("Already have an account? ").build());
                        $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Email Address*").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("email").addType("email").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Password*").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("password").addType("password").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Confirm Password*").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("confirm-password").addType("password").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("languages").addClass("horizontal container").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder("signup").addType("submit").addValue("Sign up").build());
                        $("#languages").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("languages-left").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("languages-right").build());
                        $("#languages-left").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Main Language(s)*").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("checkbox-list").addClass("vertical container").build());
                        $("#checkbox-list").append(this.createCheckboxDiv("English"), this.createCheckboxDiv("Italian"));
                        $("#languages-right").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Other Languages").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("other-languages").addClass("vertical container").build());
                        $("#other-languages").append(this.createOtherLanguageDiv(), this.createOtherLanguageDiv());
                        $("#bottom-text").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("change-page").addHref("./login.html").addText("Log in!").build());
                    }
                    static LANGUAGE_LEVELS_$LI$() { if (Signup.LANGUAGE_LEVELS == null)
                        Signup.LANGUAGE_LEVELS = ["A1", "A2", "B1", "B2", "C1", "C2"]; return Signup.LANGUAGE_LEVELS; }
                    ;
                    /**
                     * Crea la pagina Signup
                     * @param {Array} args
                     */
                    static main(args) {
                        new Signup();
                    }
                    /**
                     * Crea un elemento HTML per la lingua da scegliere, contenente un elemento di
                     * Input checkbox e uno Span come etichetta
                     *
                     * @param {string} language lingua da utilizzare come valore dell'input e testo dell'etichetta
                     * @return {HTMLDivElement} l'elemento Div contenente l'Input e lo Span
                     * @private
                     */
                    /*private*/ createCheckboxDiv(language) {
                        let checkboxDiv = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("checkbox-text").build();
                        $(checkboxDiv).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addName("language-checkbox").addType("checkbox").addValue(language.toLowerCase()).build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("margin-left: 5px;").addText(language).build());
                        return checkboxDiv;
                    }
                    /**
                     * Crea un elemento HTML per le lingue aggiuntive contenente un Input e un selettore dei livelli linguistici
                     *
                     * @return {HTMLDivElement} l'elemento Div contenente l'Input e il Select
                     * @private
                     */
                    /*private*/ createOtherLanguageDiv() {
                        let otherLanguageDiv = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("other-language horizontal container").build();
                        let otherLanguageSelect = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder().addName("language-level").addClass("level-select");
                        for (let index124 = 0; index124 < Signup.LANGUAGE_LEVELS_$LI$().length; index124++) {
                            let level = Signup.LANGUAGE_LEVELS_$LI$()[index124];
                            otherLanguageSelect.addOptionElement(level);
                        }
                        $(otherLanguageDiv).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addName("other-language").addClass("language-field").build(), otherLanguageSelect.build());
                        return otherLanguageDiv;
                    }
                    /**
                     * Dato una stringa, restituisce l'elemento Input HTML che la ha come nome
                     *
                     * @param {string} name nome dell'elemento HTML
                     * @return {HTMLInputElement} l'HTMLInputElement con la stringa come nome
                     * @private
                     */
                    /*private*/ getInputElem(name) {
                        return document.querySelector("[name=\'" + name + "\']");
                    }
                    /**
                     * Controlla che sia stato selezionato almeno una lingua madre e se le password
                     * coincidano. Mostra un alert di avviso in entrambi i casi
                     *
                     * @param event l
                     * @return
                     * @return {boolean}
                     * @private
                     */
                    /*private*/ checkForm() {
                        if ($("input[type=\'checkbox\']:checked").length === 0) {
                            alert("You must choose at least 1 Main Language!");
                            return false;
                        }
                        else if (!((o1, o2) => { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(this.getInputElem("password").value, this.getInputElem("confirm-password").value))
                            alert("Passwords don\'t match!");
                        return true;
                    }
                }
                user.Signup = Signup;
                Signup["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.user.Signup";
            })(user = FabbricaSemanticaJSweet.user || (FabbricaSemanticaJSweet.user = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.user.Signup.LANGUAGE_LEVELS_$LI$();
it.uniroma1.FabbricaSemanticaJSweet.user.Signup.main(null);
