package Forme;

/**
 * @author Andrea Gasparini
 *
 */
public class Cerchio 
{
	double raggio;
	double circonferenza;
	double area;
	double pi = Math.PI;
	
	public Cerchio (double raggioIn)
	{
		raggio = raggioIn;
	}
	
	public double getCirconferenza ()
	{
		circonferenza = 2 * raggio * pi;
		return circonferenza;
	}
	
	public double getArea ()
	{
		area = Math.pow(raggio, 2) * pi;
		return area;
	}
	
	public static void main(String[] args)
	{
		Cerchio cerchio1 = new Cerchio(1);
		Cerchio cerchio2 = new Cerchio(5);
		
		System.out.println(cerchio1.getCirconferenza());
		System.out.println(cerchio2.getArea());
	}

}
