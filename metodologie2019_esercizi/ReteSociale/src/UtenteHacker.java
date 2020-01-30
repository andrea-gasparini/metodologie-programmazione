import java.util.ArrayList;
import java.util.List;

public class UtenteHacker extends Utente 
{
	public UtenteHacker(String nome, String cognome, boolean visibilitaCompleta) { super(nome, cognome, visibilitaCompleta); }
	
	public void hackera(Utente username) { username.listaAmici.clear(); }
}