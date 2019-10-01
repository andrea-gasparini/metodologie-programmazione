package it.uniroma1.fabbricasemantica.data.wordnet;

/**
 * La classe RelatedSynset rappresenta una relazione verso un Synset. 
 * E' composta da un campo che rappresenta il tipo della relazione e da un campo che rappresenta 
 * l'ID del Synset verso cui e' la relazione; i metodi permettono di conoscerne i valori
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class RelatedSynset
{
	/**
	 * Tipo di relazione
	 */
	private String relation;
	
	/**
	 * ID del Synset verso cui e' la relazione
	 */
	private String synsetID;

	/**
	 * Costruisce una relazione verso un Synset a partire da un simbolo di relazione sotto forma di stringa 
	 * e l'ID del Synset verso cui e' la relazione
	 * 
	 * @param relation una relazione sotto forma di stringa
	 * @param synsetID l'ID del Synset verso cui e' la relazione
	 */
	public RelatedSynset(String relation, String synsetID) { this.relation = relation; this.synsetID = synsetID; }

	/**
	 * Restituisce il tipo di relazione
	 * 
	 * @return il tipo di relazione
	 */
	public String getRelation() { return relation; }

	/**
	 * Restituisce l'ID del Synset verso cui e' la relazione
	 * 
	 * @return l'ID del Synset verso cui e' la relazione
	 */
	public String getSynsetID() { return synsetID; }
	
	@Override
	public String toString() { return relation + " -> " + synsetID; }
}
