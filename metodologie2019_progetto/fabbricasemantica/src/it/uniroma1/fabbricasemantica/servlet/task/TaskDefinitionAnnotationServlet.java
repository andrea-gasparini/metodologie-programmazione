package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.data.StandardTask;
import it.uniroma1.fabbricasemantica.data.management.XMLTaskWriter;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;
import it.uniroma1.fabbricasemantica.servlet.RandomTaskServlet;

@WebServlet(name = "TaskDefinitionAnnotationServlet", urlPatterns = "/definitionAnnotation.jsp")
public class TaskDefinitionAnnotationServlet extends BaseServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		if (request.getParameter("submit") != null)
		{
			String word = request.getParameter("word");
			String hypernym = request.getParameter("hypernym");
			String translation = request.getParameter("translation");
			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			
			XMLTaskWriter taskData = new XMLTaskWriter();
			taskData.addResponse(username, StandardTask.DEFINITION_ANNOTATION, new String[] {"word", "hypernym"}, new String[] {word, hypernym}, translation);
			taskData.saveFile();
		}
		
		response.sendRedirect(RandomTaskServlet.getRandomTaskUrl());
	}
}
