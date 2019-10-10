package it.uniroma1.fabbricasemantica.data.management;

import java.nio.file.Path;

import org.w3c.dom.NodeList;

/**
 * La classe XMLUserReader rappresenta un interprete per la lettura di dati dal
 * file XML relativo agli utenti registrati a FabbricaSemantica.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class XMLUserReader extends XMLReader
{
	/**
	 * Costruisce un XMLUserReader come XMLReader
	 * 
	 * @param actualPath path attuale
	 */
	public XMLUserReader(Path actualPath) { super(actualPath, "users"); }

	/**
	 * Controlla se un utente e' registrato nel documento XML, ritorna true in caso
	 * positivo, false altrimenti
	 * 
	 * @param username email dell'utente da cercare
	 * @param password password dell'utente da cercare
	 * @return true se e' presente, false altrimenti
	 */
	public boolean checkForUser(String username, String password)
	{
		NodeList usernameList = root.getElementsByTagName("username");
		NodeList passwordList = root.getElementsByTagName("password");
		for (int i = 0; i < usernameList.getLength(); i++)
			if (usernameList.item(i).getTextContent().equals(username) && passwordList.item(i).getTextContent().equals(password))
				return true;
		return false;
	}
}
