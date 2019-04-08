import java.util.ArrayList;
import java.util.List;

public class Utente
{
	private String nome, cognome;
	protected List<Utente> listaAmici = new ArrayList<>();
	protected List<Utente> richieste = new ArrayList<>();
	public boolean visibilitaCompleta;
	
	public Utente(String nome, String cognome, boolean visibilitaCompleta) 
	{
		this.nome = nome; 
		this.cognome = cognome; 
		this.visibilitaCompleta = visibilitaCompleta; 
	}
	
	public String getCognome() { return cognome; }

	public void richiediAmicizia(Utente username) { username.richieste.add(this); }
	
	public void accettaAmicizia(Utente username) throws AmiciziaNonRichiestaException
	{
		int i = richieste.indexOf(username);
		if (i != -1)
		{
			listaAmici.add(richieste.get(i));
			username.listaAmici.add(richieste.get(i));
			richieste.remove(i);
		}
		else
			throw new AmiciziaNonRichiestaException();
	}
	
	public List<Utente> getRichiesteDiAmicizia() { return richieste; }
	
	public List<Utente> getAmiciDi(Utente username) throws AmiciNonVisibiliException
	{
		if (username.visibilitaCompleta == true || username.richieste.indexOf(this) != -1)
			return username.listaAmici;
		throw new AmiciNonVisibiliException();
	}
}