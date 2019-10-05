package it.uniroma1.fabbricasemantica.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;
import it.uniroma1.fabbricasemantica.data.Task;
import it.uniroma1.fabbricasemantica.data.wordnet.WordNet;

@WebServlet(name="RandomTaskServlet", urlPatterns="/randomTask.jsp")
public class RandomTaskServlet extends BaseServlet
{	
	public static final WordNet dataProvider = WordNet.getInstance("3.1");
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().write(getRandomTaskUrl());
	}
	
	public static String getRandomTaskUrl(Task taskName)
	{
		List<Task> taskArray = new ArrayList<>(Arrays.asList(StandardTask.values()));
		taskArray.remove(taskName);
		String randomTask = taskArray.get((int) (Math.random() * taskArray.size())).getTaskID().toLowerCase();
		
		StringBuilder sb = new StringBuilder(randomTask);
		sb.setCharAt(randomTask.indexOf("_") + 1, Character.toUpperCase((randomTask.charAt(randomTask.indexOf("_") + 1))));
		
		return sb.toString().replace("_", "") + ".html";
	}
	
	public static String getRandomTaskUrl() { return getRandomTaskUrl(null); }
}
