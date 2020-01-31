/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            /**
             * Costruisce una Pagina di FabbricaSemantica con la barra di navigazione base e
             * i pulsanti di navigazione (che rimandano alle pagine principali del sito web)
             * diversi a seconda del tipo di pagina specificato come parametro.
             *
             * @param {it.uniroma1.FabbricaSemanticaJSweet.PageType} pageName il tipo di pagina
             * @class
             * @author Andrea Gasparini (1813486)
             */
            class FabbricaSemanticaPage {
                constructor(pageName) {
                    let changePage = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("change-page");
                    $("body").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("page").addClass("vertical container").build());
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("navbar").addClass("horizontal container").build());
                    $("#navbar").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder(2, "website-title").addText("FabbricaSemantica").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("menu").build());
                    switch ((pageName)) {
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.LOGIN_PAGE:
                            $("#menu").append(this.createActualButton("Log in"), changePage.addHref("./signup.html").build());
                            $("#change-page").append(this.createOtherButton("Sign up"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.SIGNUP_PAGE:
                            $("#menu").append(changePage.addHref("./login.html").build(), this.createActualButton("Sign up"));
                            $("#change-page").append(this.createOtherButton("Log in"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.HOME_PAGE:
                            this.checkLoggedIn();
                            $("#menu").append(this.createActualButton("Home"), changePage.addHref("./logout.jsp").build());
                            $("#change-page").append(this.createOtherButton("Log out"));
                            break;
                        case it.uniroma1.FabbricaSemanticaJSweet.PageType.TASK_PAGE:
                            this.checkLoggedIn();
                            $("#menu").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("home").addHref("./home.html").build(), changePage.addHref("./logout.jsp").build());
                            $("#home").append(this.createOtherButton("Home"));
                            $("#change-page").append(this.createOtherButton("Log out"));
                            break;
                    }
                }
                /**
                 * Crea un pulsante HTML per il menu di navigazione
                 *
                 * @param {boolean} actualPage true se il pulsante rappresenta la pagina attuale, false altrimenti
                 * @param {string} text l'etichetta da inserire nel bottone
                 * @return {HTMLButtonElement} il pulsante HTML
                 * @private
                 */
                /*private*/ createMenuButton(actualPage, text) {
                    return new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder(actualPage ? "actual-page" : "other-page").addClass("menu-button").addText(text).build();
                }
                /**
                 * Crea un pulsante HTML rappresentante la pagina attuale per il menu di
                 * navigazione
                 *
                 * @param {string} text l'etichetta da inserire nel bottone
                 * @return {HTMLButtonElement} il pulsante HTML
                 * @private
                 */
                /*private*/ createActualButton(text) {
                    return this.createMenuButton(true, text);
                }
                /**
                 * Crea un pulsante HTML rappresentante un'altra pagina del sito web per il menu
                 * di navigazione
                 *
                 * @param {string} text l'etichetta da inserire nel bottone
                 * @return {HTMLButtonElement} il pulsante HTML
                 * @private
                 */
                /*private*/ createOtherButton(text) {
                    return this.createMenuButton(false, text);
                }
                /**
                 * Effettua una chiamata alla servlet di controllo autenticazione e rimanda alla
                 * pagina di login se nessun utente risulta loggato
                 * @private
                 */
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
