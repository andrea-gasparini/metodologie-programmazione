package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.data.Task;
import it.uniroma1.fabbricasemantica.data.management.XMLTaskWriter;
import it.uniroma1.fabbricasemantica.servlet.BaseServlet;
import it.uniroma1.fabbricasemantica.servlet.RandomTaskServlet;

/**
 * La servlet TaskServlet generalizza le operazioni di ricezione e salvataggio
 * dei dati. Ogni servlet specifica estende questa e tramite il metodo init
 * imposta il nome del proprio Task, gli elementi di contesto e il nome del
 * campo in cui e' contenuta la risposta lato client.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class TaskServlet extends BaseServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Il nome del Task
	 */
	protected Task taskName;
	
	/**
	 * Gli elementi di contesto del Task
	 */
	protected String[] contextElemNames;
	
	/**
	 * Il nome del campo in cui e' contenuta la risposta lato client
	 */
	protected String responseName;
	
	/**
	 * Imposta i campi della servlet in base ai parametri
	 * 
	 * @param taskName nome del Task
	 * @param contextElemNames elementi di contesto del Task
	 * @param responseName nome del campo in cui e' contenuta la risposta lato client
	 * @throws ServletException
	 */
	public void init(Task taskName, String[] contextElemNames, String responseName) throws ServletException
	{
		this.taskName = taskName;
		this.contextElemNames = contextElemNames;
		this.responseName = responseName;
	}
	
	/**
	 * Imposta i campi della servlet in base ai parametri, con responseName di default "response"
	 * 
	 * @param taskName nome del Task
	 * @param contextElemNames elementi di contesto del Task
	 * @throws ServletException
	 */
	public void init(Task taskName, String[] contextElemNames) throws ServletException { init(taskName, contextElemNames, "response"); }	
	
	/**
	 * Controlla che la servlet sia stata chiamata dal pulsante NEXT o meno, in caso
	 * positivo richiede i dati al client e li registra nella base di dati.
	 * Reindirizza ad un Task a caso.
	 */
	@Override
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
			
			XMLTaskWriter taskData = new XMLTaskWriter(Paths.get(getServletContext().getRealPath("/")));
			taskData.addResponse(username, taskName, contextElemNames, contextElems, answer);
			taskData.saveFile();
		}

		response.sendRedirect(RandomTaskServlet.getRandomTaskUrl(taskName));
	}
}
