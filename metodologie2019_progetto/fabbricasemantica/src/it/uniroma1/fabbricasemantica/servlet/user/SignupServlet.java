package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.management.XMLUserReader;
import it.uniroma1.fabbricasemantica.data.management.XMLUserWriter;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

/**
 * La servlet SignupServlet riceve i dati di registrazione di un nuovo utente e
 * controlla se l'email sia gia' registrata nella base di dati o se le due
 * password non combacino, in caso positivo reindirizza alla pagina di
 * registrazione, altrimenti aggiunge il nuovo utente alla base di dati,
 * effettua l'accesso e reindirizza alla pagina home.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name="SignupServlet", urlPatterns="/signup.jsp")
public class SignupServlet extends BaseServlet 
{
	private static final long serialVersionUID = 8484501789787L;

	/**
	 * Richiede i dati di registrazione (email, password, password di conferma,
	 * lingue principali ed eventuali altre lingue) al client e controlla se l'email
	 * sia gia' registrata nella base di dati o se le due password non combacino, in
	 * caso positivo reindirizza alla pagina di registrazione, altrimenti aggiunge
	 * il nuovo utente alla base di dati, effettua l'accesso e reindirizza alla
	 * pagina home.
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirm-password");
		String[] mainLanguages = request.getParameterValues("language-checkbox");
		String[] otherLanguages = request.getParameterValues("other-language");
		String[] languageLevels = request.getParameterValues("language-level");

		XMLUserWriter usersData = new XMLUserWriter();
		if (new XMLUserReader().checkForElement("username", username) || ! (password.equals(confirmPassword)))
			response.sendRedirect("signup.html");
		else
		{
			usersData.addUser(username, password, mainLanguages, otherLanguages, languageLevels);
			usersData.saveFile();	
			LoginServlet.logIn(request, username);
			response.sendRedirect("home.html");
		}
	} 
}
