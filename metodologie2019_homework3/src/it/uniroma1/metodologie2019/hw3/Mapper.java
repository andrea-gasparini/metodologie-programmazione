package it.uniroma1.metodologie2019.hw3;

/**
 * La classe Mapper fornisce la mappatura tra versioni diverse di WordNet tramite il metodo map. 
 * Il metodo restituisce un oggetto di tipo WordNetMapping a partire da un'istanza di WordNet sorgente 
 * e una di destinazione
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class Mapper
{
	/**
	 * Date due istanze di WordNet, una sorgente e una di destinazione, restituisce un oggetto 
	 * di tipo WordNetMapping che fornisce le mappature dal WordNet sorgente a quello di destinazione
	 * 
	 * @param sourceWordNet un'istanza di WordNet sorgente
	 * @param targetWordNet un'istanza di WordNet di destinazione
	 * @return un oggetto di tipo WordNetMapping delle due istanze di WordNet 
	 */
	public static WordNetMapping map(WordNet sourceWordNet, WordNet targetWordNet) { return new WordNetMapping(sourceWordNet, targetWordNet); }
}
