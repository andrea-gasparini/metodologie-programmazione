package it.uniroma1.fabbricasemantica.data.management;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * La classe XMLReader rappresenta un interprete per la lettura di file XML.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class XMLReader 
{
	/**
	 * Il documento XML
	 */
	private Document doc;
	
	/**
	 * File da leggere
	 */
	private File dataFile;
	
	/**
	 * Radice del documento XML
	 */
	protected Element root;
	
	/**
	 * Costruisce un XMLReader a partire da un Path e dal nome del file. Controlla se il file
	 * esiste gia' e in caso contrario crea un nuovo oggetto XMLWriter che si
	 * occupera' di creare il file.
	 * 
	 * @param actualPath path attuale
	 * @param fileName nome del file
	 */
	public XMLReader(Path actualPath, String fileName)
	{
		dataFile = new File(actualPath + File.separator + "data" + File.separator + fileName + ".xml");
		if (! dataFile.exists())
			new XMLWriter(actualPath, fileName);
		try
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(dataFile);
			doc.getDocumentElement().normalize();
			root = doc.getDocumentElement();
		} 
		catch (SAXException | IOException | ParserConfigurationException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Dati un valore e il nome di un Elemento del documento, controlla se il valore
	 * e' presente nel documento alle voci che corrispondono al nome dell'elemento.
	 * 
	 * @param fieldName nome degli elementi del documento XML tra cui cercare
	 * @param value valore da ricercare
	 * @return true se il valore e' presente, false altrimenti
	 */
	public boolean checkForElement(String fieldName, String value)
	{
		NodeList list = root.getElementsByTagName(fieldName);
		for (int i = 0; i < list.getLength(); i++)
			if (list.item(i).getTextContent().equals(value))
				return true;
		return false;
	}
}
