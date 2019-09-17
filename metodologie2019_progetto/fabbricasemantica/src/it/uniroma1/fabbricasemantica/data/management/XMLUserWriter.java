package it.uniroma1.fabbricasemantica.data.management;

import org.w3c.dom.Element;

public class XMLUserWriter extends XMLWriter
{
	public XMLUserWriter() { super("users"); }
	
	public void addUser(String username, String password, String[] mainLanguages, String[] otherLanguages, String[] levels) 
	{
		Element user = doc.createElement(childName);
		user.setAttribute("id", idCnt + "");
		user.appendChild(createElement("username", username));
		user.appendChild(createElement("password", password));
		
		Element languages = (Element) user.appendChild(doc.createElement("languages"));
		languages.appendChild(createElement("mainlanguage", mainLanguages[0]));
		if (mainLanguages.length > 1) languages.appendChild(createElement("mainlanguage", mainLanguages[1]));
		
		for (int i = 0; i < otherLanguages.length; i++)
			if (! otherLanguages[i].isEmpty())
			{
				Element otherLanguage = (Element) languages.appendChild(doc.createElement("otherlanguage"));
				otherLanguage.appendChild(createElement("language", otherLanguages[i]));
				otherLanguage.appendChild(createElement("level", levels[i]));
			}
		
		root.appendChild(user);
	}
}
