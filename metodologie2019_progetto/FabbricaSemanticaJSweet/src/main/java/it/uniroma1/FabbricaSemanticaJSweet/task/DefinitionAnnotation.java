package it.uniroma1.FabbricaSemanticaJSweet.task;

import static def.jquery.Globals.$;

public class DefinitionAnnotation extends TaskPage 
{
	public static void main(String[] args) { new DefinitionAnnotation(); }
	
	public DefinitionAnnotation()
	{
		super("DEFINITION_ANNOTATION", "Provide a definition in your Mother Tongue of this word and his hypernym", new String[] {"Word", "Hypernym"}, "./definitionAnnotation.jsp");
		createBasicTask();
		$("#form-1").append(
				createInputHiddenElem(0),
				createInputHiddenElem(1));
	}
}
