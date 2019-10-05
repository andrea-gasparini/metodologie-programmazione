package it.uniroma1.fabbricasemantica.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.uniroma1.fabbricasemantica.data.management.TranslationsReader;
import it.uniroma1.fabbricasemantica.data.wordnet.BasicWordNetRelation;
import it.uniroma1.fabbricasemantica.data.wordnet.Synset;
import it.uniroma1.fabbricasemantica.data.wordnet.WordNet;

//TODO Javadoc everywhere
public class WordNetDataProvider implements DataProvider<String>
{
	@Override 
	public String getData(Task task)
	{
		//TODO il primo task carica troppo lento perché deve aspettare l'istanza di wn
		WordNet dataProvider = WordNet.getInstance("3.1");
		Synset source = dataProvider.getRandomSynset();
		
		if (task == StandardTask.TRANSLATION_ANNOTATION)
		{
			return "{" +
					"\"word\": \"" + source.getRandomSynonym() + "\"," +
					"\"definition\": \"" + source.getGloss() + "\"" +
					"}";
		}
		else if (task == StandardTask.WORD_ANNOTATION)
		{
			return "{\"definition\": \"" + source.getGloss() + "\"}";
		}
		else if (task == StandardTask.DEFINITION_ANNOTATION)
		{
			while(dataProvider.getRelatedSynsets(source, BasicWordNetRelation.HYPERNYM).isEmpty())
				source = dataProvider.getRandomSynset();
			
			return "{" + 
					"\"word\": \"" + source.getRandomSynonym() + "\"," +
					"\"hypernym\": \"" +
					dataProvider.getSynsetFromID(
							dataProvider.getRelatedSynsets(source, BasicWordNetRelation.HYPERNYM).stream().findAny().get().getID()).getRandomSynonym() + "\"" +
					"}";
		}
		else if (task == StandardTask.SENSE_ANNOTATION)
		{
			String word = source.getRandomSynonym();
			while((! (source.findExample(word).isPresent()) ||
					dataProvider.getRelatedSynsets(source, BasicWordNetRelation.SIMILAR_TO).isEmpty() ||
					dataProvider.getRelatedSynsets(source, BasicWordNetRelation.SIMILAR_TO).contains(null) || 
					dataProvider.getRelatedSynsets(source, BasicWordNetRelation.HYPERNYM).isEmpty()))
			{ // controllo su null necessario per delle incongruenze tra 's' ed 'a' nei file di WordNet
				source = dataProvider.getRandomSynset();
				word = source.getRandomSynonym();
			}
			
			List<String> senses = new ArrayList<>(Arrays.asList(
					source.getGloss(),
					dataProvider.getSynsetFromID(
							dataProvider.getRelatedSynsets(source, BasicWordNetRelation.HYPERNYM).stream().findAny().get().getID()).getGloss(),
					dataProvider.getSynsetFromID(
							dataProvider.getRelatedSynsets(source, BasicWordNetRelation.SIMILAR_TO).stream().findAny().get().getID()).getGloss(),
					dataProvider.getRandomSynset().getGloss()));
			
			return "{" + 
					"\"word\":\"" + word + "\"," +
					"\"sentence\":\"" + source.findExample(word).get() + "\"," + 
					"\"senses\": [\"" + senses.remove((int) (Math.random() * senses.size())) + "\", \"" +
										senses.remove((int) (Math.random() * senses.size())) + "\", \"" +
										senses.remove((int) (Math.random() * senses.size())) + "\", \"" +
										senses.remove((int) (Math.random() * senses.size())) + "\"]" + 
					"}";
		}
		else if (task == StandardTask.TRANSLATION_VALIDATION)
		{
			while(dataProvider.getRelatedSynsets(source, BasicWordNetRelation.HYPERNYM).isEmpty())
				source = dataProvider.getRandomSynset();
			
			TranslationsReader tr = new TranslationsReader("it-en");
			
			List<String> translations = new ArrayList<>(Arrays.asList(
					tr.getTranslatedSentence(source.getGloss()),
					tr.getTranslatedSentence(
							dataProvider.getSynsetFromID(
									dataProvider.getRelatedSynsets(source, BasicWordNetRelation.HYPERNYM).stream().findAny().get().getID()).getGloss()),
					tr.getTranslatedSentence(dataProvider.getRandomSynset().getGloss())));
			
			return "{" +
					"\"word\": \"" + source.getRandomSynonym() + "\"," +
					"\"definition\": \"" + source.getGloss() + "\"," + 
					"\"translations\": [\"" + translations.remove((int) (Math.random() * translations.size())) + "\"," +
										"\"" + translations.remove((int) (Math.random() * translations.size())) + "\"," +
										"\"" + translations.remove((int) (Math.random() * translations.size())) + "\"]" +
					"}";
		}
		else if (task == StandardTask.SENSE_VALIDATION)
		{
			String word = source.getRandomSynonym();
			while(! (source.findExample(word).isPresent()))
			{
				source = dataProvider.getRandomSynset();
				word = source.getRandomSynonym();
			}
			
			return "{" +
					"\"word\": \"" + word + "\"," +
					"\"sentence\": \"" + source.findExample(word).get() + "\"," +
					"\"definition\": \"" + (Math.random() < 0.5 ? dataProvider.getRandomSynset().getGloss() : source.getGloss()) + "\"" +
					"}";
		}
		else if (task == StandardTask.MY_ANNOTATION)
		{
			String word = source.getRandomSynonym();
			while(source.getSynonyms().size() < 2 || word.contains(" ") || word.contains("-"))
			{
				source = dataProvider.getRandomSynset();
				word = source.getRandomSynonym();
			}
			//TODO va rivisto il front-end per le parole con spazi // per ora ho fixato cercando solo parole senza spazi
			return "{" +
					"\"word\": \"" + source.getRandomSynonym(word) + "\"," +
					"\"synonym\": \"" + word + "\"" +
					"}";
		}
		return null; 
	}
}
