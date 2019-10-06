package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;

/**
 * La servlet TaskWordAnnotationServlet riceve e salva i dati del Task
 * WordAnnotation.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name = "TaskWordAnnotationServlet", urlPatterns = "/wordAnnotation.jsp")
public class TaskWordAnnotationServlet extends TaskServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Imposta il nome del Task come WORD_ANNOTATION, gli elementi di contesto
	 * come ["definition"] e il nome del campo di risposta come default ("response")
	 */
	public void init() throws ServletException
	{
		super.init(StandardTask.WORD_ANNOTATION, new String[] {"definition"});
	}
	
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		super.doSomething(request, response);
	}
}



