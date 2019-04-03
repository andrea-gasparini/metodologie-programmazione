
/**
 * Crea un'espressione con valore dato dalla sottrazione di due espressioni 
 * 
 * @author Andrea Gasparini
 *
 */
public class Sottrazione extends EspressioneComposta
{
	public Sottrazione(Espressione esp1, Espressione esp2) { super(esp1, esp2); }
	
	@Override
	public double getValore() { return esp1.getValore() - esp2.getValore(); }
}
