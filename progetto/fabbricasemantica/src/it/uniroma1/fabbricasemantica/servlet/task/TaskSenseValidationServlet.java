package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;

/**
 * La servlet TaskSenseValidationServlet riceve e salva i dati del Task
 * SenseValidation.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name = "TaskSenseValidationServlet", urlPatterns = "/senseValidation.jsp")
public class TaskSenseValidationServlet extends TaskServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Imposta il nome del Task come SENSE_VALIDATION, gli elementi di contesto
	 * come ["word", "sentence", "definition"] e il nome del campo di risposta come default ("response")
	 */
	public void init() throws ServletException
	{
		super.init(StandardTask.SENSE_VALIDATION, new String[] {"word", "sentence", "definition"});
	}
	
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		super.doSomething(request, response);
	}
}
