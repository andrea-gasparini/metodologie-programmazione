/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace quickstart {
    export class Login {
        public static main(args : string[]) {
            new quickstart.Navbar(quickstart.PageType.LOGIN_PAGE);
            let boxDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").toHTMLElement();
            let loginTitle : HTMLHeadingElement = new it.uniroma1.HTMLElementsBuilders.HTMLHeadingElementBuilder().addText("Welcome Back!").toHTMLElement();
            let loginSubTitle : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please log in to play :-)").toHTMLElement();
            let formElem : HTMLFormElement = new it.uniroma1.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container").toHTMLElement();
            let labelEmail : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Email Address").toHTMLElement();
            let inputEmail : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addType("email").toHTMLElement();
            let labelPassword : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Password").toHTMLElement();
            let inputPassword : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addType("password").toHTMLElement();
            let inputLoginButton : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder("login").addType("submit").addValue("Log in").toHTMLElement();
            let noAccountText : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder("signup-text").addText("Don\'t have an account? ").toHTMLElement();
            let toSignupPage : HTMLAnchorElement = new it.uniroma1.HTMLElementsBuilders.HTMLAnchorElementBuilder("signup").addHref("./signup.html").addText("Sign up!").toHTMLElement();
            $("#page").append(boxDiv);
            $(boxDiv).append(loginTitle, loginSubTitle, formElem, noAccountText);
            $(formElem).append(labelEmail, inputEmail, labelPassword, inputPassword, inputLoginButton);
            $(noAccountText).append(toSignupPage);
        }
    }
    Login["__class"] = "quickstart.Login";

}


quickstart.Login.main(null);
