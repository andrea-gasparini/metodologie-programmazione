
/**
 * Crea un'espressione con valore negato
 * 
 * @author Andrea Gasparini
 *
 */
public class EspressioneNegata extends Espressione
{
	private Espressione esp;
	
	public EspressioneNegata(Espressione esp) { this.esp = esp; }
	
	@Override
	public double getValore() { return -esp.getValore(); }
}
