
/**
 * @author Andrea Gasparini
 *
 */
public class StringaMangiona
{
	String str, str2;

	/**
	 * Crea un oggetto StringaMangiona e salva una copia della stringa per il conteggio delle lettere mangiate 
	 *
	 * @param s una stringa 
	 */
	public StringaMangiona(String s) 
	{ 
		str = s; 
		str2 = s;
	}
	
	/**
	 * Restituisce la stringa 
	 *
	 * @return lo stato attuale della stringa
	 */
	public String toString() { return str; }

	/**
	 * Restituisce la lunghezza della stringa 
	 *
	 * @return la lunghezza attuale della stringa
	 */
	public int length() { return str.length(); }

	/**
	 * Prende in input una posizione k e restituisce in output il carattere della stringa in posizione k
	 *
	 * @param k posizione del carattere 
	 * @return il carattere in posizione k
	 */
	public char getCarattere(int k) { return str.charAt(k); }

	/**
	 * Modifica la stringa dell'oggetto eliminando tutte le occorrenze della lettera in input
	 *
	 * @param let carattere di cui eliminare le occorrenze nella stringa
	 */
	public void mangiaLettera(char let)
	{
		String s = "";
		for (int i = 0; i < length() - 1; i++)
			if (getCarattere(i) != let)
				s += getCarattere(i);
		str = s;
	}

	/**
	 * Mangia tutte le lettere della stringa interna dell'oggetto 
	 */
	public void slurp() { str = ""; }

	/**
	 * Data in input un'altra StringaMangiona s, mangia tutti i propri caratteri contenuti anche nella StringaMangiona 
	 *
	 * @param s un oggetto StringaMangiona
	 */
	public void mangiaStringaMangiona(StringaMangiona s)
	{
		for (int i = 0; i < s.length(); i++)
			mangiaLettera(s.getCarattere(i));
	}

	/**
	 * Restituisce la somma delle occorrenze di lettere mangiate finora dall'oggetto
	 *
	 * @return il numero di lettere mangiate
	 */
	public int getTotaleMangiate() { return str2.length() - length(); }

	public static void main(String[] args) 
	{
		StringaMangiona s = new StringaMangiona("aabcbbb");
		StringaMangiona s2 = new StringaMangiona("ab");
		s.mangiaLettera('a');
		s.mangiaLettera('b');
		s.slurp();
		System.out.println(s.getTotaleMangiate());
	}
}
