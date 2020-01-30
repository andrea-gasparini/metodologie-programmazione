
public class TagGrassetto extends Tag
{
	private final String NOME_TAG = "b";
	
	public TagGrassetto(Elemento e) { super(e); }
	
	@Override 
	public String getTagName() { return NOME_TAG; }
}