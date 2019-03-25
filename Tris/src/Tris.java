import java.util.Scanner;

/**
 * Implementazione del gioco del Tris tramite la classe ScacchieraTris
 * 
 * @author Andrea Gasparini
 *
 */
public class Tris
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ScacchieraTris obj = new ScacchieraTris();
		
		int turn = 1, choice = 0, oldTurn = 0;
		String giocatore = "X";
		
		System.out.println("GIOCO DEL TRIS \nInizia il giocatore X \nSeleziona una casella fra 1 e 9 \n");
		
		outer: while (true)
		{	
			oldTurn = turn;
			giocatore = turn % 2 != 0 ? "X" : "O";
			System.out.print("Giocatore " + giocatore + ": ");
			choice = in.nextInt();
			
			if (choice < 1 || choice > 9)
				System.out.println("Casella non esistente, scegline un'altra \n");
			else 
			{		
				
				switch (choice)
				{
				case 1:
					turn = obj.occupaCasella(0, 0, giocatore, turn);
					break;
				case 2:
					turn = obj.occupaCasella(0, 1, giocatore, turn);
					break;
				case 3:
					turn = obj.occupaCasella(0, 2, giocatore, turn);
					break;
				case 4:
					turn = obj.occupaCasella(1, 0, giocatore, turn);
					break;
				case 5:
					turn = obj.occupaCasella(1, 1, giocatore, turn);
					break;
				case 6:
					turn = obj.occupaCasella(1, 2, giocatore, turn);
					break;
				case 7:
					turn = obj.occupaCasella(2, 0, giocatore, turn);
					break;
				case 8:
					turn = obj.occupaCasella(2, 1, giocatore, turn);
					break;
				case 9:
					turn = obj.occupaCasella(2, 2, giocatore, turn);
					break;						
				}
				
				if (oldTurn == turn)
					System.out.println("Casella già occupata, scegline un'altra \n");
				else
					System.out.print(obj.toString());
				
				if (obj.checkTris(giocatore))
				{
					System.out.println("TRIS!! \nVince il giocatore " + giocatore);
					break outer;
				}
				else if (turn > 9)
				{
					System.out.println("PAREGGIO \nVince lo sport");
					break outer;
				}
			}
		}
	}
}
