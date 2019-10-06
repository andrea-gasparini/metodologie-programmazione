package it.uniroma1.fabbricasemantica.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

/**
 * La servlet AuthenticationServiceServlet restituisce true o false a seconda
 * che l’utente sia loggato o meno al sistema.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name="AuthenticationServiceServlet", urlPatterns="/isLoggedIn.jsp")
public class AuthenticationServiceServlet extends BaseServlet
{
	private static final long serialVersionUID = 8484501789787L;

	/**
	 * Controlla che nella sessione sia presente un username e restituisce true in
	 * caso positivo, false altrimenti
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		boolean isLoggedIn = session.getAttribute("username") != null;
		response.getWriter().write(isLoggedIn + "");
	}
}
