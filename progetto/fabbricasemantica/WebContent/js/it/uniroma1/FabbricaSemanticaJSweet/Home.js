/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            /**
             * Costruisce la pagina Home con un pulsante centrale di avvio dei Task di
             * FabbricaSemantica e ci aggiunge l'indirizzo di un task casuale
             * @class
             * @extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage
             * @author Andrea Gasparini (1813486)
             */
            class Home extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
                constructor() {
                    super(it.uniroma1.FabbricaSemanticaJSweet.PageType.HOME_PAGE);
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("play-border").addClass("vertical container clickable").build());
                    $("#play-border").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-box").addClass("vertical container").build());
                    $("#play-box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-triangle").build());
                    $.get("./randomTask.jsp", (result, a, ctx) => {
                        document.getElementById("play-border").href = result;
                        return null;
                    });
                }
                /**
                 * Crea la pagina Home
                 * @param {Array} args
                 */
                static main(args) {
                    new Home();
                }
            }
            FabbricaSemanticaJSweet.Home = Home;
            Home["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.Home";
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.Home.main(null);
