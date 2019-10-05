package it.uniroma1.fabbricasemantica.data;

/**
 * L'interfaccia Task rappresenta i Task presenti in FabbricaSemantica.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public interface Task
{
	/**
	 * Ritorna la rappresentazione in stringa dell'ID del Task
	 * 
	 * @return la stringa rappresentante il Task
	 */
	default String getTaskID() { return toString(); }	
}
