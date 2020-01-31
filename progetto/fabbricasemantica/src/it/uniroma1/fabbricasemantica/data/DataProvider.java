package it.uniroma1.fabbricasemantica.data;

/**
 * L'interfaccia DataProvider rappresenta il metodo usato per ottenere i dati
 * necessari ai vari task per funzionare. Il tipo di ritorno <T> e' generico in
 * quanto a seconda del target della nostra applicazione possiamo restituire
 * formati diversi (e.g. una applicazione Client-Server o una applicazione Java
 * GUI potranno gestire i dati in maniera diversa).
 * 
 */
public interface DataProvider<T> 
{
	/**
	 * Restituisce un oggetto di tipo <T> per il Task passato in input.
	 */
	T getData(Task task);
}