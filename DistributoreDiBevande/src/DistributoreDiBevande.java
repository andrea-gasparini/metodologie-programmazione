import java.util.Random;

/**
 * @author Andrea Gasparini
 *
 */
public class DistributoreDiBevande
{
	private int nProdotti;
	
	private double saldo;
	
	Prodotto[] prodotti = Prodotto.values();
	
	int[] nProdottiDispobili;
	
	/**
	 * Crea un DistribuitoreDiBevande con n prodotti al suo interno
	 *
	 * @param n numero di prodotti presenti nel distributore
	 */
	public DistributoreDiBevande(int n) { nProdotti = n; }
	
	/**
	 * Inserisce nProdotti di tipo e ordine casuale
	 */
	public void carica() 
	{
		Random rnd = new Random();
		
		nProdottiDispobili = new int[prodotti.length];
		int n = 0;
		
		for (int i = 0; i < nProdottiDispobili.length; i++)
		{
			if (i == nProdottiDispobili.length - 1)
			{
				nProdottiDispobili[i] = nProdotti;
				break;
			}
			n = rnd.nextInt(nProdotti);
			nProdotti -= n;
			nProdottiDispobili[i] = n;
		}
		
		/*
		// Controllo del corretto caricamento 
		for (int i = 0; i < nProdottiDispobili.length; i++)
			System.out.println(prodotti[i] + ": " + nProdottiDispobili[i]);
		*/
	}
	
	/**
	 * Inserisce un importo decimale nel DistributoreDiBevande
	 *
	 * @param importo importo decimale da aggiungere al saldo
	 */
	public void inserisciImporto(double importo) 
	{
		saldo += importo;
	}
	
	/**
	 *  Dato un numero di prodotto, restituisce il prodotto associato
	 *	e decrementa il saldo disponibile nel distributore
	 *
	 * @param numeroProdotto il numero del prodotto selezionato
	 * @return il prodotto selezionato
	 */
	public Prodotto getProdotto(int numeroProdotto) throws Exception
	{
		if (nProdottiDispobili[numeroProdotto] > 0)
		{
			if (prodotti[numeroProdotto].getPrezzo() > saldo)
				throw new Exception("Saldo non sufficiente per l'acquisto");
			nProdottiDispobili[numeroProdotto] -= 1;
			saldo -= prodotti[numeroProdotto].getPrezzo();
			return prodotti[numeroProdotto];
		}
		throw new Exception(prodotti[numeroProdotto] + " non disponibile");
	}
	
	/**
	 * @return il saldo attuale
	 */
	public double getSaldo() { return saldo; }
	
	/**
	 * Restituisce il resto dovuto e azzera il saldo
	 *
	 * @return il resto dovuto
	 */
	public double getResto() 
	{
		double resto = saldo;
		saldo = 0;
		return resto;
	}
	
	public static void main(String[] args) throws Exception
	{
		
		DistributoreDiBevande distributore = new DistributoreDiBevande(15);
		distributore.carica();
		distributore.inserisciImporto(0.51);
		System.out.println("\nSaldo attuale: " + distributore.getSaldo());
		System.out.println(distributore.getProdotto(1));
		System.out.println(distributore.getResto());
	}
}