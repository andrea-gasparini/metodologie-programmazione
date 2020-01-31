
abstract public class Tag extends Elemento
{
	private Elemento e;

	public Tag(Elemento e) { this.e = e; }

	public abstract String getTagName();

	public Elemento getElementoInterno() { return e; }

	@Override
	public String toString() 
	{
		return "<"+getTagName()+">"
				+e.toString()
				+"</"+getTagName()+">";
	} 
}