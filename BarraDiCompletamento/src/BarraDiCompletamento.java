
/**
 * @author Andrea Gasparini
 *
 */
public class BarraDiCompletamento 
{
	double barra;
		
	/** 
	 * @param percPar percentuale di partenza della barra
	 */
	public BarraDiCompletamento (double percPar) { barra = percPar;	}
	
	/**
	 * @param percAgg percentuale da aggiungere alla barra
	 */
	public void incrementa (double percAgg) { barra += percAgg;	}
	
	/** 
	 * Approssima e semplifica [0, 10] la percentuale
	 * Ritorna una stringa con 10 caratteri: ">>..>" per la percentuale e "==..=" per la mancante
	 *
	 * @return una stringa contenente la Barra di Completamento
	 */
	public String toString ()
	{
		barra = Math.round(barra)/10;
		String barraString = "";
		
		for (int i = 0; i < 10; i++)
			if(i < barra)
				barraString += ">";
			else
				barraString += "=";
		
		return barraString;
	}
	
	/**
	 * Crea un oggetto con percentuale iniziale di 15% e incrementa di 10%
	 * Visualizza in output la Barra di Completamento
	 */
	public static void main(String[] args)
	{
		BarraDiCompletamento barra = new BarraDiCompletamento(15);
		
		barra.incrementa(10);
		System.out.println("Barra di Completamento:");
		System.out.println("      " + barra.toString());
	}

}
