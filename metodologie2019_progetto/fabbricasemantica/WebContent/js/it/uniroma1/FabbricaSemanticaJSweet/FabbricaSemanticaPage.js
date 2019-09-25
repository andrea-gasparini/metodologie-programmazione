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
                    $("body").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("page").addClass("vertical container").build());
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("navbar").addClass("horizontal container").build());
                    $("#navbar").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder(2, "website-title").addText("FabbricaSemantica").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("menu").build());
                    switch ((pageName)) {
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.LOGIN_PAGE:
                            $("#menu").append(this.createMenuButton("actual-page", "Log in"), changePage.addHref("./signup.html").build());
                            $("#change-page").append(this.createMenuButton("other-page", "Sign up"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.SIGNUP_PAGE:
                            $("#menu").append(changePage.addHref("./login.html").build(), this.createMenuButton("actual-page", "Sign up"));
                            $("#change-page").append(this.createMenuButton("other-page", "Log in"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.HOME_PAGE:
                            this.checkLoggedIn();
                            $("#menu").append(this.createMenuButton("actual-page", "Home"), changePage.addHref("./logout.jsp").build());
                            $("#change-page").append(this.createMenuButton("other-page", "Log out"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.TASK_PAGE:
                            this.checkLoggedIn();
                            $("#menu").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("home").addHref("./home.html").build(), changePage.addHref("./logout.jsp").build());
                            $("#home").append(this.createMenuButton("other-page", "Home"));
                            $("#change-page").append(this.createMenuButton("other-page", "Log out"));
                            break;
                    }
                }
                /*private*/ createMenuButton(page, text) {
                    return new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder(page).addClass("menu-button").addText(text).build();
                }
                /*private*/ checkLoggedIn() {
                    $.get("./isLoggedIn.jsp", (result, a, ctx) => {
                        if (((o1, o2) => { if (o1 && o1.equals) {
                            return o1.equals(o2);
                        }
                        else {
                            return o1 === o2;
                        } })(result, "false"))
                            window.location.replace("./login.html");
                        return null;
                    });
                }
            }
            FabbricaSemanticaJSweet.FabbricaSemanticaPage = FabbricaSemanticaPage;
            FabbricaSemanticaPage["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage";
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
