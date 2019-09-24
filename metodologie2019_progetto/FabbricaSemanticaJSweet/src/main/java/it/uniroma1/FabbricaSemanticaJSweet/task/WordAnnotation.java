package it.uniroma1.FabbricaSemanticaJSweet.task;

public class WordAnnotation extends TaskPage 
{
	public static void main(String[] args) { new WordAnnotation(); }
	
	public WordAnnotation()
	{
		super("WORD_ANNOTATION", "Try to guess the right term for the definition", new String[] {"Definition"}, "./wordAnnotation.jsp");
		createBasicTask();
	}
}
