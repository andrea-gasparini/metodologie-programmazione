import java.util.List;
import java.util.ArrayList;

public class SequenzaDiElementi extends Elemento
{
	List<Elemento> listEl = new ArrayList<>();
	
	public SequenzaDiElementi(Elemento... elementi) { for (Elemento k : elementi) listEl.add(k); }
	
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		for (Elemento k : listEl)
			sb.append(k.toString());
			
		return sb.toString();
	}
}