
/**
 * @author Andrea Gasparini
 *
 */
public class ListaDiInteri 
{
	private int[] a;
	
	/**
	 * Crea un oggetto ListaDiInteri formato da 0 a N interi 
	 * 
	 * @param valori valori da inserire nella lista
	 */
	public ListaDiInteri(int... valori)
	{
		a = new int[valori.length];
		
		for(int i = 0; i < a.length; i++)
			a[i] = valori[i];
	}
	
	/**
	 * Restituisce l'elemento nella posizione specificata
	 * 
	 * @param k posizione dell'intero da restituire
	 * @return l'elemento k-esimo della lista
	 */
	public int get(int k) { return a[k]; }
	
	/**
	 * Restituisce l'indice della posizione di un intero fornito in input
	 * 
	 * @param v intero di cui cercare la posizione
	 * @return l'indice della posizione dell'intero
	 */
	public int indexOf(int v)
	{
		for (int i = 0; i < a.length; i++)
			if (a[i] == v) 
				return i;
		return -1;
	}
	
	/**
	 * Restituisce una stringa formattata { n, n2, n3 ... } contenente la lista di interi
	 * 
	 * @return una stringa contenente la lista di interi
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder("{ ");
		
		for(int i = 0; i < a.length; i++)
		{
			sb.append(a[i]);
			if (i < a.length - 1)
				sb.append(", ");
		}
		sb.append(" }");
		
		return sb.toString();
	}
	
	/**
	 * Restituisce la dimensione della lista
	 * 
	 * @return la dimensione della lista
	 */
	public int size() { return a.length; }
	
	/**
	 * Controlla se un intero è contenuto nella lista
	 * 
	 * @param v
	 * @return true se v è contenuto, false altrimenti
	 */
	public boolean contains(int v) { return indexOf(v) != -1; }
	
	/**
	 * Aggiunge un intero in coda alla lista
	 * 
	 * @param v intero da aggiungere
	 */
	public void add(int v) { add(v, a.length); }
	
	/**
	 * Aggiunge un intero nella posizione specifiata
	 * 
	 * @param v intero da aggiungere
	 * @param k posizione in cui aggiungere l'intero
	 */
	public void add(int v, int k)
	{
		int[] b = new int[a.length + 1];
		
		for (int i = 0; i < k; i++) 
			b[i] = a[i];
		
		b[k] = v;
		
		for (int i = k; i < a.length; i++) 
			b[i+1] = a[i];
		
		a = b;
	}
	
	/**
	 * Elimina la prima occorrenza di un intero dalla lista
	 * 
	 * @param v intero da eliminare dalla lista
	 */
	public void del(int v)
	{
		int b[] = new int[a.length - 1];
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == v)
			{
				delPos(i);
				return;
			}
			
		}
	
	}
	
	/**
	 * Elimina l'elemento nella posizione specificata
	 * 
	 * @param k posizione dell'intero da eliminare dalla lista
	 */
	public void delPos(int k)
	{
		int b[] = new int[a.length - 1];
		
		for (int i = 0; i < k; i++)
			b[i] = a[i];
		
		for (int i = k; i < b.length; i++)
			b[i] = a[i + 1];
		
		a = b;
			
	}
	
	public static void main(String[] args)
	{
		ListaDiInteri l1 = new ListaDiInteri();
		ListaDiInteri l2 = new ListaDiInteri(1, 2, 3);
		ListaDiInteri l3 = new ListaDiInteri(new int[] {4, 5, 6});
	}

}
