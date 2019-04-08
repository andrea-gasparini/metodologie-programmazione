
public class TagHTML extends Tag 
{
	private final String NOME_TAG = "html";

	public TagHTML(Elemento e) { super(e); }
	
	@Override
	public String getTagName() { return NOME_TAG; }
}