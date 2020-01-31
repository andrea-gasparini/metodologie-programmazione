package it.uniroma1.fabbricasemantica.data;

/**
 * La classe StandardTask rappresenta i Task di base presenti in FabbricaSemantica.
 * 
 * @author Andrea Gasparini (1813486)
 *
 */
public enum StandardTask implements Task 
{
	TRANSLATION_ANNOTATION,
	WORD_ANNOTATION,
	DEFINITION_ANNOTATION,
	SENSE_ANNOTATION,
	TRANSLATION_VALIDATION,
	SENSE_VALIDATION,
	MY_ANNOTATION;
}
