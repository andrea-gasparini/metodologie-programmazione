/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            class Navbar {
                constructor(pageName) {
                    let changePage = document.createElement("a");
                    $("body").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("page").addClass("vertical container").toHTMLElement());
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("navbar").addClass("horizontal container").toHTMLElement());
                    $("#navbar").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder(2, "website-title").addText("FabbricaSemantica").toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("menu").toHTMLElement());
                    switch ((pageName)) {
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.LOGIN_PAGE:
                            changePage.href = "./signup.html";
                            $("#menu").append(this.createMenuButton("actual-page", "Log in"), changePage);
                            $(changePage).append(this.createMenuButton("other-page", "Sign up"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.SIGNUP_PAGE:
                            changePage.href = "./login.html";
                            $("#menu").append(changePage, this.createMenuButton("actual-page", "Sign up"));
                            $(changePage).append(this.createMenuButton("other-page", "Log in"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.HOME_PAGE:
                            changePage.href = "./logout.jsp";
                            $("#menu").append(this.createMenuButton("actual-page", "Home"), changePage);
                            $(changePage).append(this.createMenuButton("other-page", "Log out"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.ANNOTATION_GAME_PAGE:
                            changePage.href = "./logout.jsp";
                            $("#menu").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("home").toHTMLElement(), changePage);
                            $("#home").append(this.createMenuButton("other-page", "Home"));
                            $(changePage).append(this.createMenuButton("other-page", "Log out"));
                            break;
                    }
                }
                /*private*/ createMenuButton(page, text) {
                    return new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder(page).addClass("menu-button").addText(text).toHTMLElement();
                }
            }
            FabbricaSemanticaJSweet.Navbar = Navbar;
            Navbar["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.Navbar";
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
