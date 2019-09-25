/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            class Home extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
                constructor(pageName) {
                    super(pageName);
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("play-border").addClass("vertical container clickable").build());
                    $("#play-border").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-box").addClass("vertical container").build());
                    $("#play-box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-triangle").build());
                    $.get("./randomTask.jsp", (result, a, ctx) => {
                        document.getElementById("play-border").href = result;
                        return null;
                    });
                }
                static main(args) {
                    new Home(it.uniroma1.FabbricaSemanticaJSweet.PageType.HOME_PAGE);
                }
            }
            FabbricaSemanticaJSweet.Home = Home;
            Home["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.Home";
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.Home.main(null);
