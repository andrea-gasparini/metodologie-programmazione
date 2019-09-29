package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

public class TranslationAnnotation extends TaskPage
{
	public static void main(String[] args) { new TranslationAnnotation(); }
	
	public TranslationAnnotation() 
	{
		super("TRANSLATION_ANNOTATION", "Provide a translation in your Mother Tongue",	new String[] {"Word", "Definition"}, "./translationAnnotation.jsp");
		createBasicTask();
		$("#form-1").append(
				createInputHiddenElem(contextElems[0]),
				createInputHiddenElem(contextElems[1]));
	}
}
