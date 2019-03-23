
/**
 * Progettare una classe Stringa42, costruita a partire da 3 stringhe in input,
 * che concateni le stringhe inframezzate da spazi e conservi solo i primi 42 caratteri
 * della stringa risultante
 * 
 * @author Andrea Gasparini
 *
 */
public class Stringa42 
{
	private String str;
	
	/** 
	 * Crea una variabile str concatenando le tre date come parametri 
	 * 
	 * @param str1 prima stringa da concatenare
	 * @param str2 seconda stringa da concatenare
	 * @param str3 terza stringa da concatenare
	 */
	public Stringa42(String str1, String str2, String str3)
	{
		str = str1 + " " + str2 + " " + str3;
		if(str.length() > 42)
			str = str.substring(0, 42);
	}
	
	/**
	 * @return la stringa con lunghezza massima 42
	 */
	public String getStringa42() { return str; }
	
	/**
	 * @return l'iniziale della stringa
	 */
	public char getInizialeStringa42() { return str.charAt(0);	}
	
	/**
	 * Restituisce un booleano che indichi se la stringa è pari al numero "magico" 42
	 *
	 * @return true se la stringa è pari a 42, false altrimenti
	 */
	public boolean getBooleanStringa42() { return str.equals("42"); }
	
	/**
	 * Restituisce un booleano che indichi se la stringa contiene il numero "magico" 42
	 *
	 * @return true se la stringa contiene "42", false altrimenti
	 */
	public boolean getBoolean42Stringa42()
	{
		if(str.indexOf("42") > 0) 
			return true;
		else
			return false;
	}
	
	/**
	 * Crea un oggetto stringa ed esegue tutti i metodi della classe, mostrandoli in ouput 
	 */
	public static void main(String[] args)
	{
		Stringa42 stringa = new Stringa42("parolaparolaparola", "parolaparolaparola", "parolaparolaparola");
		System.out.println("Stringa con lunghezza massima 42: " + stringa.getStringa42());
		System.out.println("Iniziale della stringa: " + stringa.getInizialeStringa42());
		System.out.println("La stringa è pari a 42? " + stringa.getBooleanStringa42());
		System.out.println("La stringa contiene il numero 42? " + stringa.getBoolean42Stringa42());
	}
}
