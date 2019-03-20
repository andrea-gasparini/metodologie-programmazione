
/**
 * @author Andrea Gasparini
 *
 */
public class GestoreArray
{
	private int[] array;
	
	public GestoreArray(int[] array) 
	{
		this.array = array;
	}
	
	/**
	 * Dato in input un intero, restituisce la posizione dello stesso all'interno dell'array,
	 * se non è presente restituisce -1
	 *
	 * @param index intero da ricercare nell'array
	 * @return posizione dell'intero presente nel vettore
	 */
	public int indexOf(int index)
	{
		for(int i = 0; i < array.length; i++)
			if(array[i] == index)
				return i;
		return -1;
	}
	
	/**
	 * Concatena un altro array di interi in fondo all'array dell'oggetto
	 *
	 * @param un array di interi da concatenare
	 */
	public void concat(int[] array) 
	{
		int[] array2 = new int[this.array.length + array.length];
		int i;
		
		for(i = 0; i < this.array.length; i++)
			array2[i] = this.array[i];
		
		for(int ii = 0; ii < array.length; ii++, i++)
			array2[i] = array[ii];
		
		this.array = array2;
	}
	
	/**
	 * Concatena un array di un altro oggetto in fondo all'array dell'oggetto principale
	 *
	 * @param un oggetto array di interi da concatenare
	 */
	public void concat(GestoreArray array) { concat(array.array); }
	
	/**
	 * Concatena un altro array di interi in fondo all'array dell'oggetto, escludendo le ripetizioni
	 * Il metodo restituisce il numero di elementi scartati
	 *
	 * @param array un array di interi da concatenare senza ripetizioni
	 * @return numero di elementi scartati dalla concatenazione
	 */
	public int concatNoDup(int[] array)
	{
		int[] array2 = new int[array.length];
		int i = 0;
		
		for(int ii = 0; ii < array.length; ii++)
			if(indexOf(array[ii]) == -1) 
				array2[i++] = array[ii];
		
		concat(array2);
		
		return array2.length - i;
	}
	
	/**
	 * Concatena un array di un altro oggetto in fondo all'array dell'oggetto principale, escludendo le ripetizioni
	 *
	 * @param array un oggetto array di interi da concatenare
	 */
	public int concatNoDup(GestoreArray array) { return concatNoDup(array.array); } 
	
	/**
	 * Sostituisce la prima occorrenza di x con il valore di y all’interno dell’array
	 * Se l’occorrenza viene sostituita, il metodo restituisce true, altrimenti false
	 * 
	 * @param x valore del vettore da sostituire
	 * @param y valore con cui sostituire la prima occorrenza di x
	 * @return true se ha effettuato la sostituzione, false altrimenti
	 */
	public boolean replace(int x, int y) 
	{
		boolean sostituto = false;
		
		if(indexOf(x) != -1)
		{
			array[indexOf(x)] = y;
			sostituto = true;
		}
		
		return sostituto;
	}
	
	/**
	 * @return vettore rappresentato sotto forma di stringa
	 */
	public String toString()
	{	
		StringBuilder sb = new StringBuilder("{ ");
		
		for(int i = 0; i < array.length; i++)
		{
			sb.append(array[i]);
			if(i != array.length - 1)
				sb.append(", ");
		}
		sb.append(" }");
		
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		int[] myArray = {4, 4, 6, 10};
		GestoreArray a = new GestoreArray(new int[] {1, 2, 3});
		GestoreArray b = new GestoreArray(myArray);
		
		a.concat(b);
		a.concat(new int[] {4, 5, 6, 7});
		
		System.out.println(a.toString());
	}
}
