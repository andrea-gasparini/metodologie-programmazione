package it.uniroma1.fabbricasemantica.data.user;

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
	private Document doc;
	
	private String childName;
	
	private File dataFile;
	
	private Element root;
	
	private int idCnt = 1;
	
	public XMLWriter(String fileName)
	{
		dataFile = new File("data" + File.separator + fileName + ".xml");
		childName = fileName.substring(0, fileName.length() - 1);
		try
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder(); // try catch
			if (dataFile.exists())
			{
				doc = builder.parse(dataFile); // try catch
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
			Transformer transf = transformerFactory.newTransformer(); // try catch
			
			transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transf.setOutputProperty(OutputKeys.INDENT, "yes");
//			transf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			
			DOMSource source = new DOMSource(doc);
			
			StreamResult console = new StreamResult(System.out); //DEBUG
			StreamResult file = new StreamResult(dataFile);
			
			transf.transform(source, console); // try catch //DEBUG
			transf.transform(source, file); // try catch
		}
		catch (TransformerException e)
		{
			e.printStackTrace();
		}
	}
	
	public void addUser(String username, String password, String mainLanguage) 
	{
		Element user = doc.createElement(childName);
		
		user.setAttribute("id", idCnt + "");
		user.appendChild(createElement("username", username));
		user.appendChild(createElement("password", password));
		user.appendChild(createElement("mainlanguage", mainLanguage));
		root.appendChild(user);
	}
	
	//TODO overload che supporta le lingue "extra"
	/*public void addUser(String id, String emailAddress, String password, String mainLanguage, String ) 
	{
		Element user = doc.createElement("user");
		
		user.setAttribute("id", id);
		user.appendChild(createElement("emailaddress", emailAddress));
		user.appendChild(createElement("password", password));
		user.appendChild(createElement("mainlanguage", mainLanguage));
		
		Node otherLanguages = doc.createElement("otherlanguages");
		user.appendChild(otherLanguages);
		
		root.appendChild(user);
	}*/
	
	private Node createElement(String name, String value) 
	{
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));
		
		return node;
	}
}
