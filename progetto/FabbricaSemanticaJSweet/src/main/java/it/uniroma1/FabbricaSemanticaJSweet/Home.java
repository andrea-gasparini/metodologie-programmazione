package it.uniroma1.FabbricaSemanticaJSweet;

import static def.dom.Globals.document;
import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.jquery.JQueryXHR;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;

/**
 * La classe Home rappresenta la pagina di base successiva all'autenticazione.
 * Permette all’utente di iniziare ad utilizzare FabbricaSemantica e ad eseguire
 * i task di Annotazione/Validazione.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class Home extends FabbricaSemanticaPage
{
	/**
	 * Crea la pagina Home
	 */
	public static void main(String[] args) { new Home(); }
	
	/**
	 * Costruisce la pagina Home con un pulsante centrale di avvio dei Task di
	 * FabbricaSemantica e ci aggiunge l'indirizzo di un task casuale
	 */
	public Home()
	{		
		super(PageType.HOME_PAGE);
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
