package it.uniroma1.metodologie2019.hw3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * La classe WordNet rappresenta un'istanza di una versione del dizionario. 
 * Ogni istanza e' formata dalla versione e dalla relativa Mappa contenente i Synset, su cui la classe e' iterabile. 
 * 
 * La stessa versione di WordNet non viene mai istanziata piu' di una volta, quando viene richiesta una versione 
 * tramite il metodo getInstance, viene controllato se sia gia' presente in memoria per poter restituire 
 * il medesimo oggetto contenente il dizionario caricato precedentemente.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class WordNet implements Iterable<Synset>
{

	/**
	 * Path della cartella contenente le versioni di WordNet rilasciate
	 */
	public static final Path PATH_WORDNET = Paths.get("wordnet-releases" + File.separator + "releases");
	
	/**
	 * Array di stringhe contenente i nomi dei file data, in cui sono contenute tutte le informazioni sui Synset 
	 */
	public static final String[] DATA_FILES = {"data.adj", "data.adv", "data.noun", "data.verb"};

	/**
	 * Versione di WordNet
	 */
	private String version;

	/**
	 * Mappa dei Synset presenti nella versione di WordNet, in cui la chiave e' l'ID
	 * del Synset e il valore e' il relativo Synset associato
	 */
	private Map<String, Synset> synsetsMap;

	/**
	 * Mappa delle versioni di WordNet gia' istanziate, in cui la chiave e' la
	 * versione e il valore e' la relativa istanza di WordNet
	 */
	private static Map<String, WordNet> instancedVersions = new HashMap<>();

	/**
	 * Costruisce un'istanza di WordNet a partire dalla versione e dal Path 
	 * in cui sono immagazzinati i relativi dati  
	 *  
	 * @param version la versione di WordNet
	 * @param folderDir il Path in cui sono immagazzinati i relativi dati
	 */
	private WordNet(String version, Path folderDir)
	{
		this.version = version;
		synsetsMap = new HashMap<>();
		List<Path> dirFiles = new ArrayList<>();
		for (String fileName : DATA_FILES)
			dirFiles.add(folderDir.resolve(fileName));
		for (Path dir : dirFiles)
		{
			try (BufferedReader br = Files.newBufferedReader(dir))
			{
				String line = "";
				while (br.ready())
				{
					line = br.readLine();
					if (!(line.startsWith("  ")))
					{
						String[] lineSplitted = line.split(" ");
						int nSynonyms = Integer.parseInt(lineSplitted[3], 16);
						Set<String> synonyms = new HashSet<>();
						synonyms.add(lineSplitted[4]);
						int pos = 6;
						if (nSynonyms > 1)
							for (int i = 0; i < nSynonyms - 1; i++)
							{
								synonyms.add(lineSplitted[pos]);
								pos += 2;
							}
						
						int nRelations = Integer.parseInt(lineSplitted[pos]);
						Set<RelatedSynset> relatedSynsets = new HashSet<>();
						for (int i = 0; i < nRelations; i++)
						{
							relatedSynsets.add(new RelatedSynset(lineSplitted[pos + 1],
									lineSplitted[pos + 2] + lineSplitted[pos + 3]));
							pos += 4;
						}
						
						String restOfLine = line.substring(line.indexOf("|") + 2, line.length() - 1);
						pos = restOfLine.indexOf("\"");
						String gloss;
						Set<String> examples = new HashSet<>();
						if (pos == -1) // se non ci sono esempi
							gloss = restOfLine.substring(0, restOfLine.length() - 1);
						else
						{
							if (pos + 2 == restOfLine.length()) // se le virgolette si trovano solo come ultimo carattere
							{
								if (restOfLine.indexOf(";") == -1) // e se non ci sono esempi
									gloss = restOfLine.substring(0, restOfLine.length() - 2);
								else
								{
									gloss = restOfLine.substring(0, restOfLine.indexOf(";"));
									examples.add(restOfLine.substring(restOfLine.indexOf(";") + 2, restOfLine.length() - 2));
								}
							} 
							else
							{
								gloss = restOfLine.substring(0, pos).trim().isEmpty() ? "" : restOfLine.substring(0, pos - 2);
								restOfLine = restOfLine.substring(pos);
								pos = restOfLine.substring(1).indexOf("\"");
								if (pos == -1) // se ci sono solo le virgolette in apertura
									examples.add(restOfLine.substring(1));
								else
								{
									examples.add(restOfLine.substring(1, pos + 1));
									restOfLine = restOfLine.substring(pos + 2);
									pos = restOfLine.indexOf("\"");
									while (pos != -1)
									{
										restOfLine = restOfLine.substring(pos);
										pos = restOfLine.substring(1).indexOf("\"");
										if (pos + 1 == 0) // se mancano le virgolette finali
										{
											examples.add(restOfLine.substring(1));
											pos = -1;
										} 
										else
										{
											examples.add(restOfLine.substring(1, pos + 1));
											restOfLine = restOfLine.substring(pos + 2);
											pos = restOfLine.indexOf("\"");
										}
									}
								}
							}
						}
						synsetsMap.put(lineSplitted[0] + lineSplitted[2], new Synset(lineSplitted[0], lineSplitted[2],
								synonyms, relatedSynsets, gloss, examples));
					}
				}

			} catch (IOException e)
			{
				System.err.println("File non esistente!");
			}
		}
	}

	/**
	 * Controlla se la versione di WordNet e' disponibile nella cartella wordnet-releases 
	 * e se e' stata gia' istanziata in precedenza restituisce quella stessa istanza, 
	 * altrimenti richiama il costruttore e restituisce una nuova istanza.
	 * Se invece la versione di WordNet non e' disponibile nella cartella restituisce null
	 * 
	 * @param version la versione di WordNet di cui si vuole l'istanza
	 * @return l'istanza di WordNet della versione specificata, null se non disponibile 
	 * nella cartella wordnet-releases
	 */
	public static WordNet getInstance(String version)
	{
		Path folderDir = Paths.get(PATH_WORDNET + File.separator + "WordNet-" + version + File.separator + "dict");
		if (!(Files.exists(folderDir)))
			return null;
		if (instancedVersions.containsKey(version))
			return instancedVersions.get(version);
		WordNet wn = new WordNet(version, folderDir);
		instancedVersions.put(version, wn);
		return wn;
	}

	/**
	 * Restituisce la lista dei Synset che contengono tra i sinonimi la parola specificata 
	 * 
	 * @param lemma una parola nella sua forma base
	 * @return la lista dei Synset che contengono la parola specificata
	 */
	public List<Synset> getSynsets(String lemma)
	{
		return stream()
				.filter(s -> s.contains(lemma))
				.collect(Collectors.toList());
	}

	/**
	 * Restituisce la lista dei Synset che contengono tra i sinonimi la parola specificata 
	 * e che fanno parte della categoria grammaticale specificata 
	 * 
	 * @param lemma una parola nella sua forma base
	 * @param grammaticalCategory una categoria grammaticale
	 * @return la lista dei Synset che contengono la parola specificata e che 
	 * fanno parte della categoria grammaticale specificata
	 */
	public List<Synset> getSynsets(String lemma, POS grammaticalCategory)
	{
		return getSynsets(lemma).stream()
				.filter(s -> grammaticalCategory == s.getPOS())
				.collect(Collectors.toList());
	}

	/**
	 * Restituisce il Synset corrispondente all'ID specificato, null se non presente
	 * 
	 * @param synsetID un ID sotto forma di stringa (offset+pos, es: "00001740n")
	 * @return il Synset corrispondente all'ID specificato, null se non presente
	 */
	public Synset getSynsetFromID(String synsetID) { return synsetsMap.get(synsetID); }

	/**
	 * Restituisce uno stream di Synset
	 * 
	 * @return uno stream di Synset
	 */
	public Stream<Synset> stream() { return synsetsMap.values().stream(); }

	/**
	 * Restituisce la versione di WordNet
	 * 
	 * @return la versione di WordNet
	 */
	public String getVersion() { return version; }

	/**
	 * Dati un Synset e una relazione sotto forma di stringa, restituisce 
	 * una collezione di Synset correlati. Se la relazione non esiste o non ci sono 
	 * istanze di tale relazione viene restituita una collezione vuota
	 * 
	 * @param sourceSynset un Synset sorgente
	 * @param relation una relazione sotto forma di stringa
	 * @return una collezione di Synset correlati al Synset sorgente specificato
	 */
	public Collection<Synset> getRelatedSynsets(Synset sourceSynset, String relation)
	{
		return sourceSynset.streamRelatedSynsets()
				.filter(s -> s.getRelation().equals(relation))
				.map(s -> getSynsetFromID(s.getSynsetID()))
				.collect(Collectors.toSet());
	}

	/**		
	 * Dati un Synset e una relazione sotto forma di WordNetRelation, restituisce 
	 * una collezione di Synset correlati. Se la relazione non esiste o non ci sono 
	 * istanze di tale relazione viene restituita una collezione vuota
	 * 
	 * @param sourceSynset un Synset sorgente
	 * @param relation una relazione sotto forma di WordNetRelation
	 * @return una collezione di Synset correlati al Synset sorgente specificato
	 */
	public Collection<Synset> getRelatedSynsets(Synset sourceSynset, WordNetRelation relation) { return getRelatedSynsets(sourceSynset, relation.getPointerSymbol()); }

	@Override
	public Iterator<Synset> iterator()
	{
		return new Iterator<Synset>()
		{
			private int i;
			private List<Synset> synsetsList = new ArrayList<>(synsetsMap.values());
			
			@Override
			public boolean hasNext() { return i < synsetsList.size(); }

			@Override
			public Synset next() { return synsetsList.get(i++); }
		};
	}

	@Override
	public boolean equals(Object wn)
	{
		if (wn != null && wn instanceof WordNet && version.equals(((WordNet) wn).getVersion()))
			return true;
		return false;
	}
}
