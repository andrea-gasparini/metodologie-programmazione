import java.util.ArrayList;
import java.util.List;

public class ReteSociale
{
	private List<Utente> listaUtenti = new ArrayList<>();
	
	public void aggiungiUtente(Utente username) { listaUtenti.add(username); }
	
	public List<Utente> getUtentiPerCognome(String cognome) 
	{
		List<Utente> listaUtentiPerCognome = new ArrayList<>();
		
		for (Utente username : listaUtenti)
			if (username.getCognome().equals(cognome))
				listaUtentiPerCognome.add(username);
				
		return listaUtentiPerCognome;
	}
	
	public static void main(String[] args) throws Exception
	{
		ReteSociale rs = new ReteSociale();
		System.out.println(rs.getUtentiPerCognome("Gasparini"));
		Utente a = new SuperUtente("Andrea", "Gasparini", true);
		Utente b = new Utente("Giovanni", "Gasparini", false);
		b.richiediAmicizia(a);
		System.out.println(a.getRichiesteDiAmicizia());
		a.accettaAmicizia(b);
		System.out.println(a.getAmiciDi(b));
		rs.aggiungiUtente(a);
		System.out.println(rs.getUtentiPerCognome("Gasparini"));
	}
}