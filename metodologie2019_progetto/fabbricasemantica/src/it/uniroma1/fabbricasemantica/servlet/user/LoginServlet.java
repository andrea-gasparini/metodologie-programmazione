package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.data.management.XMLUserReader;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

/**
 * La servlet LoginServlet riceve i dati di accesso di un utente e controlla se
 * siano presenti nella base di dati, in caso positivo effettua il login e
 * reindirizza alla pagina home, altrimenti alla pagina di login stessa.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name="LoginServlet", urlPatterns="/login.jsp")
public class LoginServlet extends BaseServlet
{
	private static final long serialVersionUID = 8484501789787L;

	/**
	 * Richiede email e password al client e controlla che siano presenti nella base
	 * di dati per effettuare l'accesso. In caso positivo effettua il login e
	 * reindirizza alla pagina home, altrimenti nuovamente alla pagina di login.
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		
		XMLUserReader usersData = new XMLUserReader(Paths.get(getServletContext().getRealPath("/")));
		if (usersData.checkForUser(username, password))
		{
			logIn(request, username);
			response.sendRedirect("home.html");
		}
		else
			response.sendRedirect("login.html");
	}
	
	/**
	 * Data la richiesta HTTP della servlet e una email di accesso, effettua il login
	 * 
	 * @param request richiesta HTTP della servlet
	 * @param username email di accesso
	 */
	protected static void logIn(HttpServletRequest request, String username)
	{
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
	}
}
