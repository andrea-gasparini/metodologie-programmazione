
/**
 * @author Andrea Gasparini
 *
 */
public class Persona 
{
	String nome, cognome, listaNomi;
	
	/**
	 * Costruttore di oggetti Persona, con due parametri
	 * @param nomeIn il nome della persona da aggiungere
	 * @param cognomeIn il cognome della persona da aggiungere
	 */
	public Persona (String nomeIn, String cognomeIn)
	{
		nome = nomeIn;
		cognome = cognomeIn;
		listaNomi += nome + " " + cognome + "\n";
	}
	
	/**
	 * Main della classe Persona
	 * SOLITAMENTE SI IMPLEMENTA IN UNA CLASSE A PARTE 
	 */
	static public void main(String[] args)
	{
		Persona persona1 = new Persona("Andrea","Gasparini");
		Persona persona2 = new Persona("Giovanni","Gasparini");
		System.out.println(persona1.stampa());
		System.out.println(persona2.stampa());
	}
	
	/**
	 * Stampa nome e cognome di Persona
	 */
	public String stampa ()
	{
		return nome + " " + cognome;
	}

}
