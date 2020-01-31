package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;

/**
 * La servlet TaskMyAnnotationServlet riceve e salva i dati del Task
 * MyAnnotation.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name = "TaskMyAnnotationServlet", urlPatterns = "/myAnnotation.jsp")
public class TaskMyAnnotationServlet extends TaskServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Imposta il nome del Task come MY_ANNOTATION, gli elementi di contesto
	 * come ["word", "synonym"] e il nome del campo di risposta come "result"
	 */
	public void init() throws ServletException
	{
		super.init(StandardTask.MY_ANNOTATION, new String[] {"word", "synonym"}, "result");
	}
	
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		super.doSomething(request, response);
	}

}
