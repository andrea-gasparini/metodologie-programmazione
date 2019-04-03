
/**
 * Crea un'espressione con valore costante
 * 
 * @author Andrea Gasparini
 *
 */
public class Costante extends Espressione
{
	private double valore;
	
	public Costante(double valore) { this.valore = valore; }

	@Override
	public double getValore() { return valore; }
}
