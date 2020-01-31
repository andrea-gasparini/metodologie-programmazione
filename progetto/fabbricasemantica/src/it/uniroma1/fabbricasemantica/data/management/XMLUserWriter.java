package it.uniroma1.fabbricasemantica.data.management;

import java.nio.file.Path;

import org.w3c.dom.Element;

/**
 * La classe XMLUserWriter rappresenta un interprete per la creazione e
 * l'aggiunta di dati al file XML relativo agli utenti registrati a
 * FabbricaSemantica.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class XMLUserWriter extends XMLWriter
{
	/**
	 * Costruisce un XMLUserWriter come XMLWriter
	 * 
	 * @param actualPath path attuale
	 */
	public XMLUserWriter(Path actualPath) { super(actualPath, "users"); }
	
	/**
	 * Registra un nuovo utente nel documento XML
	 * 
	 * @param username email del nuovo utente
	 * @param password password del nuovo utente
	 * @param mainLanguages lingue principali selezionate
	 * @param otherLanguages altre lingue selezionate
	 * @param levels livelli selezionati
	 */
	public void addUser(String username, String password, String[] mainLanguages, String[] otherLanguages, String[] levels) 
	{
		Element user = doc.createElement(childName);
		user.setAttribute("id", idCnt + "");
		user.appendChild(createNode("username", username));
		user.appendChild(createNode("password", password));
		
		Element languages = (Element) user.appendChild(doc.createElement("languages"));
		languages.appendChild(createNode("mainlanguage", mainLanguages[0]));
		if (mainLanguages.length > 1) languages.appendChild(createNode("mainlanguage", mainLanguages[1]));
		
		for (int i = 0; i < otherLanguages.length; i++)
			if (! otherLanguages[i].isEmpty())
			{
				Element otherLanguage = (Element) languages.appendChild(doc.createElement("otherlanguage"));
				otherLanguage.appendChild(createNode("language", otherLanguages[i]));
				otherLanguage.appendChild(createNode("level", levels[i]));
			}
		
		root.appendChild(user);
	}
}
