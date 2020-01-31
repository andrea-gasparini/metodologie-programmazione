package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

/**
 * La classe TranslationAnnotation rappresenta la pagina del Task in cui data
 * una parola e una sua definizione in inglese, l’utente deve fornire una
 * traduzione nella sua lingua madre.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class TranslationAnnotation extends TaskPage
{
	/**
	 * Crea la pagina TranslationAnnotation
	 */
	public static void main(String[] args) { new TranslationAnnotation(); }
	
	/**
	 * Costruisce la pagina SenseAnnotation con gli elementi di contesto Word e
	 * Definition. Viene chiamato il metodo per creare i Task di base. Al form
	 * vengono aggiunti gli elementi nascosti per registrare nella base di dati
	 * anche il contesto del task oltre che la risposta.
	 */
	public TranslationAnnotation() 
	{
		super("TRANSLATION_ANNOTATION", "Provide a translation in your Mother Tongue",	new String[] {"Word", "Definition"}, "./translationAnnotation.jsp");
		createBasicTask();
		$("#form-1").append(
				createInputHiddenElem(contextElems[0]),
				createInputHiddenElem(contextElems[1]));
	}
}
