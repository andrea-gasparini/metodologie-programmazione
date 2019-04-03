
/**
 * Crea un'espressione con il valore dato dalla somma di due espressioni
 * 
 * @author Andrea Gasparini
 *
 */
public class Somma extends EspressioneComposta
{
	public Somma(Espressione esp1, Espressione esp2) { super(esp1, esp2); }
	
	public double getValore() { return esp1.getValore() + esp2.getValore(); }
}
