package it.uniroma1.fabbricasemantica.data.wordnet;


/**
 * La classe POS rappresenta le categorie grammaticali (Nome, Verbo, Aggettivo e Avverbio). 
 * Permette di conoscere la categoria grammaticale a partire dal carattere con cui viene 
 * rappresentata nel database (file data) di WordNet
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public enum POS 
{
	NOUN, VERB, ADJECTIVE, ADVERB;
	
	/**
	 * Data una categoria grammaticale sotto forma di stringa, restituisce l'oggetto POS corrispondente
	 * 
	 * @param grammaticalCategory una categoria grammaticale sotto forma di stringa
	 * @return l'oggetto POS corrispondente alla categoria specificata
	 */
	public static POS getPOS(String grammaticalCategory) 
	{
		switch (grammaticalCategory)
		{
		case "n": 
			return NOUN;
		case "v":
			return VERB;
		case "a":
			return ADJECTIVE;
		case "s":
			return ADJECTIVE;
		case "r":
			return ADVERB;
		default:
			return null;
		}
	}
}
