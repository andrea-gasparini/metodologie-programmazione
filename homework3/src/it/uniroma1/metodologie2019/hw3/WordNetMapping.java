package it.uniroma1.metodologie2019.hw3;

import java.util.Comparator;
import java.util.Optional;

/**
 * La classe WordNetMapping rappresenta la mappatura tra due versioni di WordNet, una sorgente e una di destinazione.
 * Tramite il metodo getMapping e' possibile conoscere il SynsetPairing che mappa un Synset della versione di WordNet sorgente 
 * con il Synset piu' simile della versione di destinazione
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class WordNetMapping
{
	/**
	 * Istanza di WordNet sorgente
	 */
	private WordNet sourceWordNet;
	
	/**
	 * Istanza di WordNet di destinazione
	 */
	private WordNet targetWordNet;
	
	/**
	 * Costruisce una mappatura tra due versioni di WordNet, una sorgente e una di destinazione
	 * 
	 * @param sourceWordNet un'istanza di WordNet sorgente
	 * @param targetWordNet un'istanza di WordNet di destinazione
	 */
	public WordNetMapping(WordNet sourceWordNet, WordNet targetWordNet)
	{
		this.sourceWordNet = sourceWordNet;
		this.targetWordNet = targetWordNet;
	}

	/**
	 * Dato un Synset dell'istanza di WordNet sorgente, restituisce 
	 * un Optional contenente il SynsetPairing che mappa il Synset sorgente 
	 * con il miglior Synset dell'istanza di WordNet di destinazione
	 * 
	 * @param sourceSynset un Synset dell'istanza di WordNet sorgente
	 * @return un Optional contenente il SynsetPairing migliore rispetto ai Synset 
	 * dell'istanza di WordNet di destinazione
	 */
	public Optional<SynsetPairing> getMapping(Synset sourceSynset) 
	{
		if (sourceWordNet.equals(targetWordNet))
			return Optional.ofNullable(new SynsetPairing(sourceSynset, sourceSynset));
		if (sourceWordNet.getSynsetFromID(sourceSynset.getID()) == null)
			return Optional.ofNullable(null);
		else
		{
			return targetWordNet.stream()
					.filter(s -> s.getPOS().equals(sourceSynset.getPOS()))
					.map(s -> new SynsetPairing(sourceSynset, s))
					.filter(s -> s.getScore() > 0.0)
					.max(new Comparator<SynsetPairing>() 
					{
						@Override
						public int compare(SynsetPairing sp1, SynsetPairing sp2) 
						{
							return Double.compare(sp1.getScore(), sp2.getScore());
						}
					});
		}
	}
}
