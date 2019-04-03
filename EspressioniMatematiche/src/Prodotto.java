
/**
 * Crea un'espressione con valore dato dal prodotto di due espressioni
 * 
 * @author Andrea Gasparini
 *
 */
public class Prodotto extends EspressioneComposta
{
	public Prodotto(Espressione esp1, Espressione esp2) { super(esp1, esp2); }
	
	public double getValore() { return esp1.getValore() * esp2.getValore(); }
}
