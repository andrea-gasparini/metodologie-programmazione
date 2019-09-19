/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet {
    export class Login extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
        public static main(args : string[]) {
            new Login(it.uniroma1.FabbricaSemanticaJSweet.PageType.LOGIN_PAGE);
        }

        public constructor(pageName : it.uniroma1.FabbricaSemanticaJSweet.PageType) {
            super(pageName);
            $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").build());
            $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder().addText("Welcome Back!").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please log in :-)").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./login.jsp").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("bottom-text").addText("Don\'t have an account? ").build());
            $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Email Address").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("email").addType("email").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Password").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addName("password").addType("password").isRequired().build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder("login").addType("submit").addValue("Log in").build());
            $("#bottom-text").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("change-page").addHref("./signup.html").addText("Sign up!").build());
        }
    }
    Login["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.Login";

}


it.uniroma1.FabbricaSemanticaJSweet.Login.main(null);
