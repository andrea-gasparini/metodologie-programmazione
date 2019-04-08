
public class UtenteFastidioso extends Utente 
{
	public UtenteFastidioso(String nome, String cognome, boolean visibilitaCompleta) { super(nome, cognome, visibilitaCompleta); }
	
	@Override
	public void richiediAmicizia(Utente username) { for (int i = 0; i < 3; i++) super.richiediAmicizia(username); }
}