package it.uniroma1.fabbricasemantica.data.wordnet;

/**
 * L'interfaccia WordNetRelation rappresenta le relazioni esistenti su WordNet e 
 * definisce i metodi comuni a tutte le classi che la implementano. 
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public interface WordNetRelation
{
	/**
	 * Restituisce il tipo di relazione sotto forma di simbolo (String)
	 * 
	 * @return il tipo di relazione sotto forma di simbolo (String)
	 */
	String getPointerSymbol();
}
