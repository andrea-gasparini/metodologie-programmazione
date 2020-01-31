import java.util.Scanner;

/**
 * Progettare una classe che costituisca un modello di registratore di cassa
 * La classe deve consentire a un cassiere di inserire i prezzi di articoli
 * e la quantità di denaro pagata dal cliente, calcolando il resto dovuto
 * 
 * @author Andrea Gasparini
 *
 */
public class RegistratoreDiCassa 
{
	private double sommaDovuta, sommaPagata, restoDovuto;
	
	/**
	 * Incrementa la somma dovuta in base al prezzo di vendita dell'articolo inserito
	 *
	 * @param prezzoVendita prezzo dell'articolo da pagare
	 */
	public void setSommaDovuta(double prezzoVendita) { sommaDovuta += prezzoVendita; }
	
	/**
	 * Registra la somma di denaro pagata finora
	 *
	 * @param sommaPagata somma di denaro con cui si sta effettuando il pagamento
	 */
	public void setSommaPagata(double sommaPagata) { this.sommaPagata += sommaPagata; }
	
	/**
	 * Conclude la transazione, calcola il resto dovuto al cliente, restituendolo in uscita
	 * 
	 * @return il resto dovuto al cliente 
	 */
	public double endTransazione()
	{
		restoDovuto = sommaPagata - sommaDovuta;
			
		return restoDovuto;
	}
	
	/**
	 * Menù interattivo per il Registratore di Cassa
	 */
	public static void main(String[] args)
	{
		double in = 0.0;
		int choice = 0;
		String Menu = "\nSelezionare operazione (0 per uscire): \n"
				+ "1) Inserire nuovo prezzo prodotto \n"
				+ "2) Inserire nuova somma pagata \n"
				+ "3) Termina transazione e calcola il resto \n";
		
		Scanner input = new Scanner(System.in);
		RegistratoreDiCassa transazione1 = new RegistratoreDiCassa();
		
		do
		{
			System.out.println(Menu); 
			choice = input.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("\nInserimento nuovi prezzi prodotti (0 per uscire)");
				
				do
				{
					System.out.print("Prezzo: ");
					in = input.nextDouble();
					transazione1.setSommaDovuta(in);
				}
				while(in > 0.0);
				
				break;
			case 2:
				System.out.println("\nInserimento nuove somme pagate (0 per uscire)");
				
				do
				{
					System.out.print("Somma: ");
					in = input.nextDouble();
					transazione1.setSommaPagata(in);
				}
				while(in > 0.0);
				
				break;
			case 3:
				double restoDovuto = transazione1.endTransazione();
				
				if(restoDovuto > 0.0)
					System.out.println("\nIl resto dovuto al cliente è: " + restoDovuto + " €");
				else
				{
					restoDovuto *= -1;
					System.out.println("\nPagamento non accettato, " + restoDovuto + " € mancanti");
					double newResto = 0.0;
					do
					{
						System.out.print("\nNuova somma pagata: ");
						newResto += input.nextDouble();	
					}
					while(restoDovuto > newResto);
				}
				
				break;
			default:
				System.out.println("\nNessuna scelta effettuata, ritorno al Menu... \n");
				break;
			}
		}
		while(choice != 3);
		System.out.println("\nTRANSAZIONE COMPLETATA!");
	}

}
