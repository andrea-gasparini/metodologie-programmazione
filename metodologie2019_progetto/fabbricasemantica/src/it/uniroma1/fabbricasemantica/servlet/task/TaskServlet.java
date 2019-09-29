package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.data.Task;
import it.uniroma1.fabbricasemantica.data.management.XMLTaskWriter;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;
import it.uniroma1.fabbricasemantica.servlet.RandomTaskServlet;

public class TaskServlet extends BaseServlet
{
	private static final long serialVersionUID = 1L;

	private Task taskName;
	
	private String[] contextElemNames;
	
	private String responseName;
	
	public void init(Task taskName, String[] contextElemNames, String responseName) throws ServletException
	{
		this.taskName = taskName;
		this.contextElemNames = contextElemNames;
		this.responseName = responseName;
	}
	
	public void init(Task taskName, String[] contextElemNames) throws ServletException { init(taskName, contextElemNames, "response"); }	
	
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		if (request.getParameter("submit") != null)
		{
			String[] contextElems = new String[contextElemNames.length];
			for (int i = 0; i < contextElemNames.length; i++)
				contextElems[i] = request.getParameter(contextElemNames[i]);
			String answer = request.getParameter(responseName);
			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			
			XMLTaskWriter taskData = new XMLTaskWriter();
			taskData.addResponse(username, taskName, contextElemNames, contextElems, answer);
			taskData.saveFile();
		}

		response.sendRedirect(RandomTaskServlet.getRandomTaskUrl());
	}
}
