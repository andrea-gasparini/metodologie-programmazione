package it.uniroma1.fabbricasemantica.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.uniroma1.fabbricasemantica.data.wordnet.BasicWordNetRelation;
import it.uniroma1.fabbricasemantica.data.wordnet.Synset;
import it.uniroma1.fabbricasemantica.data.wordnet.WordNet;

//TODO Javadoc everywhere
public class WordNetDataProvider implements DataProvider<String>
{	//TODO implementare dati dinamici da WordNet
	@Override 
	public String getData(Task task)
	{
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
		{//TODO pulire un po' sto codice
			String word = source.getRandomSynonym();
			while((! (source.findExample(word).isPresent()) ||
					dataProvider.getRelatedSynsets(source, BasicWordNetRelation.SIMILAR_TO).isEmpty() ||
					dataProvider.getRelatedSynsets(source, BasicWordNetRelation.HYPERNYM).isEmpty()))
			{
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
			return "{" +
					"\"word\": \"rock\"," +
					"\"definition\": \"A lump or mass of hard consolidated mineral matter\"," + 
					"\"translations\": [\"Un grumo o una massa di materia minerale consolidata dura\"," +
										"\"Materiale costituito dall'aggregato di minerali come quelli che formano la crosta terrestre\"," +
										"\"Un'associazione non ufficiale di persone o gruppi\"]" +
					"}";
		}
		else if (task == StandardTask.SENSE_VALIDATION)
		{
			return "{" +
					"\"word\": \"bank\"," +
					"\"sentence\": \"He cashed a check at the bank\"," +
					"\"definition\": \"09213565n\"" +
					"}";
		}
		else if (task == StandardTask.MY_ANNOTATION)
		{
			return "{" +
					"\"word\": \"chief\"," +
					"\"synonym\": \"boss\"" +
					"}";
		}
		return null; 
	}
}
