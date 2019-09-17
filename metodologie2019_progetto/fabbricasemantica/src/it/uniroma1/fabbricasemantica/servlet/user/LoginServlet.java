package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.data.management.XMLUserReader;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;


@WebServlet(name="LoginServlet", urlPatterns="/login.jsp")
public class LoginServlet extends BaseServlet
{
	private static final long serialVersionUID = 8484501789787L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		XMLUserReader usersData = new XMLUserReader();
		if (usersData.checkForUser(username, password))
		{
			logIn(request, username);
			response.sendRedirect("home.html");
		}
		else
			response.sendRedirect("login.html");
	}
	
	protected static void logIn(HttpServletRequest request, String username)
	{
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
	}
}
