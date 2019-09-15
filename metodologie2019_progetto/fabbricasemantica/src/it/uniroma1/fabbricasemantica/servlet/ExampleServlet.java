package it.uniroma1.fabbricasemantica.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.user.XMLWriter;

@WebServlet(name="ExampleServlet", urlPatterns="/example.jsp")
public class ExampleServlet extends BaseServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String translation = (String) request.getParameter("translation");
		if (translation == null || translation.isEmpty())
			out.append("Nessuna traduzione");
		else
			out.append("La tua risposta: '" + translation + "'");
		
		XMLWriter test = new XMLWriter("users");
		test.addUser("gasptube@gmail.com", "test", "Italian");
		test.saveFile();
	}

}
