package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.data.StandardTask;

/**
 * La servlet TaskDefinitionAnnotationServlet riceve e salva i dati del Task
 * DefinitionAnnotation.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
@WebServlet(name = "TaskDefinitionAnnotationServlet", urlPatterns = "/definitionAnnotation.jsp")
public class TaskDefinitionAnnotationServlet extends TaskServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Imposta il nome del Task come DEFINITION_ANNOTATION, gli elementi di contesto
	 * come ["word", "hypernym"] e il nome del campo di risposta come "translation"
	 */
	public void init() throws ServletException
	{
		super.init(StandardTask.DEFINITION_ANNOTATION, new String[] {"word", "hypernym"}, "translation");
	}
	
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		super.doSomething(request, response);
	}
}
