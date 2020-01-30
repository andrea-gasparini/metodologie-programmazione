
/**
 * Creare quindi una seconda classe BarraDiEnergiaConPercentuale che fornisce una rappresentazione sotto forma di stringa come BarraDiEnergia 
 * ma stampando in coda alla stringa la percentuale del livello di riempimento. Per esempio, se il livello è 3 su 10, la stringa sarà "OOO======= 30%".
 * 
 * @author Andrea Gasparini
 * 
 */
public class BarraDiEnergiaConPercentuale extends BarraDiEnergia
{
	/**
	 * Crea un oggetto BarraDiEnergiaConPercentuale con una data lunghezza massima
	 * 
	 * @param maxLengthBarra lunghezza massima della barra
	 */
	public BarraDiEnergiaConPercentuale(int maxLengthBarra) { super(maxLengthBarra); }
	
	/**
	 * Restituisce la rappresentazione sotto forma di stringa della barra di energia (es. se il livello è 3 su 10, la stringa sarà "OOO======= 30%")
	 *
	 * @return una stringa contenente la rappresentazione della barra di energia
	 */
	@Override
	public String toString() { return super.toString() + " " + barra * 10 + "%"; }
	
	public static void main(String[] args)
	{
		BarraDiEnergiaConPercentuale barra = new BarraDiEnergiaConPercentuale(10);
		barra.incrementa();
		barra.incrementa(2);
		System.out.println(barra.toString());
	}
}
