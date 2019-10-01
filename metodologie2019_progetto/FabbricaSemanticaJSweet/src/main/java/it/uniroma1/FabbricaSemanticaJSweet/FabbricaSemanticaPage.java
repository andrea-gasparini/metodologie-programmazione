package it.uniroma1.FabbricaSemanticaJSweet;
//TODO Javadoc everywhere
import static def.jquery.Globals.$;
import static def.dom.Globals.window;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder;
import def.dom.HTMLButtonElement;
import def.jquery.JQueryXHR;

public class FabbricaSemanticaPage 
{
	public FabbricaSemanticaPage(PageType pageName)
	{
		HTMLAnchorElementBuilder changePage = new HTMLAnchorElementBuilder("change-page");
		$("body").append(new HTMLDivElementBuilder("page").addClass("vertical container").build());
		$("#page").append(new HTMLDivElementBuilder("navbar").addClass("horizontal container").build());
		$("#navbar").append(
				new HTMLHeadingElementBuilder(2, "website-title").addText("FabbricaSemantica").build(),
				new HTMLDivElementBuilder("menu").build());
		
		switch(pageName)
		{
			case LOGIN_PAGE:
				$("#menu").append(createMenuButton("actual-page", "Log in"), changePage.addHref("./signup.html").build());
				$("#change-page").append(createMenuButton("other-page", "Sign up"));
				break;
			case SIGNUP_PAGE:	
				$("#menu").append(changePage.addHref("./login.html").build(), createMenuButton("actual-page", "Sign up"));
				$("#change-page").append(createMenuButton("other-page", "Log in"));
				break;
			case HOME_PAGE:
				checkLoggedIn();
				$("#menu").append(createMenuButton("actual-page", "Home"), changePage.addHref("./logout.jsp").build());
				$("#change-page").append(createMenuButton("other-page", "Log out"));
				break;
			case TASK_PAGE:
				checkLoggedIn();
				$("#menu").append(new HTMLAnchorElementBuilder("home").addHref("./home.html").build(), changePage.addHref("./logout.jsp").build());
				$("#home").append(createMenuButton("other-page", "Home"));
				$("#change-page").append(createMenuButton("other-page", "Log out"));
				break;
		}
	}
	
	private HTMLButtonElement createMenuButton(String page, String text) 
	{
		return new HTMLButtonElementBuilder(page).addClass("menu-button").addText(text).build();
	}
	
	private void checkLoggedIn()
	{
		$.get("./isLoggedIn.jsp", (Object result, String a, JQueryXHR ctx) -> 
		{ 
			if (((String) result).equals("false"))
				window.location.replace("./login.html");
			return null;
		});
	}
}
