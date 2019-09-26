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

abstract public class TaskServlet extends BaseServlet
{
	private static final long serialVersionUID = 1L;

	protected Task taskName;
	
	protected String[] params;
	
	HttpServletRequest request;
	
	HttpServletResponse response;
	
	public void init(HttpServletRequest request, HttpServletResponse response, Task taskName, String[] params) throws ServletException
	{
		this.taskName = taskName;
		this.params = params;
		this.request = request;
		this.response = response;
	}
	
	protected void doSomething() throws ServletException, IOException
	{	//TODO modularizzare che altrimenti tutte le servlet hanno il metodo copincollato
		if (request.getParameter("submit") != null)
		{
			String word = request.getParameter(params[0]);
			String hypernym = request.getParameter(params[1]);
			String translation = request.getParameter(params[2]);
			
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("username");
			
			XMLTaskWriter taskData = new XMLTaskWriter();
			taskData.addResponse(username, taskName, new String[] {params[0], params[1]}, new String[] {word, hypernym}, translation);
			taskData.saveFile();
		}
		
		response.sendRedirect(RandomTaskServlet.getRandomTaskUrl());
	}
}
