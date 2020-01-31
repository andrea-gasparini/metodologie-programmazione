package it.uniroma1.metodologie2019.hw3;

/**
 * La classe BasicWordNetRelation rappresenta i tipi di relazioni esistenti su WordNet 
 * alla versione 3.1. Ogni tipo di relazione e' costruita a partire dalla sua versione
 * sotto forma di simbolo (String).
 * 
 * Tramite i metodi della classe e' possibile conoscere il tipo di relazione a partire 
 * dal simbolo che la rappresenta e viceversa
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public enum BasicWordNetRelation implements WordNetRelation
{
	ANTONYM("!"),
	HYPERNYM("@"),
	INSTANCE_HYPERNYM("@i"),
	HYPONYM("~"),
	INSTANCE_HYPONYM("~i"),
	MEMBER_HOLONYM("#m"),
	SUBSTANCE_HOLONYM("#s"),
	PART_HOLONYM("#p"),
	MEMBER_MERONYM("%m"),
	SUBSTANCE_MERONYM("%s"),
	PART_MERONYM("%p"),
	ATTRIBUTE("="),
	DERIVATIONALLY_RELATED_FORM("+"),
	DOMAIN_OF_SYNSET_TOPIC(";c"),
	MEMBER_OF_THIS_DOMAIN_TOPIC("-c"),
	DOMAIN_OF_SYNSET_REGION(";r"),
	MEMBER_OF_THIS_DOMAIN_REGION("-r"),
	DOMAIN_OF_SYNSET_USAGE(";u"),
	MEMBER_OF_THIS_DOMAIN_USAGE("-u"),
	ENTAILMENT("*"),
	CAUSE(">"),
	ALSO_SEE("^"),
	VERB_GROUP("$"),
	SIMILAR_TO("+"),
	PARTICIPLE_OF_VERB("<"),
	PERTAINYM("\\");
	
	/**
	 * Tipo di relazione sotto forma di simbolo (String)
	 */
	private String pointerSymbol;
	
	/**
	 * Costruisce il tipo di relazione con un simbolo (String) che rappresenta la relazione 
	 * 
	 * @param pointerSymbol il tipo di relazione sotto forma di simbolo (String)
	 */
	BasicWordNetRelation(String pointerSymbol) { this.pointerSymbol = pointerSymbol; }
	
	@Override
	public String getPointerSymbol() { return pointerSymbol; }
}
