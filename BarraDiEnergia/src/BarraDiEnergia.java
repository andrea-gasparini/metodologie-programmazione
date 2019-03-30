
/**
 * Creare una classe BarraDiEnergia costruita con un intero che ne determina la lunghezza massima.
 * Inizialmente la barra è vuota. La barra è dotata di un metodo per l’incremento unitario del suo livello di riempimento
 * e di un metodo toString che ne fornisca la rappresentazione sotto forma di stringa (es. se il livello è 3 su 10, la stringa sarà "OOO=======").
 *
 * @author Andrea Gasparini
 * 
 */
public class BarraDiEnergia
{
	protected int barra, maxLengthBarra;
	
	/**
	 * Crea un oggetto BarraDiEnergia con una data lunghezza massima
	 * 
	 * @param maxLengthBarra lunghezza massima della barra
	 */
	public BarraDiEnergia(int maxLengthBarra)
	{
		barra = 0;
		this.maxLengthBarra = maxLengthBarra;
	}
	
	/**
	 * Incrementa di un dato valore il livello di riempimento della barra
	 *
	 * @param n valore intero con cui incrementare
	 */
	public void incrementa(int n) 
	{
		barra += n;	
		if (barra > maxLengthBarra) barra = maxLengthBarra;
	}
	
	/**
	 * Incrementa di 1 il livello di riempimento della barra
	 */
	public void incrementa() { incrementa(1); }
	
	/**
	 * Restituisce la rappresentazione sotto forma di stringa della barra di energia (es. se il livello è 3 su 10, la stringa sarà "OOO=======")
	 *
	 * @return una stringa contenente la rappresentazione della barra di energia
	 */
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < maxLengthBarra; i++)
			sb.append(i < barra ? "O" : "=");
		
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		BarraDiEnergia barra = new BarraDiEnergia(10);
		barra.incrementa();
		barra.incrementa(2);
		System.out.println(barra.toString());
	}
	
}