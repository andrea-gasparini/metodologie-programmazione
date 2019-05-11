package it.uniroma1.metodologie2019.hw3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * La classe SynsetPairing rappresenta una coppia di Synset sorgente 
 * e destinazione con associato un punteggio di similarita' tra i due.
 * 
 * Il calcolo del punteggio viene effettuato da dei metodi privati 
 * nel momento in cui viene chiamato il costruttore in base al numero 
 * di occorrenze in comune degli esempi e della similarita' della glossa.
 * Il punteggio e' compreso tra 1.0 (per i Synset identici) e 0.0 
 * (per i Synset che non hanno abbastanza elementi in comune per essere 
 * considerati simili)
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class SynsetPairing
{
	/**
	 * Synset sorgente
	 */
	private Synset source;

	/**
	 * Synset di destinazione
	 */
	private Synset target;
	
	/**
	 * Punteggio di similitarita' tra Synset sorgente e destinazione.
	 * Il punteggio e' compreso tra 1.0 (per i Synset identici) e 0.0  
	 * (per i Synset che non hanno abbastanza elementi in comune per essere 
	 * considerati simili) 
	 */
	private double score;

	/**
	 * Costruisce un SynsetPairing tra due Synset
	 * 
	 * @param source un Synset sorgente
	 * @param target un Synset di destinazione
	 */
	public SynsetPairing(Synset source, Synset target) 
	{
		this.source = source;
		this.target = target;
		score = calcScore();
	}
	
	/**
	 * Restituisce il Synset della versione sorgente di WordNet
	 * 
	 * @return il Synset della versione sorgente di WordNet
	 */
	public Synset getSource() { return source; }
	
	/**
	 * Restituisce il Synset della versione di destinazione di WordNet
	 * 
	 * @return il Synset della versione di destinazione di WordNet
	 */
	public Synset getTarget() { return target; }
	
	/**
	 * Restituisce il punteggio di similarita' tra Synset sorgente e destinazione
	 * 
	 * @return il punteggio di similarita' tra Synset sorgente e destinazione
	 */
	public double getScore() { return score; }

	/**
	 * Calcola il punteggio di similarita' tra Synset sorgente e destinazione
	 * 
	 * @return il punteggio di similarita' tra Synset sorgente e destinazione
	 */
	private double calcScore() 
	{
		if (source.getGloss().equals(target.getGloss()) && source.getSynonyms().equals(target.getSynonyms()))
			return 1.0;
		double similGlossScore = source.getGloss().equals(target.getGloss()) ? 1.0 : 0.0;
		double similSynonScore = source.getSynonyms().equals(target.getSynonyms()) ? 1.0 : 0.0;
		if (similGlossScore == 1.0)
			similSynonScore = calcSimilScore(source.getSynonyms(), target.getSynonyms());
		else if (similSynonScore == 1.0)
			similGlossScore = calcSimilScore(new HashSet<>(Arrays.asList(source.getGloss().split(" "))), new HashSet<>(Arrays.asList(target.getGloss().split(" "))));
		return similGlossScore == 0.0 || similSynonScore == 0.0 ? 0.0 : (similGlossScore + similSynonScore) / 2;
	}
	
	/**
	 * In base alle parole presenti in un insieme sorgente, calcola 
	 * le occorrenze presenti in un secondo insieme destinazione e 
	 * restituisce un punteggio superiore a 0.0 (e minore di 1.0) 
	 * se almeno la meta' delle parole e' presente, altrimenti 0.0
	 * 
	 * @param source insieme sorgente di parole da confrontare
	 * @param target insieme destinazione di parole da confrontare
	 * @return il punteggio relativo alle occorrenze, compreso tra 1.0 e 0.0
	 */
	private double calcSimilScore(Set<String> source, Set<String> target)
	{
		double size = source.size() > target.size() ? source.size() : target.size();
		double cnt = source.stream()
				.filter(s -> target.contains(s))
				.count();
		return cnt > size / 2 ? cnt / size : 0.0;
	}
	
	@Override
	public String toString() { return new StringBuilder(source.getID() + " -> " + target.getID()).toString(); }
}
