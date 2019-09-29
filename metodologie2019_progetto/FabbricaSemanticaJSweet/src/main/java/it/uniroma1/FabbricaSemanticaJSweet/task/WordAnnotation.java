package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

public class WordAnnotation extends TaskPage 
{
	public static void main(String[] args) { new WordAnnotation(); }
	
	public WordAnnotation()
	{
		super("WORD_ANNOTATION", "Try to guess the right term for the definition", new String[] {"Definition"}, "./wordAnnotation.jsp");
		createBasicTask();
		$("#form-1").append(createInputHiddenElem(contextElems[0]));
	}
}
