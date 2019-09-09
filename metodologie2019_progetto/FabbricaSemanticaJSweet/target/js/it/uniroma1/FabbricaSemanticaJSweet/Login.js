/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            class Login extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
                constructor(pageName) {
                    super(pageName);
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").toHTMLElement());
                    $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder().addText("Welcome Back!").toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please log in to play :-)").toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./login.jsp").toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("bottom-text").addText("Don\'t have an account? ").toHTMLElement());
                    $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Email Address").toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addType("email").isRequired().toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Password").toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addType("password").isRequired().toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder("login").addType("submit").addValue("Log in").toHTMLElement());
                    $("#bottom-text").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("change-page").addHref("./signup.html").addText("Sign up!").toHTMLElement());
                }
                static main(args) {
                    new Login(it.uniroma1.FabbricaSemanticaJSweet.PageType.LOGIN_PAGE);
                }
            }
            FabbricaSemanticaJSweet.Login = Login;
            Login["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.Login";
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.Login.main(null);
