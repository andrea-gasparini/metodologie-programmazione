package Rettangolo;

/**
 * @author Andrea Gasparini
 *
 */
public class Rettangolo 
{
	int x, y, h, l;
	String colour = "(0, 0, 0)";
	
	/**
	 * COSTRUTTORE
	 * 
	 * @param xIn coordinata x dell'angolo in basso a sx del Rettangolo
	 * @param yIn coordinata y dell'angolo in basso a sx del Rettangolo
	 * @param hIn altezza del rettangolo	
	 * @param lIn lunghezza del rettangolo
	 */
	public Rettangolo(int xIn, int yIn, int hIn, int lIn)
	{
		x = xIn;
		y = yIn;
		h = hIn;
		l = lIn;
	}
	
	/**
	 * Trasla la posizione dell'angolo in basso a sx (e di conseguenza l'intero Rettangolo)
	 * 
	 * @param xIn nuova coordinata x
	 * @param yIn nuova coordinata y
	 */
	public void trasla(int xIn, int yIn)
	{
		x += xIn;
		y += yIn;
	}
	
	/**
	 * Imposta un colore RGB creando un oggetto colore tramite l'omonima classe
	 * ([0 - 255], [0 - 255], [0 - 255])
	 * 
	 * @param RedIn 
	 * @param GreenIn
	 * @param BlueIn
	 */
	public void setColore(int RedIn, int GreenIn, int BlueIn)
	{
		Colore colore = new Colore(RedIn, GreenIn, BlueIn);
		colour = colore.getColore();
	}
	
	/**
	 * @return una stringa del colore RGB impostato nel formato (R, G, B) dal Metodo setColore
	 */
	public String getColore()
	{
		return colour;
	}
	
	/* 
	 * Ritorna le coordinate degli angoli in alto a sx e in basso a dx del Rettangolo
	 */
	public String toString()
	{
		String coord = "(" + x + ", " + (y + h) + ") -> (" + (x + l) + ", " + y + ")";
		return coord;
	}

}
