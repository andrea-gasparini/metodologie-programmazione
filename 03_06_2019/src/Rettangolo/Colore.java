package Rettangolo;

public class Colore 
{ 
	int Red, Green, Blue;
	
	/**
	 * COSTRUTTORE
	 *
	 * @param RedIn
	 * @param GreenIn
	 * @param BlueIn
	 * 
	 * Bianco = (255, 255, 255)
	 * Nero = (0, 0, 0)
	 * 
	 */
	public Colore(int RedIn, int GreenIn, int BlueIn)
	{
		Red = RedIn;
		Green = GreenIn;
		Blue = BlueIn;
	}
	
	/**
	 * @return una stringa del colore RGB impostato nel formato (R, G, B)
	 */
	public String getColore()
	{
		return "(" + Red + ", " + Green + ", " + Blue +")"; 
	}
}
