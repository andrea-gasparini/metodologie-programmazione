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
                 * Costruisce la pagina Login con un titolo di bentornato, i campi obbligatori da
                 * inserire per effettuare l'accesso e un riferimento alla pagina di
                 * registrazione.
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage
                 * @author Andrea Gasparini (1813486)
                 */
                class Login extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
                    constructor() {
                        super(it.uniroma1.FabbricaSemanticaJSweet.PageType.LOGIN_PAGE);
                        $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").build());
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder().addText("Welcome Back!").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please log in :-)").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./login.jsp").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("bottom-text").addText("Don\'t have an account? ").build());
                        $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Email Address").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("email").addType("email").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Password").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("password").addType("password").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder("login").addType("submit").addValue("Log in").build());
                        $("#bottom-text").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("change-page").addHref("./signup.html").addText("Sign up!").build());
                    }
                    /**
                     * Crea la pagina Login
                     * @param {Array} args
                     */
                    static main(args) {
                        new Login();
                    }
                }
                user.Login = Login;
                Login["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.user.Login";
            })(user = FabbricaSemanticaJSweet.user || (FabbricaSemanticaJSweet.user = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.user.Login.main(null);
