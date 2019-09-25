package it.uniroma1.FabbricaSemanticaJSweet.user;

import static def.dom.Globals.document;
import static def.dom.Globals.alert;
import static def.jquery.Globals.$;

import def.dom.Event;
import def.dom.HTMLDivElement;
import def.dom.HTMLInputElement;
import it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage;
import it.uniroma1.FabbricaSemanticaJSweet.PageType;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSelectElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder;

public class Signup extends FabbricaSemanticaPage
{
	public static final String[] LANGUAGE_LEVELS = {"A1", "A2", "B1", "B2", "C1", "C2"};
	
	public static void main(String[] args) { new Signup(PageType.SIGNUP_PAGE); }
	
	public Signup(PageType pageName)
	{	
		super(pageName);
		
		$("#page").append(new HTMLDivElementBuilder("box").addClass("vertical container").build());
		$("#box").append(
				new HTMLHeadingElementBuilder().addText("Welcome!").build(),
				new HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;")
					.addText("Please register a new account :-)").build(),
				new HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./signup.jsp")
					.onSubmit(this::checkForm).build(),
					new HTMLSpanElementBuilder("bottom-text").addText("Already have an account? ").build());
		$("#form").append( //TODO tutte queste istanze simili fra loro si possono modularizzare in un metodo?
				new HTMLSpanElementBuilder().addClass("form-text").addText("Email Address*").build(),
				new HTMLInputElementBuilder().addClass("form-field").addName("email").addType("email").isRequired().build(),
				new HTMLSpanElementBuilder().addClass("form-text").addText("Password*").build(), 
				new HTMLInputElementBuilder().addClass("form-field").addName("password").addType("password").isRequired().build(),
				new HTMLSpanElementBuilder().addClass("form-text").addText("Confirm Password*").build(), 
				new HTMLInputElementBuilder().addClass("form-field").addName("confirm-password").addType("password").isRequired().build(),
				new HTMLDivElementBuilder("languages").addClass("horizontal container").build(), 
				new HTMLInputElementBuilder("signup").addType("submit").addValue("Sign up").build());
		$("#languages").append(new HTMLDivElementBuilder("languages-left").build(), new HTMLDivElementBuilder("languages-right").build());
		$("#languages-left").append(
				new HTMLSpanElementBuilder().addClass("form-text").addText("Main Language(s)*").build(),
				new HTMLDivElementBuilder("checkbox-list").addClass("vertical container").build());
		$("#checkbox-list").append(createCheckboxDiv("English"), createCheckboxDiv("Italian"));
		$("#languages-right").append(
				new HTMLSpanElementBuilder().addClass("form-text").addText("Other Languages").build(),
				new HTMLDivElementBuilder("other-languages").addClass("vertical container").build());
		$("#other-languages").append(createOtherLanguageDiv(), createOtherLanguageDiv());
		$("#bottom-text").append(new HTMLAnchorElementBuilder("change-page").addHref("./login.html").addText("Log in!").build());
	}
	
	private HTMLDivElement createCheckboxDiv(String language)
	{
		HTMLDivElement checkboxDiv = new HTMLDivElementBuilder().addClass("checkbox-text").build();
		$(checkboxDiv).append(
				new HTMLInputElementBuilder().addName("language-checkbox").addType("checkbox").addValue(language.toLowerCase()).build(),
				new HTMLSpanElementBuilder().addCss("margin-left: 5px;").addText(language).build());
		return checkboxDiv;
	}
	
	private HTMLDivElement createOtherLanguageDiv()
	{
		HTMLDivElement otherLanguageDiv = new HTMLDivElementBuilder().addClass("other-language horizontal container").build();
		HTMLSelectElementBuilder otherLanguageSelect = new HTMLSelectElementBuilder().addName("language-level").addClass("level-select");
		for (String level : LANGUAGE_LEVELS) otherLanguageSelect.addOptionElement(level);
		$(otherLanguageDiv).append(
				new HTMLInputElementBuilder().addName("other-language").addClass("language-field").build(),
				otherLanguageSelect.build());
		return otherLanguageDiv;
	}
	
	private HTMLInputElement getInputElem(String name) { return (HTMLInputElement) document.querySelector("[name='" + name + "']"); }
	
	private boolean checkForm(Event event)
	{
		if ($("input[type='checkbox']:checked").length == 0)
		{
			alert("You must choose at least 1 Main Language!");
			return false;
		}
		else if (! getInputElem("password").value.equals(getInputElem("confirm-password").value))
			alert("Passwords don't match!");
		
		return true;
	}
}
