
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
	 * @param array un array di interi da concatenare
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
	 * @param array un oggetto array di interi da concatenare
	 */
	public void concat(GestoreArray array) { concat(array.array); }
	
	/**
	 * Preso in input un altro array di interi, concatena in fondo all'array dell'oggetto
     * solo gli elementi che non sono già presenti. Il metodo restituisce il numero di elementi scartati
	 *
	 * @param array un array di interi da concatenare senza ripetizioni
	 * @return duplicati numero di elementi scartati dalla concatenazione
	 */
	public int concatNoDup(int[] array)
	{
		int duplicati = 0;
		int[] array2 = new int[this.array.length + array.length];
		int i;
		
		for(i = 0; i < this.array.length; i++)
			array2[i] = this.array[i];
		
		for(int ii = 0; ii < array.length; ii++, i++)
		{
			//this.array.indexOf(array[i]);
			array2[i] = array[ii];
		}
		
		this.array = array2;
		
		return duplicati;
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
		int[] myArray = {2, 4, 6, 10};
		GestoreArray a = new GestoreArray(new int[] {1, 2, 3});
		GestoreArray b = new GestoreArray(myArray);
		
		System.out.println(a.indexOf(3)); 
		System.out.println(a.indexOf(4));
		a.concat(b);
		a.concat(new int[] {4, 5, 6, 7});
		
		System.out.println(a.toString());
	}
}
