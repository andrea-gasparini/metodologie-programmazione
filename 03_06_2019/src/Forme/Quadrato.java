package Forme;

/**
 * @author Andrea Gasparini
 * 
 */
public class Quadrato 
{
	double lato;
	double perimetro;
	double area;
	
	public Quadrato (double latoIn)
	{
		lato = latoIn;
	}
	
double getPerimetro ()
	{
		perimetro = lato*4;
		return perimetro;
	}
	
	public double getArea ()
	{
		area = lato*lato;
		return area;
	}

	public static void main(String[] args)
	{
		Quadrato quadrato = new Quadrato(5.5);
		System.out.println("L'area del quadrato è: " + quadrato.getArea());
		System.out.println("Il perimetro del quadrato è: " + quadrato.getPerimetro());
	}
}
