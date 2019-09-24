package it.uniroma1.fabbricasemantica.data.management;

import java.io.File;
import java.io.IOException;

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

public class XMLWriter 
{
	protected Document doc;
	
	protected String childName;
	
	private File dataFile;
	
	protected Element root;
	
	protected int idCnt = 1;
	
	public XMLWriter(String fileName)
	{
		dataFile = new File("data" + File.separator + fileName + ".xml");
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
	
	protected Node createElement(String name, String value) 
	{
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));

		return node;
	}
}
