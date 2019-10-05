package it.uniroma1.fabbricasemantica.data.management;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TranslationsReader 
{
	private File dataFile;
	
	public TranslationsReader(String fileName) { dataFile = new File("data" + File.separator + fileName + ".txt"); }
	
	public String getTranslatedWord(String word)
	{
		if (word.matches("[0-9]") || word.matches(".*[A-Z].*")) 
			return word;
		
		try (BufferedReader br = Files.newBufferedReader(dataFile.toPath()))
		{
			String line = "";
			List<String> italianWords = new ArrayList<>();
			List<String> englishWords = new ArrayList<>();
			
			while (br.ready())
			{
				line = br.readLine();
				String lineWords[] = new String[2];
				if (line.contains(word))
				{
					lineWords = line.split(" ");
					italianWords.add(lineWords[0]);
					englishWords.add(lineWords[1]);
				}
			}
			
			for (int i = 0; i < englishWords.size(); i++)
				if (englishWords.get(i).matches("^"+ word + "$"))
					return italianWords.get(i);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return ""; 
	}
	
	public String getTranslatedSentence(String sentence)
	{
		String str = "";
		sentence = sentence.replaceAll("[;():,]", "");
		sentence = sentence.replaceAll("-", " ");
		String strArr[] = sentence.split(" ");
		
		for (int i = 0; i < strArr.length; i++)
			str += i == strArr.length - 1 ? getTranslatedWord(strArr[i]) : getTranslatedWord(strArr[i]) + " "; 
			
		return str;
	}
}
