/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace it.uniroma1.FabbricaSemanticaJSweet {
    /**
     * Costruisce la pagina Home con un pulsante centrale di avvio dei Task di
     * FabbricaSemantica e ci aggiunge l'indirizzo di un task casuale
     * @class
     * @extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage
     * @author Andrea Gasparini (1813486)
     */
    export class Home extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
        /**
         * Crea la pagina Home
         * @param {Array} args
         */
        public static main(args : string[]) {
            new Home();
        }

        public constructor() {
            super(it.uniroma1.FabbricaSemanticaJSweet.PageType.HOME_PAGE);
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
