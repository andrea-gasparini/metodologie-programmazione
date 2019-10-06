package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

/**
 * La servlet LogoutServlet termina la sessione dell'utente attuale e
 * reindirizza alla pagina di accesso.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name="LogoutServlet", urlPatterns="/logout.jsp")
public class LogoutServlet extends BaseServlet 
{
	private static final long serialVersionUID = 8484501789787L;

	/**
	 * Termina la sessione dell'utente, impostando a null l'attributo username, e
	 * reindirizza alla pagina d'accesso
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		session.setAttribute("username", null);
		response.sendRedirect("login.html");
	}
}
