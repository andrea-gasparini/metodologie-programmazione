package it.uniroma1.fabbricasemantica.data.management;

import org.w3c.dom.Element;

import it.uniroma1.fabbricasemantica.data.Task;

public class XMLTaskWriter extends XMLWriter
{
	public XMLTaskWriter() { super("tasks"); }
	
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
