package it.uniroma1.fabbricasemantica.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;
import it.uniroma1.fabbricasemantica.data.Task;

@WebServlet(name="RandomTaskServlet", urlPatterns="/randomTask.jsp")
public class RandomTaskServlet extends BaseServlet
{	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().write(getRandomTaskUrl());
	}
	
	public static String getRandomTaskUrl()
	{	//TODO aggiungere il MyTask
		Task[] taskArray = StandardTask.values();
		String randomTask = taskArray[(int) (Math.random() * taskArray.length)].getTaskID().toLowerCase();
		
		StringBuilder sb = new StringBuilder(randomTask);
		sb.setCharAt(randomTask.indexOf("_") + 1, Character.toUpperCase((randomTask.charAt(randomTask.indexOf("_") + 1))));
		
		return sb.toString().replace("_", "") + ".html";
	}
}
