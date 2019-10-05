package it.uniroma1.fabbricasemantica.data.wordnet;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * La classe Synset rappresenta un concetto, composto da Sinonimi, Glossa ed eventuali esempi.
 * Ogni Synset e' formato anche da un identificatore chiamato offset, una categoria grammaticale 
 * (che insieme all'offset formano un ID univoco), e un insieme di relazioni verso altri Synset.
 * 
 * I metodi permettono di conoscere il valore di ogni campo del Synset, di sapere se un dato lemma 
 * e' presente fra i sinonimi e di restituire uno stream delle relazioni verso altri Synset.
 * 
 * Il toString() e' implementato come segue:
 * "offset grammaticalCategory [synonyms] [relatedSynsets] | (gloss) [examples]"
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class Synset
{
	/**
	 * Identificatore del Synset, insieme alla categoria grammaticale possono 
	 * formare un identificatore univoco
	 */
	private String offset;
	
	/**
	 * Categoria grammaticale del Synset (Nome, Verbo, Aggettivo, Avverbio)
	 * insieme all'offset possono formare un identificatore univoco
	 */
	private POS grammaticalCategory;
	
	/**
	 * ID univoco del Synset
	 */
	private String ID;
	
	/**
	 * Insieme dei sinonimi che esprimono il concetto del Synset
	 */
	private Set<String> synonyms;
	
	/**
	 * Definizione testuale della glossa
	 */
	private String gloss;
	
	/**
	 * Insieme degli esempi d'uso dei sinonimi del Synset
	 */
	private Set<String> examples;
	
	/**
	 * Insieme delle relazioni del Synset verso altri Synset
	 */
	private Set<RelatedSynset> relatedSynsets;
	
	/**
	 * Costruisce un Synset a partire dai parametri, da cui l'ID del Synset viene inizializzato 
	 * concatenando offset + la categoria grammaticale sotto forma di stringa.
	 * 
	 * @param offset l'identificatore del Synset
	 * @param grammaticalCategory la categoria grammaticale sotto forma di stringa 
	 * @param synonyms l'insieme dei sinonimi del Synset
	 * @param relatedSynsets la lista delle relazioni del Synset verso altri Synset
	 * @param gloss la definizione testuale del Synset
	 * @param examples l'insieme degli esempi del Synset
	 */
	public Synset(String offset, String grammaticalCategory, Set<String> synonyms, Set<RelatedSynset> relatedSynsets, String gloss, Set<String> examples)
	{
		this.offset = offset;
		this.grammaticalCategory = POS.getPOS(grammaticalCategory);
		this.ID = offset + grammaticalCategory;
		this.synonyms = synonyms;
		this.gloss = gloss;
		this.examples = examples;
		this.relatedSynsets = relatedSynsets;
	}
	
	/**
	 * Restituisce l'offset del Synset
	 * 
	 * @return l'offset del Synset
	 */
	public String getOffset() { return offset; }
	
	/**
	 * Restituisce l'oggetto enum POS della categoria grammaticale del Synset
	 * 
	 * @return l'oggetto enum POS della categoria grammaticale del Synset
	 */
	public POS getPOS() { return grammaticalCategory; }
	
	/**
	 * Restituisce l'ID del Synset
	 * 
	 * @return l'ID del Synset
	 */
	public String getID() { return ID; }
	
	/**
	 * Restituisce l'insieme dei sinonimi del Synset
	 * 
	 * @return l'insieme dei sinonimi del Synset
	 */ 
	public Set<String> getSynonyms() { return synonyms; }
	
	/**
	 * Restituisce un sinonimo casuale, ad eccezione di quello specificato, del Synset
	 * 
	 * @param synonym un sinonimo da ignorare nella scelta
	 * @return un sinonimo casuale del Synset
	 */ 
	public String getRandomSynonym(String synonym) 
	{
		synonyms.remove(synonym);
		return ((String) synonyms.toArray()[(int) (Math.random() * synonyms.size())]).toLowerCase().replace("_", " "); 
	}
	
	/**
	 * Restituisce un sinonimo casuale del Synset
	 * 
	 * @return un sinonimo casuale del Synset
	 */ 
	public String getRandomSynonym() { return getRandomSynonym(null); }
	
	/**
	 * Restituisce la glossa del Synset
	 * 
	 * @return la glossa del Synset
	 */
	public String getGloss() { return gloss; }
	
	/**
	 * Restituisce l'insieme degli esempi del Synset, vuoto se non ce ne sono
	 * 
	 * @return l'insieme degli esempi del Synset, vuoto se non ce ne sono
	 */
	public Set<String> getExamples() { return examples; }
	
	/**
	 * Data una parola, restituisce un Optional di un esempio del Synset che la contiene
	 * 
	 * @param word una parola da ricercare fra gli esempi del Synset
	 * @return un Optional contenente la stringa rappresentante un esempio 
	 */
	public Optional<String> findExample(String word) { return examples.stream().filter( e -> e.contains(word) ).findAny(); }
	
	/**
	 * Restituisce lo stream delle relazioni del Synset verso altri Synset
	 * 
	 * @return lo stream delle relazioni del Synset verso altri Synset
	 */
	public Stream<RelatedSynset> streamRelatedSynsets() { return relatedSynsets.stream(); }
	
	/**
	 * Data una parola, restituisce true se il Synset la contiene tra i sinonimi, false altrimenti
	 * 
	 * @param word una parola
	 * @return true se il Synset contiene la parola data tra i sinonimi, false altrimenti
	 */
	public boolean contains(String word) 
	{
		return synonyms.stream()
				.anyMatch(s -> s.toLowerCase().equals(word.toLowerCase().replace(" ", "_"))
						|| s.toLowerCase().contains(word.toLowerCase().replace(" ", "_") + "("));
	}
	
	@Override
	public String toString()
	{
		return new StringBuilder()
				.append(offset + " ")
				.append(grammaticalCategory + " ")
				.append(synonyms.toString() + " ")
				.append("[" + streamRelatedSynsets()
				.map(s -> s.toString())
				.collect(Collectors.joining(", ")) + "] ")
				.append("| (" + gloss + ") ")
				.append(examples.toString())
				.toString();
	}
}
