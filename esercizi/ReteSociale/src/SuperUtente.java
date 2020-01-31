import java.util.ArrayList;
import java.util.List;

public class SuperUtente extends Utente
{
	public SuperUtente(String nome, String cognome, boolean visibilitaCompleta) { super(nome, cognome, visibilitaCompleta); }
	
	@Override
	public List<Utente> getAmiciDi(Utente username) { return username.listaAmici; }
}