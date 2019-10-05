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

/**
 * La classe FabbricaSemanticaPage rappresenta la struttura base di ogni pagina
 * del sito web. Contiene la barra di navigazione base con funzionalità diverse
 * a seconda del tipo di pagina web che si andrà ad implementare.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class FabbricaSemanticaPage 
{
	/**
	 * Costruisce una Pagina di FabbricaSemantica con la barra di navigazione base e
	 * i pulsanti di navigazione (che rimandano alle pagine principali del sito web)
	 * diversi a seconda del tipo di pagina specificato come parametro.
	 * 
	 * @param pageName il tipo di pagina
	 */
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
				$("#menu").append(createActualButton("Log in"), changePage.addHref("./signup.html").build());
				$("#change-page").append(createOtherButton("Sign up"));
				break;
			case SIGNUP_PAGE:	
				$("#menu").append(changePage.addHref("./login.html").build(), createActualButton("Sign up"));
				$("#change-page").append(createOtherButton("Log in"));
				break;
			case HOME_PAGE:
				checkLoggedIn();
				$("#menu").append(createActualButton("Home"), changePage.addHref("./logout.jsp").build());
				$("#change-page").append(createOtherButton("Log out"));
				break;
			case TASK_PAGE:
				checkLoggedIn();
				$("#menu").append(new HTMLAnchorElementBuilder("home").addHref("./home.html").build(), changePage.addHref("./logout.jsp").build());
				$("#home").append(createOtherButton("Home"));
				$("#change-page").append(createOtherButton("Log out"));
				break;
		}
	}
	
	/**
	 * Crea un pulsante HTML per il menu di navigazione
	 * 
	 * @param actualPage true se il pulsante rappresenta la pagina attuale, false altrimenti
	 * @param text l'etichetta da inserire nel bottone
	 * @return il pulsante HTML
	 */
	private HTMLButtonElement createMenuButton(boolean actualPage, String text) 
	{
		return new HTMLButtonElementBuilder(actualPage ? "actual-page" : "other-page").addClass("menu-button").addText(text).build();
	}
	
	/**
	 * Crea un pulsante HTML rappresentante la pagina attuale per il menu di
	 * navigazione
	 * 
	 * @param text l'etichetta da inserire nel bottone
	 * @return il pulsante HTML
	 */
	private HTMLButtonElement createActualButton(String text) { return createMenuButton(true, text); }
	
	/**
	 * Crea un pulsante HTML rappresentante un'altra pagina del sito web per il menu
	 * di navigazione
	 * 
	 * @param text l'etichetta da inserire nel bottone
	 * @return il pulsante HTML
	 */
	private HTMLButtonElement createOtherButton(String text) { return createMenuButton(false, text); }
	
	/**
	 * Effettua una chiamata alla servlet di controllo autenticazione e rimanda alla
	 * pagina di login se nessun utente risulta loggato
	 */
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
