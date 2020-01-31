
/**
 * Superclasse EspressioneComposta da cui vengono estese:
 * - Somma
 * - Sottrazione
 * - Prodotto
 * - Divisione
 * 
 * Effettua operazioni binarie tra due espressioni
 * 
 * @author Andrea Gasparini
 *
 */
abstract public class EspressioneComposta extends Espressione
{
	protected Espressione esp1, esp2;
	
	public EspressioneComposta(Espressione esp1, Espressione esp2) 
	{
		this.esp1 = esp1;
		this.esp2 = esp2;
	}
}
