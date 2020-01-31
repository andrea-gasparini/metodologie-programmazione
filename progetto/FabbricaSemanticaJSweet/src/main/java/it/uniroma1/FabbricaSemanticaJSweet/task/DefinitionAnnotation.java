package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

/**
 * La classe DefinitionAnnotation rappresenta la pagina del Task in cui data una
 * parola e un suo iperonimo (ovvero, una sua generalizzazione, ad es. veicolo
 * come iperonimo di macchina), l'utente deve fornire una definizione nella sua
 * lingua.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public class DefinitionAnnotation extends TaskPage 
{
	/**
	 * Crea la pagina DefinitionAnnotation 
	 */
	public static void main(String[] args) { new DefinitionAnnotation(); }
	
	/**
	 * Costruisce la pagina DefinitionAnnotation con gli elementi di contesto Word e
	 * Hypernym. Viene chiamato il metodo per creare i Task di base. Al form vengono
	 * aggiunti gli elementi nascosti per registrare nella base di dati anche il
	 * contesto del task oltre che la risposta.
	 */
	public DefinitionAnnotation()
	{
		super("DEFINITION_ANNOTATION", "Provide a definition in your Mother Tongue of this word and his hypernym", new String[] {"Word", "Hypernym"}, "./definitionAnnotation.jsp");
		createBasicTask();
		$("#form-1").append(
				createInputHiddenElem(contextElems[0]),
				createInputHiddenElem(contextElems[1]));
	}
}
