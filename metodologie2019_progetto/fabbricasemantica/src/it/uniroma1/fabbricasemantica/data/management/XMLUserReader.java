package it.uniroma1.fabbricasemantica.data.management;

import org.w3c.dom.NodeList;

public class XMLUserReader extends XMLReader
{
	public XMLUserReader() { super("users"); }

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
