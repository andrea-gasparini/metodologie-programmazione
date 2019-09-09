/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace quickstart {
    export class Home {
        public static main(args : string[]) {
            new quickstart.Navbar(quickstart.PageType.HOME_PAGE);
            let playBorderDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("play-border").addClass("vertical container clickable").toHTMLElement();
            let playBoxDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("play-box").addClass("vertical container").toHTMLElement();
            let playTriangleDiv : HTMLDivElement = new it.uniroma1.HTMLElementsBuilders.HTMLDivElementBuilder("play-triangle").toHTMLElement();
            $("#page").append(playBorderDiv);
            $(playBorderDiv).append(playBoxDiv);
            $(playBoxDiv).append(playTriangleDiv);
        }
    }
    Home["__class"] = "quickstart.Home";

}


quickstart.Home.main(null);
