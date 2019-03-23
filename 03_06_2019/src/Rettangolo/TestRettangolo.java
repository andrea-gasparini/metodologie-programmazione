package Rettangolo;

/**
 * @author Andrea Gasparini
 *
 */
public class TestRettangolo 
{
	/**
	 * MAIN
	 */
	public static void main(String[] args)
	{
		Rettangolo rettangolo = new Rettangolo(0, 0, 10, 20);
		rettangolo.trasla(10, -5);
		// rettangolo.getColore(255, 255, 255);
		System.out.println("Colore (R, G, B) del Rettangolo: " + rettangolo.getColore());
		System.out.println("Coordinate (x, y) degli angoli in alto a sx "
				+ "e in basso a dx del Rettangolo: \n" + rettangolo.toString());
	}

}
