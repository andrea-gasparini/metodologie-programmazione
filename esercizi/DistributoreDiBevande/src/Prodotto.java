
/**
 * @author Andrea Gasparini
 * 
 */
public enum Prodotto
{
	Caffe(0.35),
	Cappuccino(0.45),
	Cioccolata(0.4);
	
	private double prezzo;
	
	/**
	 * Crea le costanti enumerative con un prezzo decimale
	 *
	 * @param prezzo il prezzo decimale
	 */
	Prodotto(double prezzo) { this.prezzo = prezzo; }
	
	/**
	 * @return il prezzo del prodotto
	 */
	public double getPrezzo() { return prezzo; }
}
