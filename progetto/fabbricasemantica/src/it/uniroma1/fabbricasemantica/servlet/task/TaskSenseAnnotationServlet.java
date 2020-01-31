package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;

/**
 * La servlet TaskSenseAnnotationServlet riceve e salva i dati del Task
 * SenseAnnotation.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name = "TaskSenseAnnotationServlet", urlPatterns = "/senseAnnotation.jsp")
public class TaskSenseAnnotationServlet extends TaskServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Imposta il nome del Task come SENSE_ANNOTATION, gli elementi di contesto
	 * come ["word", "sentence"] e il nome del campo di risposta come "meaning"
	 */
	public void init() throws ServletException
	{
		super.init(StandardTask.SENSE_ANNOTATION, new String[] {"word", "sentence"}, "meaning");
	}
	
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		super.doSomething(request, response);
	}
}
