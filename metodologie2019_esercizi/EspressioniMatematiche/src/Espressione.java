
/**
 * Superclasse Espressione da cui vengono estese: 
 * - Costante
 * - Variabile
 * - EspressioneNegata 
 * - EspressioneComposta
 * 
 * @author Andrea Gasparini
 *
 */
abstract public class Espressione
{	
	/**
	 * @return il valore attuale dell'espressione
	 */
	abstract double getValore();
}
