package PhraseMagic;

import java.util.Random;

/**
 * @author Andrea Gasparini
 * 
 * Progettare una classe i cui oggetti contengono tre elenchi di parole E1, E2 e E3
 * 
 * La classe è in grado di emettere nuove espressioni costruite creando stringhe del tipo "a b c"
 * scegliendo casualmente dai tre rispettivi elenchi a (E1), b (E2), c (E3)
 * 
 * Ad esempio, dati i seguenti elenchi:
 * > E1 = {"salve", "ciao", "hello", "buongiorno", "scialla"}
 * > E2 = {"egregio", "eclettico", "intelligentissimo", "astutissimo"}
 * > E3 = {"studente", "ragazzo", "giovane", "scapestrato", "fannullone", "studioso"}
 * 
 *  Esempi di output sono: 
 *  > "salve egregio fannullone"
 *  > "ciao eclettico scapestrato"
 *  > "scialla astutissimo studente"
 */
public class PhraseMagic 
{
	String[] E1 = {"salve", "ciao", "hello", "buongiorno", "scialla"};
	String[] E2 = {"egregio", "eclettico", "intelligentissimo", "astutissimo"};
	String[] E3 = {"studente", "ragazzo", "giovane", "scapestrato", "fannullone", "studioso"};
	String fraseMagica = "";
	
	/**
	 * Istanzia un oggetto Random e lo utiliza per estrarre un numero casuale da ogni vettore
	 * Per ogni valore seleziona la stringa presente nel relativo indice e la aggiunge alla stringa fraseMagica
	 * 
	 * @return la fraseMagica, somma delle 3 stringhe randomiche da ogni vettore
	 */
	public String nuovaEspressione ()
	{
		int casuale;
		Random rand = new Random();
		casuale = rand.nextInt(E1.length);
		fraseMagica += E1[casuale] + " ";
		casuale = rand.nextInt(E2.length);
		fraseMagica += E2[casuale] + " ";
		casuale = rand.nextInt(E3.length);
		fraseMagica += E3[casuale];
		
		return fraseMagica;
	}
	
	/**
	 * Crea un oggetto e visualizza in output un'espressione randomica 
	 */
	public static void main(String[] args)
	{
		PhraseMagic phraseMagic = new PhraseMagic();
		
		System.out.println(phraseMagic.nuovaEspressione());	
	}
}

