package it.uniroma1.fabbricasemantica.data.management;

import org.w3c.dom.NodeList;

public class XMLTranslationsReader extends XMLReader
{
	public static void main(String[] args) {
		XMLTranslationsReader test = new XMLTranslationsReader();
		System.out.println(test.getTranslatedWord("that"));
		System.out.println("ao");
	}
	
	public XMLTranslationsReader() { super("words"); }
	
	public String getTranslatedWord(String word)
	{
		NodeList italianList = root.getChildNodes();
		NodeList englishList = root.getElementsByTagName("english");
		System.out.println(root.getFirstChild());
		for (int i = 0; i < englishList.getLength(); i++)
		{
			System.out.println(englishList.item(i));
			System.out.println(italianList.item(i));
			if (englishList.item(i).getTextContent().equals(word))
				return italianList.item(i).getTextContent();
		}
		return "";
	}
}
