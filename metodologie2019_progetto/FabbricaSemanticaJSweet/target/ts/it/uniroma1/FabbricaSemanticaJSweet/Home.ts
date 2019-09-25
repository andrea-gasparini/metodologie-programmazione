/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet {
    export class Home extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
        public static main(args : string[]) {
            new Home(it.uniroma1.FabbricaSemanticaJSweet.PageType.HOME_PAGE);
        }

        public constructor(pageName : it.uniroma1.FabbricaSemanticaJSweet.PageType) {
            super(pageName);
            $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("play-border").addClass("vertical container clickable").build());
            $("#play-border").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-box").addClass("vertical container").build());
            $("#play-box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("play-triangle").build());
            $.get("./randomTask.jsp", (result, a, ctx) => {
                (<HTMLAnchorElement>document.getElementById("play-border")).href = <string>result;
                return null;
            });
        }
    }
    Home["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.Home";

}


it.uniroma1.FabbricaSemanticaJSweet.Home.main(null);
