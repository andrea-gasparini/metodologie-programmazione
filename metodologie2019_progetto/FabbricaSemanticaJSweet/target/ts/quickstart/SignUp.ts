/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace quickstart {
    export class Signup {
        public static main(args : string[]) {
            new quickstart.Navbar(quickstart.PageType.SIGNUP_PAGE);
            let boxDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").toHTMLElement();
            let loginTitle : HTMLHeadingElement = new it.uniroma1.HTMLElementsBuilders.HTMLHeadingElementBuilder().addText("Welcome!").toHTMLElement();
            let loginSubTitle : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please register a new account to be able to play :-)").toHTMLElement();
            let formElem : HTMLFormElement = new it.uniroma1.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container").toHTMLElement();
            let labelEmail : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Email Address*").toHTMLElement();
            let inputEmail : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addType("email").toHTMLElement();
            let labelPassword : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Password*").toHTMLElement();
            let inputPassword : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addType("password").toHTMLElement();
            let labelConfirmPassword : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Confirm Password*").toHTMLElement();
            let inputConfirmPassword : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").addType("password").toHTMLElement();
            let languagesDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("languages").addClass("horizontal container").toHTMLElement();
            let languagesLeftDiv : HTMLDivElement = document.createElement("div");
            let mainLanguagesSpan : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Main Language(s)*").toHTMLElement();
            let checkboxListDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("checkbox-list").addClass("vertical container").toHTMLElement();
            let firstCheckboxDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("checkbox-text").toHTMLElement();
            let firstCheckbox : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addType("checkbox").toHTMLElement();
            let firstCheckboxSpan : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("margin-left: 5px;").addText("English").toHTMLElement();
            let secondCheckboxDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("checkbox-text").toHTMLElement();
            let secondCheckbox : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addType("checkbox").toHTMLElement();
            let secondCheckboxSpan : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addCss("margin-left: 5px;").addText("Italiano").toHTMLElement();
            let languagesRightDiv : HTMLDivElement = document.createElement("div");
            let otherLanguagesSpan : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("form-text").addText("Other Languages").toHTMLElement();
            let otherLanguagesDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("vertical container").toHTMLElement();
            let firstOtherLanguageDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("other-language horizontal container").toHTMLElement();
            let firstOtherLanguageInput : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("language-field").toHTMLElement();
            let firstOtherLanguageSelect : HTMLSelectElement = document.createElement("select");
            firstOtherLanguageSelect.className = "level-select";
            firstOtherLanguageSelect.innerHTML = "<option>A1</option><option>A2</option><option>B1</option><option>B2</option><option>C1</option><option>C2</option>";
            let secondOtherLanguageDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("other-language horizontal container").toHTMLElement();
            let secondOtherLanguageInput : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("language-field").toHTMLElement();
            let secondOtherLanguageSelect : HTMLSelectElement = document.createElement("select");
            secondOtherLanguageSelect.className = "level-select";
            secondOtherLanguageSelect.innerHTML = "<option>A1</option><option>A2</option><option>B1</option><option>B2</option><option>C1</option><option>C2</option>";
            let inputLoginButton : HTMLInputElement = new it.uniroma1.HTMLElementsBuilders.HTMLInputElementBuilder("signup").addType("submit").addValue("Sign up").toHTMLElement();
            let alreadyHaveAccountText : HTMLSpanElement = new it.uniroma1.HTMLElementsBuilders.HTMLSpanElementBuilder("login-text").addText("Already have an account? ").toHTMLElement();
            let toLoginPage : HTMLAnchorElement = new it.uniroma1.HTMLElementsBuilders.HTMLAnchorElementBuilder("login").addHref("./login.html").addText("Log in!").toHTMLElement();
            $("#page").append(boxDiv);
            $(boxDiv).append(loginTitle, loginSubTitle, formElem, alreadyHaveAccountText);
            $(formElem).append(labelEmail, inputEmail, labelPassword, inputPassword, labelConfirmPassword, inputConfirmPassword, languagesDiv, inputLoginButton);
            $(languagesDiv).append(languagesLeftDiv, languagesRightDiv);
            $(languagesLeftDiv).append(mainLanguagesSpan, checkboxListDiv);
            $(checkboxListDiv).append(firstCheckboxDiv, secondCheckboxDiv);
            $(firstCheckboxDiv).append(firstCheckbox, firstCheckboxSpan);
            $(secondCheckboxDiv).append(secondCheckbox, secondCheckboxSpan);
            $(languagesRightDiv).append(otherLanguagesSpan, otherLanguagesDiv);
            $(otherLanguagesDiv).append(firstOtherLanguageDiv, secondOtherLanguageDiv);
            $(firstOtherLanguageDiv).append(firstOtherLanguageInput, firstOtherLanguageSelect);
            $(secondOtherLanguageDiv).append(secondOtherLanguageInput, secondOtherLanguageSelect);
            $(alreadyHaveAccountText).append(toLoginPage);
        }
    }
    Signup["__class"] = "quickstart.Signup";

}


quickstart.Signup.main(null);
