package it.uniroma1.FabbricaSemanticaJSweet.task;

public class DefinitionAnnotation extends TaskPage 
{
	public static void main(String[] args) { new DefinitionAnnotation(); }
	
	public DefinitionAnnotation()
	{
		super("DEFINITION_ANNOTATION", "Provide a definition in your Mother Tongue of this word and his hypernym", new String[] {"Word", "Hypernym"}, "./definitionAnnotation.jsp");
		createBasicTask();
	}
}
