package it.uniroma1.fabbricasemantica.data.management;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * La classe XMLWriter rappresenta un interprete per la creazione e l'aggiunta
 * di dati a file XML.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class XMLWriter 
{
	/**
	 * Il documento XML
	 */
	protected Document doc;
	
	/**
	 * Il nome degli elementi principali del documento
	 */
	protected String childName;
	
	/**
	 * File da modificare o scrivere
	 */
	private File dataFile;
	
	/**
	 * Radice del documento XML
	 */
	protected Element root;
	
	/**
	 * Contatore dell'id del prossimo elemento da inserire nel file
	 */
	protected int idCnt = 1;
	
	/**
	 * Costruisce un XMLWriter a partire da un Path e dal nome del file. Controlla se il file
	 * esiste gia' e in caso contrario ne crea uno nuovo.
	 * 
	 * @param actualPath path attuale
	 * @param fileName nome del file
	 */
	public XMLWriter(Path actualPath, String fileName)
	{
		dataFile = new File(actualPath + File.separator + "data" + File.separator + fileName + ".xml");
		childName = fileName.substring(0, fileName.length() - 1);
		try
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			if (dataFile.exists())
			{
				doc = builder.parse(dataFile);
				root = doc.getDocumentElement();
				idCnt = root.getElementsByTagName(childName).getLength() + 1;
			}
			else
			{
				doc = builder.newDocument();
				root = doc.createElement(fileName);
				doc.appendChild(root);
				saveFile();
			}
		} 
		catch (SAXException | IOException | ParserConfigurationException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Salva il documento XML nel file
	 */
	public void saveFile()
	{
		try
		{
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transf = transformerFactory.newTransformer();
			
			transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transf.setOutputProperty(OutputKeys.INDENT, "yes");

			DOMSource source = new DOMSource(doc);
			StreamResult file = new StreamResult(dataFile);
			
			transf.transform(source, file);
		}
		catch (TransformerException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Dato un nome ed un valore crea un nuovo nodo 
	 * 
	 * @param name nome del nuovo nodo
	 * @param value valore da inserire nel nodo
	 * @return il nodo
	 */
	protected Node createNode(String name, String value) 
	{
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));

		return node;
	}
}
