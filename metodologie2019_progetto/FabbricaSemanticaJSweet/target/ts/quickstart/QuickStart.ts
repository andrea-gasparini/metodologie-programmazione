/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace quickstart {
    export class QuickStart {
        public static main(args : string[]) {
            let pageDiv : HTMLDivElement = document.createElement("div");
            pageDiv.id = "page";
            pageDiv.className = "vertical container";
            let navbarDiv : HTMLDivElement = document.createElement("div");
            navbarDiv.id = "navbar";
            navbarDiv.className = "horizontal container";
            let websiteTitle : HTMLHeadingElement = document.createElement("h1");
            websiteTitle.id = "website-title";
            websiteTitle.innerText = "FabbricaSemantica";
            let menuDiv : HTMLDivElement = document.createElement("div");
            menuDiv.id = "menu";
            let actualPageButton : HTMLButtonElement = document.createElement("button");
            actualPageButton.id = "actual-page";
            actualPageButton.className = "menu-button";
            actualPageButton.innerText = "Log in";
            let toSignUpPage : HTMLAnchorElement = document.createElement("a");
            toSignUpPage.href = "./signup.html";
            let otherPageButton : HTMLButtonElement = document.createElement("button");
            otherPageButton.id = "other-page";
            otherPageButton.className = "menu-button";
            otherPageButton.innerText = "Sign up";
            $("body").append(pageDiv).append(navbarDiv).append(websiteTitle, menuDiv);
            $(menuDiv).append(actualPageButton, toSignUpPage);
            $(toSignUpPage).append(otherPageButton);
        }

        public constructor(actualPage : string) {
        }
    }
    QuickStart["__class"] = "quickstart.QuickStart";

}


quickstart.QuickStart.main(null);
