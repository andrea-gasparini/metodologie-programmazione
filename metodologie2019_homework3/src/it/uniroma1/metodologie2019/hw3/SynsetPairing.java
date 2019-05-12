package it.uniroma1.metodologie2019.hw3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * La classe SynsetPairing rappresenta una coppia di Synset sorgente 
 * e destinazione con associato un punteggio di similarita' tra i due.
 * 
 * Il calcolo del punteggio viene effettuato da dei metodi privati 
 * nel momento in cui viene chiamato il costruttore; il calcolo valuta 
 * il numero di occorrenze in comune degli esempi e delle parole presenti 
 * nelle glosse, senza prendere in considerazione le Stop Words, 
 * filtrate appositamente da un metodo privato. Tutte le Stop Words si 
 * trovano nel file StopWords.txt e sono presenti in memoria nel campo List 
 * STOP_WORDS, inizializzato da un metodo privato che legge dal file.
 * 
 * Il punteggio del SynsetPairing e' compreso tra 1.0 (per i Synset identici) 
 * e 0.0 (per i Synset che non hanno abbastanza elementi in comune per essere 
 * considerati simili)
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class SynsetPairing
{
	/**
	 * Lista delle Stop Words principali della lingua inglese, utilizzate per 
	 * calcolare un punteggio di similarita' che non le prenda in considerazione 
	 * in quanto poco significative. L'inizializzazione e' gestita da un metodo 
	 * privato che legge dal file StopWords.txt contenuto nel package.
	 */
	public static final List<String> STOP_WORDS = readStopWords();
	
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
	 * Restituisce le Stop Words principali della lingua inglese, 
	 * contenute nel file StopWords.txt all'interno del package
	 */
	private static List<String> readStopWords()
	{
		try
		{
			return Files.lines(Paths.get("src" + File.separator + "it" + File.separator + "uniroma1" + 
					File.separator + "metodologie2019" + File.separator + "hw3" + File.separator + "StopWords.txt"))
					.collect(Collectors.toList());
		} catch (IOException e)
		{
			System.err.println("File \"StopWords.txt\" non trovato!");
		}
		return null;
	}
	
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
	 * le occorrenze presenti in un secondo insieme destinazione. 
	 * Il calcolo viene effettuato senza prendere in considerazione 
	 * le Stop Words, caricate in memoria a partire dal contenuto 
	 * del file StopWords.txt contenuto nel package. 
	 * Restituisce un punteggio compreso tra 1.0 e 0.0
	 * 
	 * @param source insieme sorgente di parole da confrontare
	 * @param target insieme destinazione di parole da confrontare
	 * @return il punteggio relativo alle occorrenze, compreso tra 1.0 e 0.0
	 */
	private double calcSimilScore(Set<String> source, Set<String> target)
	{
		Set<String> sourceSet = source.stream()
				.filter(s -> !(STOP_WORDS.contains(s)))
				.collect(Collectors.toSet());
		Set<String> targetSet = target.stream()
				.filter(s -> !(STOP_WORDS.contains(s)))
				.collect(Collectors.toSet());
		double cnt = sourceSet.stream()
				.filter(s -> targetSet.contains(s))
				.count();
		return cnt / (sourceSet.size() > targetSet.size() ? sourceSet.size() : targetSet.size());
	}
	
	@Override
	public String toString() { return new StringBuilder(source.getID() + " -> " + target.getID()).toString(); }
}
