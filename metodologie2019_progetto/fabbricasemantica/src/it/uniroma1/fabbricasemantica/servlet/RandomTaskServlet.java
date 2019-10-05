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

/**
 * La Servlet RandomTaskServlet permette di reindirizzare ad un Task casuale sia
 * da front che da back-end.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name="RandomTaskServlet", urlPatterns="/randomTask.jsp")
public class RandomTaskServlet extends BaseServlet
{	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Invia al client l'indirizzo di un Task casuale
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().write(getRandomTaskUrl());
	}
	
	/**
	 * Dato il nome di un Task, ad esclusione di questo, restituisce l'indirizzo di un altro Task
	 * 
	 * @param taskName nome del Task da escludere
	 * @return l'indirizzo di un Task casuale
	 */
	public static String getRandomTaskUrl(Task taskName)
	{
		List<Task> taskArray = new ArrayList<>(Arrays.asList(StandardTask.values()));
		taskArray.remove(taskName);
		String randomTask = taskArray.get((int) (Math.random() * taskArray.size())).getTaskID().toLowerCase();
		
		StringBuilder sb = new StringBuilder(randomTask);
		sb.setCharAt(randomTask.indexOf("_") + 1, Character.toUpperCase((randomTask.charAt(randomTask.indexOf("_") + 1))));
		
		return sb.toString().replace("_", "") + ".html";
	}
	
	/**
	 * Restituisce l'indirizzo di un Task casuale
	 * 
	 * @return l'indirizzo di un Task casuale
	 */
	public static String getRandomTaskUrl() { return getRandomTaskUrl(null); }
}
