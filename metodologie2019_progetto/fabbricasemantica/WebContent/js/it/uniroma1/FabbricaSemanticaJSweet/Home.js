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
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-border").addClass("vertical container clickable").toHTMLElement());
                    $("#play-border").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-box").addClass("vertical container").toHTMLElement());
                    $("#play-box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-triangle").toHTMLElement());
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
