package it.uniroma1.fabbricasemantica.data.management;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.stream.Stream;

public class TranslationsReader 
{
	public static void main(String[] args) {
		TranslationsReader test = new TranslationsReader("it-en");
		System.out.println(test.getTranslatedWord("shit"));
		System.out.println(test.getTranslatedWord("mom"));
		System.out.println(test.getTranslatedWord("babysitting"));
		System.out.println(test.getTranslatedWord("school"));
		System.out.println(test.getTranslatedWord("begged"));
		System.out.println(test.getTranslatedWord("mean"));
		System.out.println(test.getTranslatedWord("god"));
		System.out.println(test.getTranslatedWord("godness"));
		System.out.println(test.getTranslatedWord("bless"));
		System.out.println(test.getTranslatedWord("USA"));
		System.out.println(test.getTranslatedWord("man"));
		System.out.println(test.getTranslatedWord("women"));
	}
	
	private static File dataFile;
	
	TranslationsReader(String fileName)
	{
		dataFile = new File("data" + File.separator + fileName + ".txt");
	}
	
	public String getTranslatedWord(String word)
	{
		Optional<String> translatedWord = Optional.empty();
		try (Stream<String> stream = Files.lines(dataFile.toPath())) 
		{//TODO migliorare la ricerca
			translatedWord = stream
				.filter(line -> line.contains(word))
				.findAny();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return translatedWord.isPresent() ? translatedWord.get().substring(0, translatedWord.get().indexOf(" ")) : word;
	}

}
