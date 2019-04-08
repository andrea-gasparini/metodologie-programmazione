
public class PaginaHTML
{
	private TagHTML tagHTML;

	public PaginaHTML(TagHTML tagHTML) { this.tagHTML = tagHTML; }
	
	@Override
	public String toString() { return tagHTML.toString(); }
	
	public static void main(String[] args)
	{
		PaginaHTML p = new PaginaHTML(
			new TagHTML(
				new TagParagrafo(
					new SequenzaDiElementi(
						new TagGrassetto(new ElementoTesto("bella")), new ElementoTesto(" pe tutti")
					)
				)
			)
		);
		System.out.println(p);
	}
}