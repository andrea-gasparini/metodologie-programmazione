
/**
 * Progettare una classe ScacchieraTris che implementi la scacchiera del gioco del tris
 * La classe deve memorizzare la scacchiera i cui elementi possono essere:
 * - " " (se non è stata ancora occupata la casella)
 * - "X" oppure "O" (secondo il giocatore che ha occupato la casella)
 * 
 * La classe deve stampare in qualsiasi momento la situazione della scacchiera
 * Deve permettere di occupare una casella con un simbolo "X" o "O"
 * Progettare quindi una classe Tris che implementi il gioco utilizzando la scacchiera appena progettata
 * 
 * @author Andrea Gasparini
 *
 */
public class ScacchieraTris
{
	private final int dimSc = 3;
	private String[][] scacchiera;
	
	/**
	 * Crea un oggetto ScacchieraTris formato dalla matrice 3x3
	 */
	public ScacchieraTris() { scacchiera = new String[][] {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}}; }
	
	/** 
	 * Restituisce la situazione della scacchiera sotto forma di stringa
	 * 
	 * @return una stringa che rappresenta la situazione della scacchiera
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < dimSc; i++)
		{
			for (int ii = 0; ii < dimSc; ii++)
				sb.append("| " + scacchiera[i][ii] + " ");
			
			sb.append("|\n");
			
			for(int ii = 0; ii < dimSc && i < dimSc - 1; ii++) 
				sb.append("----");
			
			sb.append("\n");
		}
			
		return sb.toString();	
	}
	
	/**
	 * Occupa la casella di coordinate (x, y) con "X" o "O"
	 * Il turno rimane invariato se si sceglie una casella già occupata
	 * 
	 * @param x numero di riga della matrice
	 * @param y numero di colonna della matrice
	 * @param p identificativo del giocatore da inserire
	 * @param t numero del turno di gioco
	 * @return numero del turno di gioco
	 */
	public int occupaCasella(int x, int y, String p, int turn) 
	{
		if (scacchiera[x][y] == " ")
			scacchiera[x][y] = p == "X" ? "X" : "O"; 
		else
			return turn;
		return turn + 1;
	}
	
	/**
	 * Controlla se sulla scacchiera è presente un Tris
	 * 
	 * @return una stringa contenente l'esito della partita (TRIS o nulla)
	 */
	public boolean checkTris(String giocatore) 
	{ 
		if (scacchiera[0][0].equals(giocatore) && scacchiera[0][1].equals(giocatore) && scacchiera[0][2].equals(giocatore) ||
				scacchiera[1][0].equals(giocatore) && scacchiera[1][1].equals(giocatore) && scacchiera[1][2].equals(giocatore) ||
				scacchiera[2][0].equals(giocatore) && scacchiera[2][1].equals(giocatore) && scacchiera[2][2].equals(giocatore) ||
				scacchiera[0][0].equals(giocatore) && scacchiera[1][0].equals(giocatore) && scacchiera[2][0].equals(giocatore) ||
				scacchiera[0][1].equals(giocatore) && scacchiera[1][1].equals(giocatore) && scacchiera[2][1].equals(giocatore) ||
				scacchiera[0][2].equals(giocatore) && scacchiera[1][2].equals(giocatore) && scacchiera[2][2].equals(giocatore) ||
				scacchiera[0][0].equals(giocatore) && scacchiera[1][1].equals(giocatore) && scacchiera[2][2].equals(giocatore) ||
				scacchiera[0][2].equals(giocatore) && scacchiera[1][1].equals(giocatore) && scacchiera[2][0].equals(giocatore))
			return true;
		return false; 
	}
}
