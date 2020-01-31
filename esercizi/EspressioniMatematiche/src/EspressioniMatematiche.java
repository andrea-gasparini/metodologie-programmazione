
/**
 * Progettare una serie di classi che modellino le espressioni matematiche secondo la seguente definizione:
 * – Una costante di tipo double è un’espressione
 * – Una variabile con nome di tipo stringa e valore double è un’espressione
 * – Se e1 è un’espressione, allora -e1 è un’espressione
 * – Se e1, e2 sono espressioni, allora e1 op e2 è un’espressione dove op può essere l’operatore +, -, *, /, %
 * 
 * Ogni tipo di espressione (costante, variabile, espressioni composte) deve essere modellata mediante una classe separata
 * Ogni espressione dispone del metodo getValore() che restituisce il valore che quell’espressione possiede in quel momento
 * Costruire quindi l’espressione –(5+(3/2)-2)*x e calcolarne il valore quando la variabile x vale 3 e quando la variabile x vale 6
 * 
 * @author Andrea Gasparini
 *
 */
public class EspressioniMatematiche
{
	public static void main(String[] args)
	{
		// -(5+(3/2)-2)*x
		
		Variabile x = new Variabile("x", 3);
		Espressione e = 
			new Prodotto(
				new EspressioneNegata(
						new Sottrazione(
								new Somma(
										new Costante(5), 
										new Divisione(
												new Costante(3),
												new Costante(2))),
								new Costante(2))),
				x);
		
		System.out.println("Soluzione dell'espressione: -(5+(3/2)-2)*x");
		System.out.println("Risultato per x = " + x.getValore() + " --> " + e.getValore());
		
		x.setValore(6.0);
		
		System.out.println("Risultato per x = " + x.getValore() + " --> " + e.getValore());
		
	}
}
