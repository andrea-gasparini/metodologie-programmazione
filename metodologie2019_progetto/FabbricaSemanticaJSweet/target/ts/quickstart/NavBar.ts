/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace quickstart {
    export class Navbar {
        public constructor(pageName : quickstart.PageType) {
            let pageDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("page").addClass("vertical container").toHTMLElement();
            let navbarDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("navbar").addClass("horizontal container").toHTMLElement();
            let websiteTitle : HTMLHeadingElement = new it.uniroma1.HTMLElementsBuilders.HTMLHeadingElementBuilder(2, "website-title").addText("FabbricaSemantica").toHTMLElement();
            let menuDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("menu").toHTMLElement();
            let loginButton : HTMLButtonElement;
            let signupButton : HTMLButtonElement;
            let changePage : HTMLAnchorElement = document.createElement("a");
            $(pageDiv).append(navbarDiv);
            $(navbarDiv).append(websiteTitle, menuDiv);
            switch((pageName)) {
            case quickstart.PageType.LOGIN_PAGE:
                loginButton = this.createLoginButton("actual-page");
                changePage.href = "./signup.html";
                signupButton = this.createSignupButton("other-page");
                $(menuDiv).append(loginButton, changePage);
                $(changePage).append(signupButton);
                break;
            case quickstart.PageType.SIGNUP_PAGE:
                loginButton = this.createLoginButton("other-page");
                changePage.href = "./login.html";
                signupButton = this.createSignupButton("actual-page");
                $(menuDiv).append(changePage, signupButton);
                $(changePage).append(loginButton);
                break;
            default:
                let logoutButton : HTMLButtonElement = new it.uniroma1.HTMLElementsBuilders.HTMLButtonElementBuilder("other-page").addClass("menu-button").addText("Log out").toHTMLElement();
                changePage.href = "./login.html";
                $(menuDiv).append(changePage);
                $(changePage).append(logoutButton);
                break;
            }
            $("body").append(pageDiv);
        }

        /*private*/ createLoginButton(page : string) : HTMLButtonElement {
            return new it.uniroma1.HTMLElementsBuilders.HTMLButtonElementBuilder(page).addClass("menu-button").addText("Log in").toHTMLElement();
        }

        /*private*/ createSignupButton(page : string) : HTMLButtonElement {
            return new it.uniroma1.HTMLElementsBuilders.HTMLButtonElementBuilder(page).addClass("menu-button").addText("Sign up").toHTMLElement();
        }
    }
    Navbar["__class"] = "quickstart.Navbar";

}

