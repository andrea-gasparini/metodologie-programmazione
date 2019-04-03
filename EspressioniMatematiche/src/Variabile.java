
/**
 * Crea un'espressione con valore variabile, assegnato ad una stringa
 * 
 * @author Andrea Gasparini
 *
 */
public class Variabile extends Espressione
{
	private double valore;
	private String nomeVar;
	
	public Variabile(String nomeVar, double valore) 
	{
		this.nomeVar = nomeVar;
		this.valore = valore;
	}
	
	public String getNomeVar() { return nomeVar; }
	
	public void setValore(double valore) { this.valore = valore; }
	
	@Override
	public double getValore() { return valore; }
}
