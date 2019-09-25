package it.uniroma1.FabbricaSemanticaJSweet;

import static def.dom.Globals.document;
import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.jquery.JQueryXHR;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;

public class Home extends FabbricaSemanticaPage
{
	public static void main(String[] args) { new Home(PageType.HOME_PAGE); }
	
	public Home(PageType pageName)
	{		
		super(pageName);
		$("#page").append(new HTMLAnchorElementBuilder("play-border").addClass("vertical container clickable").build());
		$("#play-border").append(new HTMLDivElementBuilder("play-box").addClass("vertical container").build());
		$("#play-box").append(new HTMLDivElementBuilder("play-triangle").build());

		$.get("./randomTask.jsp", (Object result, String a, JQueryXHR ctx) -> 
		{ 
			((HTMLAnchorElement) document.getElementById("play-border")).href = (String) result;
			return null;
		});
	}
}
