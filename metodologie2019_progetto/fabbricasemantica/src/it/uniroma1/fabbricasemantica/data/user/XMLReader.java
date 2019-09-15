package it.uniroma1.fabbricasemantica.data.user;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReader 
{
	private Document doc;
	
	private String childName;
	
	private File dataFile;
	
	private Element root;
	
	public XMLReader(String fileName)
	{
		dataFile = new File("data" + File.separator + fileName + ".xml");
		childName = fileName.substring(0, fileName.length() - 1);
		try
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder(); // try catch
			doc = builder.parse(dataFile); // try catch
			doc.getDocumentElement().normalize();
			root = doc.getDocumentElement();
		} 
		catch (SAXException | IOException | ParserConfigurationException e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean checkForElement(String fieldName, String value)
	{
		if (dataFile.exists())
		{
			NodeList list = root.getElementsByTagName(fieldName);
			for (int i = 0; i < list.getLength(); i++)
			{
				Node nElement = list.item(i);
				if (nElement.getTextContent().equals(value))
					return true;
			}
		}
		return false;
	}

}
