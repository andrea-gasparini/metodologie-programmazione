/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            class FabbricaSemanticaPage {
                constructor(pageName) {
                    let changePage = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("change-page");
                    $("body").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("page").addClass("vertical container").toHTMLElement());
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("navbar").addClass("horizontal container").toHTMLElement());
                    $("#navbar").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder(2, "website-title").addText("FabbricaSemantica").toHTMLElement(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("menu").toHTMLElement());
                    switch ((pageName)) {
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.LOGIN_PAGE:
                            $("#menu").append(this.createMenuButton("actual-page", "Log in"), changePage.addHref("./signup.html").toHTMLElement());
                            $("#change-page").append(this.createMenuButton("other-page", "Sign up"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.SIGNUP_PAGE:
                            $("#menu").append(changePage.addHref("./login.html").toHTMLElement(), this.createMenuButton("actual-page", "Sign up"));
                            $("#change-page").append(this.createMenuButton("other-page", "Log in"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.HOME_PAGE:
                            $("#menu").append(this.createMenuButton("actual-page", "Home"), changePage.addHref("./logout.jsp").toHTMLElement());
                            $("#change-page").append(this.createMenuButton("other-page", "Log out"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.ANNOTATION_GAME_PAGE:
                            $("#menu").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("home").toHTMLElement(), changePage.addHref("./logout.jsp").toHTMLElement());
                            $("#home").append(this.createMenuButton("other-page", "Home"));
                            $("#change-page").append(this.createMenuButton("other-page", "Log out"));
                            break;
                    }
                }
                /*private*/ createMenuButton(page, text) {
                    return new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder(page).addClass("menu-button").addText(text).toHTMLElement();
                }
            }
            FabbricaSemanticaJSweet.FabbricaSemanticaPage = FabbricaSemanticaPage;
            FabbricaSemanticaPage["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage";
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
