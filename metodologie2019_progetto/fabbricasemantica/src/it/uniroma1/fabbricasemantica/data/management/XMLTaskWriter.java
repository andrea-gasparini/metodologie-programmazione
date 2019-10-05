package it.uniroma1.fabbricasemantica.data.management;

import org.w3c.dom.Element;

import it.uniroma1.fabbricasemantica.data.Task;

/**
 * La classe XMLTaskWriter rappresenta un interprete per la creazione e
 * l'aggiunta di dati al file XML relativo ai Task che vengono inviati in
 * FabbricaSemantica.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class XMLTaskWriter extends XMLWriter
{
	/**
	 * Costruisce un XMLTaskWriter come XMLWriter
	 */
	public XMLTaskWriter() { super("tasks"); }
	
	/**
	 * Registra un nuovo Task nel documento XML
	 * 
	 * @param username email dell'utente che ha inviato il Task
	 * @param taskName nome del Task che e' stato inviato
	 * @param contextElems nomi degli elementi di contesto del Task
	 * @param contextValues valori degli elementi di contesto del Task
	 * @param response responso finale dell'utente
	 */
	public void addResponse(String username, Task taskName, String[] contextElems, String[] contextValues, String response)
	{
		Element task = doc.createElement(childName);
		task.setAttribute("id", idCnt +"");
		task.setAttribute("type", taskName.getTaskID());
		task.setAttribute("username", username);
		
		Element context = (Element) task.appendChild(doc.createElement("context"));
		for (int i = 0; i < contextElems.length; i++)
			context.appendChild(createNode(contextElems[i], contextValues[i]));

		task.appendChild(createNode("response", response));
		
		root.appendChild(task);
	}
}
