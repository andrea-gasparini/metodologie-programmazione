
public class ElementoTesto extends Elemento 
{
	private String testo;
	
	public ElementoTesto(String testo) { this.testo = testo; }
	
	@Override
	public String toString() { return testo; }
}