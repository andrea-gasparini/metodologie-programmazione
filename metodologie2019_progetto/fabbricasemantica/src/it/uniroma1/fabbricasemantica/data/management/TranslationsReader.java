package it.uniroma1.fabbricasemantica.data.management;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import it.uniroma1.fabbricasemantica.data.wordnet.RelatedSynset;
import it.uniroma1.fabbricasemantica.data.wordnet.Synset;

public class TranslationsReader 
{
	private File dataFile;
	
	public TranslationsReader(String fileName) { dataFile = new File("data" + File.separator + fileName + ".txt"); }
	
	public String getTranslatedWord(String word)
	{
		Optional<String> translatedWord = Optional.empty();
//		try (Stream<String> stream = Files.lines(dataFile.toPath())) 
//		{//TODO migliorare la ricerca
//			translatedWord = stream
//				.filter(line -> line.contains(word))
//				.findAny();
//		}
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
		
		
		try (BufferedReader br = Files.newBufferedReader(dataFile.toPath()))
		{//TODO forse questa implementazione è più easy
			String line = "";
			while (br.ready() || (! translatedWord.isPresent()))
			{
				line = br.readLine();
			}
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return translatedWord.isPresent() ? translatedWord.get().substring(0, translatedWord.get().indexOf(" ")) : word;
	}
	
	public String getTranslatedSentence(String sentence)
	{
		String str = "";
		sentence = sentence.replaceAll("[;(),]", "");
		String strArr[] = sentence.split(" ");
		
		for (int i = 0; i < strArr.length; i++)
			str += i == strArr.length - 1 ? getTranslatedWord(strArr[i]) : getTranslatedWord(strArr[i]) + " "; 
			
		return str;
	}
}
