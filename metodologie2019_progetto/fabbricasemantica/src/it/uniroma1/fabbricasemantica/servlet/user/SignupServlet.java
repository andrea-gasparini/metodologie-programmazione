package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.user.XMLReader;
import it.uniroma1.fabbricasemantica.data.user.XMLWriter;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name="SignupServlet", urlPatterns="/signup.jsp")
public class SignupServlet extends BaseServlet 
{
	private static final long serialVersionUID = 8484501789787L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("email");
		String password = request.getParameter("password");
//		String mainlanguage = request.getParameter("mainlanguage");
		
		//TODO il controllo password andrebbe fatto da back-end, ora è implementato in JS
		XMLWriter usersData = new XMLWriter("users");
		if (new XMLReader("users").checkForElement("username", username))
		{
			//TODO andrà implementato un "alert" o basta il refresh della pagina?
			response.sendRedirect("signup.html");
		}
		else
		{
			usersData.addUser(username, password, "test");
			usersData.saveFile();		
			response.sendRedirect("home.html");
		}
	} 
}
