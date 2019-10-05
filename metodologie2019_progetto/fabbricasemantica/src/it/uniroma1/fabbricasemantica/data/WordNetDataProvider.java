package it.uniroma1.fabbricasemantica.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.uniroma1.fabbricasemantica.data.wordnet.BasicWordNetRelation;
import it.uniroma1.fabbricasemantica.data.wordnet.Synset;
import it.uniroma1.fabbricasemantica.data.wordnet.WordNet;

/**
 * La classe WordNetDataProvider rappresenta il provider di dati dinamici per
 * FabbricaSemantica tramite WordNet.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class WordNetDataProvider implements DataProvider<String>
{
	/**
	 * Istanza di WordNet 3.1 da cui vengono forniti i dati
	 */
	private WordNet dataProvider = WordNet.getInstance("3.1");
	
	/**
	 * Il synset selezionato
	 */
	private Synset source;
	
	@Override 
	public String getData(Task task)
	{
		source = dataProvider.getRandomSynset();
		
		if (task == StandardTask.TRANSLATION_ANNOTATION)
			return getTranslationAnnotationData();
		else if (task == StandardTask.WORD_ANNOTATION)
			return getWordAnnotationData();
		else if (task == StandardTask.DEFINITION_ANNOTATION)
			return getDefinitionAnnotationData();
		else if (task == StandardTask.SENSE_ANNOTATION)
			return getSenseAnnotationData();
		else if (task == StandardTask.TRANSLATION_VALIDATION)
			return getTranslationValidationData();
		else if (task == StandardTask.SENSE_VALIDATION)
			return getSenseValidationData();
		else if (task == StandardTask.MY_ANNOTATION)
			return getMyAnnotationData();
		return null; 
	}
	
	/**
	 * Ritorna una stringa strutturata come JSON contenente una parola casuale e la
	 * sua definizione
	 * 
	 * @return dati per il Task TranslationAnnotation
	 */
	private String getTranslationAnnotationData()
	{
		return "{" +
				"\"word\": \"" + source.getRandomSynonym() + "\"," +
				"\"definition\": \"" + source.getGloss() + "\"" +
				"}";
	}
	
	/**
	 * Ritorna una stringa strutturata come JSON contenente una definizione casuale 
	 * 
	 * @return dati per il Task WordAnnotation
	 */
	private String getWordAnnotationData() { return "{\"definition\": \"" + source.getGloss() + "\"}"; }
	
	/**
	 * Seleziona synset casuali finche' non ne viene selezionato uno che abbia un
	 * synset HYPERNYM e ritorna una stringa strutturata come JSON contenente una
	 * parola casuale e un suo iperonimo.
	 * 
	 * @return dati per il Task DefinitionAnnotation
	 */
	private String getDefinitionAnnotationData()
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
	
	/**
	 * Seleziona synset casuali finche' non ne viene selezionato uno che abbia un
	 * synset HYPERNYM e uno SIMILAR_TO, inoltre finche' il sinonimo selezionato
	 * (sempre casualmente) fra quelli del synset non e' contenuto in almeno un
	 * esempio. Ritorna una stringa strutturata come JSON contenente il sinonimo
	 * selezionato, un esempio che lo contiene e una lista di 4 definizioni, di cui
	 * una e' quella corretta, una fa riferimento ad un synset HYPERNYM, una ad un
	 * synset SIMILAR_TO e l'ultima e' selezionata casualmente.
	 * 
	 * @return dati per il Task SenseAnnotation
	 */
	private String getSenseAnnotationData()
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
	
	/**
	 * Seleziona synset casuali finche' non ne viene selezionato uno che abbia un
	 * synset HYPERNYM e traduce la definizione del synset selezionato, la
	 * definizione del synset HYPERNYM e la definizione di un synset casuale.
	 * Ritorna una stringa strutturata come JSON contenente un sinonimo casuale tra
	 * quelli del synset, la definizione e le 3 traduzioni.
	 * 
	 * @return dati per il Task TranslationValidation
	 */
	private String getTranslationValidationData()
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
	
	/**
	 * Seleziona synset casuali finche' il sinonimo selezionato (sempre casualmente)
	 * non e' contenuto in almeno un'esempio. Ritorna una stringa strutturata come
	 * JSON contenente il sinonimo selezionato, l'esempio che lo contiene e
	 * (scegliendo casualmente) o la definizione del synset stesso o di un altro
	 * selezionato casualmente.
	 * 
	 * @return dati per il Task SenseValidation
	 */
	private String getSenseValidationData()
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
	
	/**
	 * Seleziona synset casuali finche' non ne viene selezionato uno con almeno 2
	 * sinonimi (e senza caratteri poco adatti al Task). Ritorna una stringa strutturata come
	 * JSON contenente due sinonimi del synset.
	 * 
	 * @return dati per il Task MyAnnotation
	 */
	private String getMyAnnotationData()
	{
		String word = source.getRandomSynonym();
		while(source.getSynonyms().size() < 2 || word.contains(" ") || word.contains("-"))
		{
			source = dataProvider.getRandomSynset();
			word = source.getRandomSynonym();
		}
		
		return "{" +
				"\"word\": \"" + source.getRandomSynonym(word) + "\"," +
				"\"synonym\": \"" + word + "\"" +
				"}";
	}
}
