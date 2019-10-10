package it.uniroma1.fabbricasemantica.servlet.service;
 
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.DataProvider;
import it.uniroma1.fabbricasemantica.data.WordNetDataProvider;
import it.uniroma1.fabbricasemantica.data.StandardTask;
import it.uniroma1.fabbricasemantica.data.Task;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

/**
 * La servlet NewExampleServiceServlet prende un parametro "task" che indica il
 * Task per il quale si vuole il prossimo esempio e restituisce una stringa JSON
 * contenente il prossimo elemento da annotare per il Task specificato.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name="NewExampleServlet", urlPatterns="/nextExample.jsp")
public class NewExampleServiceServlet extends BaseServlet
{
	private static final long serialVersionUID = 8783416660707020469L;
	
	/**
	 * Mappa dei Task presenti nel sistema, in cui la chiave e' l'ID del Task e il
	 * valore e' il Task associato
	 */
	private Map<String, Task> tasks;
	
	/**
	 * Il DataProvider che fornisce i dati
	 */
	private DataProvider<String> dataProvider;
	
	/**
	 * Imposta il DataProvider come WordNetDataProvider e memorizza i task di
	 * base esistenti
	 */
	@Override
	public void init() throws ServletException
	{
		super.init();
		dataProvider = new WordNetDataProvider(Paths.get(getServletContext().getRealPath("/")), "3.1");
		tasks = Arrays.stream(StandardTask.values()).collect(Collectors.toMap(Task::getTaskID, s -> s));
	}

	/**
	 * Richiede il nome del Task al client e restituisce la stringa JSON contenente
	 * i dati
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String sTask = (String) request.getParameter("task");
		Task task = tasks.get(sTask);
		String json = dataProvider.getData(task);
		response.getWriter().write(json);
	}
}
