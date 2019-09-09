package it.uniroma1.FabbricaSemanticaJSweet;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;

public class Home extends FabbricaSemanticaPage
{
	public static void main(String[] args) { new Home(PageType.HOME_PAGE); }
	
	public Home(PageType pageName)
	{		
		super(pageName);
		$("#page").append(new HTMLDivElementBuilder("play-border").addClass("vertical container clickable").toHTMLElement());
		$("#play-border").append(new HTMLDivElementBuilder("play-box").addClass("vertical container").toHTMLElement());
		$("#play-box").append(new HTMLDivElementBuilder("play-triangle").toHTMLElement());
	}
}
