package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

/**
 * La classe WordAnnotation rappresenta la pagina del Task in cui data una
 * definizione in inglese, l’utente deve provare a indovinare la parola
 * definita.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class WordAnnotation extends TaskPage 
{
	/**
	 * Crea la pagina WordAnnotation
	 */
	public static void main(String[] args) { new WordAnnotation(); }
	
	/**
	 * Costruisce la pagina WordAnnotation con l'elemento di contesto Definition.
	 * Viene chiamato il metodo per creare i Task di base. Al form viene aggiunto
	 * l'elemento nascosto per registrare nella base di dati anche il contesto del
	 * task oltre che la risposta.
	 */
	public WordAnnotation()
	{
		super("WORD_ANNOTATION", "Try to guess the right term for the definition", new String[] {"Definition"}, "./wordAnnotation.jsp");
		createBasicTask();
		$("#form-1").append(createInputHiddenElem(contextElems[0]));
	}
}
