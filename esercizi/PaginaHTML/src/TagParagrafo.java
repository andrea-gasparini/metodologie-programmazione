
public class TagParagrafo extends Tag 
{
	private final String NOME_TAG = "p";
	
	public TagParagrafo(Elemento e) { super(e); }
	
	@Override 
	public String getTagName() { return NOME_TAG; }
}