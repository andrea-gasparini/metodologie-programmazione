package it.uniroma1.FabbricaSemanticaJSweet;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder;

public class TranslationAnnotation extends FabbricaSemanticaPage
{
	public static void main(String[] args) { new TranslationAnnotation(PageType.ANNOTATION_OR_VALIDATION_PAGE);	}
	
	public TranslationAnnotation(PageType pageName) 
	{
		super(pageName);
		$("#page").append(new HTMLDivElementBuilder("box").addClass("vertical container").build());
		$("#box").append(
				new HTMLHeadingElementBuilder(3).addText("Provide a translation in your Mother Tongue").build(),
				new HTMLDivElementBuilder("first-div").addClass("bold-text").build(),
				new HTMLDivElementBuilder("second-div").build(),
				new HTMLFormElementBuilder("form").changeMethod("POST").addAction("./translationAnnotation.jsp").build());
		$("#first-div").append(new HTMLSpanElementBuilder().addText("Word:").build(), new HTMLSpanElementBuilder("word").addClass("grey-text").build());
		$("#second-div").append(new HTMLSpanElementBuilder().addClass("bold-text").addText("Definition:").build(), new HTMLSpanElementBuilder("definition").addClass("grey-text").build());
		$("#form").append(
				new HTMLInputElementBuilder().addClass("form-field").isRequired().addName("translation").build(),
				new HTMLInputElementBuilder("next").addType("submit").addValue("NEXT").addName("next").build(),
				new HTMLFormElementBuilder("second-button").changeMethod("POST").addAction("./nextTask.jsp").build());
		$("#second-button").append(new HTMLInputElementBuilder("skip").addType("submit").addValue("SKIP").addName("skip"));
		//TODO rivedere prima la parte in HTML
	}

}
