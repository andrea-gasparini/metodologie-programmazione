
/**
 * Crea un'espressione con valore dato dalla divisione di due espressioni
 * 
 * @author Andrea Gasparini
 *
 */
public class Divisione extends EspressioneComposta
{
	public Divisione(Espressione esp1, Espressione esp2) { super(esp1, esp2); }
	
	public double getValore() { return esp1.getValore() / esp2.getValore(); }
}
