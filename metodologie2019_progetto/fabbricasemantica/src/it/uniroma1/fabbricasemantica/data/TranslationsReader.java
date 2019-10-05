package it.uniroma1.fabbricasemantica.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe TranslationsReader rappresenta un interprete dei dati di traduzione
 * da parola a parola da un file di testo in cui ogni riga contiene una parola
 * in Italiano e una in Inglese, separate da uno spazio.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class TranslationsReader 
{
	/**
	 * File contenente le traduzioni
	 */
	private File dataFile;
	
	/**
	 * Costruisce un TranslationsReader a partire dal nome del file e imposta il suo
	 * percorso relativo
	 * 
	 * @param fileName nome del file delle traduzioni
	 */
	public TranslationsReader(String fileName) { dataFile = new File("data" + File.separator + fileName + ".txt"); }
	
	/**
	 * Data una parola, controlla se non sia una data o un nome proprio (in tal caso
	 * la restituisce), legge il file e memorizza ogni riga che la contiene in due
	 * liste, una con le parole in Italiano e una con quelle Inglesi. Per ogni
	 * parola in Inglese registrata controlla se non ci siano altre lettere oltre a
	 * quelle della parola (es. cercando "word", "wordnet" non sarebbe accettata) e
	 * la ritorna appena viene trovata.
	 * 
	 * @param word parola in inglese
	 * @return traduzione in italiano o la parola stessa se non esiste traduzione (o si tratta di numeri o nomi propri)
	 */
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
		
		return word; 
	}
	
	/**
	 * Data una frase, effettua la traduzione in Italiano di ogni parola e ritorna la frase tradotta.
	 * 
	 * @param sentence frase in inglese
	 * @return frase tradotta in italiano
	 */
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
