package it.uniroma1.FabbricaSemanticaJSweet;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder;
import def.dom.HTMLButtonElement;

public class FabbricaSemanticaPage 
{
	public FabbricaSemanticaPage(PageType pageName)
	{
		//TODO Aggiungere un controllo su isLoggedIn.jsp ogni volta che viene caricata una pagina del sito (tranne login e signup)
		HTMLAnchorElementBuilder changePage = new HTMLAnchorElementBuilder("change-page");
		$("body").append(new HTMLDivElementBuilder("page").addClass("vertical container").toHTMLElement());
		$("#page").append(new HTMLDivElementBuilder("navbar").addClass("horizontal container").toHTMLElement());
		$("#navbar").append(
				new HTMLHeadingElementBuilder(2, "website-title").addText("FabbricaSemantica").toHTMLElement(),
				new HTMLDivElementBuilder("menu").toHTMLElement());
		
		switch(pageName)
		{
			case LOGIN_PAGE:
				$("#menu").append(createMenuButton("actual-page", "Log in"), changePage.addHref("./signup.html").toHTMLElement());
				$("#change-page").append(createMenuButton("other-page", "Sign up"));
				break;
			case SIGNUP_PAGE:	
				$("#menu").append(changePage.addHref("./login.html").toHTMLElement(), createMenuButton("actual-page", "Sign up"));
				$("#change-page").append(createMenuButton("other-page", "Log in"));
				break;
			case HOME_PAGE:
				$("#menu").append(createMenuButton("actual-page", "Home"), changePage.addHref("./logout.jsp").toHTMLElement());
				$("#change-page").append(createMenuButton("other-page", "Log out"));
				break;
			default:
				$("#menu").append(new HTMLAnchorElementBuilder("home").toHTMLElement(), changePage.addHref("./logout.jsp").toHTMLElement());
				$("#home").append(createMenuButton("other-page", "Home"));
				$("#change-page").append(createMenuButton("other-page", "Log out"));
				break;
		}
	}
	
	private HTMLButtonElement createMenuButton(String page, String text) 
	{
		return new HTMLButtonElementBuilder(page).addClass("menu-button").addText(text).toHTMLElement();
	}
}
