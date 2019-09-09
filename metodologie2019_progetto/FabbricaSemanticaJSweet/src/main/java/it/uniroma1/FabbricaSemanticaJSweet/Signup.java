package it.uniroma1.FabbricaSemanticaJSweet;

import static def.dom.Globals.document;
import static def.dom.Globals.alert;
import static def.jquery.Globals.$;

import def.dom.Event;
import def.dom.HTMLDivElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLSpanElement;
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
		// da "riassumere" in un metodo? dipende dal back-end
		HTMLDivElement firstCheckboxDiv = new HTMLDivElementBuilder().addClass("checkbox-text").toHTMLElement();
		HTMLInputElement firstCheckbox = new HTMLInputElementBuilder().addName("first-checkbox").addType("checkbox").toHTMLElement();
		HTMLSpanElement firstCheckboxSpan = new HTMLSpanElementBuilder().addCss("margin-left: 5px;").addText("English").toHTMLElement();
		HTMLDivElement secondCheckboxDiv = new HTMLDivElementBuilder().addClass("checkbox-text").toHTMLElement();
		HTMLInputElement secondCheckbox = new HTMLInputElementBuilder().addName("second-checkbox").addType("checkbox").toHTMLElement();
		HTMLSpanElement secondCheckboxSpan = new HTMLSpanElementBuilder().addCss("margin-left: 5px;").addText("Italian").toHTMLElement();
		
		$("#page").append(new HTMLDivElementBuilder("box").addClass("vertical container").toHTMLElement());
		$("#box").append(
				new HTMLHeadingElementBuilder().addText("Welcome!").toHTMLElement(),
				new HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;")
					.addText("Please register a new account to be able to play :-)").toHTMLElement(),
				new HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./signup.jsp")
					.onSubmit(this::checkForm).toHTMLElement(),
					new HTMLSpanElementBuilder("bottom-text").addText("Already have an account? ").toHTMLElement());
		$("#form").append(
				new HTMLSpanElementBuilder().addClass("form-text").addText("Email Address*").toHTMLElement(),
				new HTMLInputElementBuilder().addClass("form-field").addName("email").addType("email").isRequired().toHTMLElement(),
				new HTMLSpanElementBuilder().addClass("form-text").addText("Password*").toHTMLElement(), 
				new HTMLInputElementBuilder().addClass("form-field").addName("password").addType("password").isRequired().toHTMLElement(),
				new HTMLSpanElementBuilder().addClass("form-text").addText("Confirm Password*").toHTMLElement(), 
				new HTMLInputElementBuilder().addClass("form-field").addName("confirm-password").addType("password").isRequired().toHTMLElement(),
				new HTMLDivElementBuilder("languages").addClass("horizontal container").toHTMLElement(), 
				new HTMLInputElementBuilder("signup").addType("submit").addValue("Sign up").toHTMLElement());
		$("#languages").append(new HTMLDivElementBuilder("languages-left").toHTMLElement(), new HTMLDivElementBuilder("languages-right").toHTMLElement());
		$("#languages-left").append(
				new HTMLSpanElementBuilder().addClass("form-text").addText("Main Language(s)*").toHTMLElement(),
				new HTMLDivElementBuilder("checkbox-list").addClass("vertical container").toHTMLElement());
		$("#checkbox-list").append(firstCheckboxDiv, secondCheckboxDiv);
		$(firstCheckboxDiv).append(
				firstCheckbox,
				firstCheckboxSpan);
		$(secondCheckboxDiv).append(
				secondCheckbox,
				secondCheckboxSpan);
		$("#languages-right").append(
				new HTMLSpanElementBuilder().addClass("form-text").addText("Other Languages").toHTMLElement(),
				new HTMLDivElementBuilder("other-languages").addClass("vertical container").toHTMLElement());
		$("#other-languages").append(createOtherLanguageDiv(), createOtherLanguageDiv());
		$("#bottom-text").append(new HTMLAnchorElementBuilder("change-page").addHref("./login.html").addText("Log in!").toHTMLElement());
	}
	
	private HTMLDivElement createOtherLanguageDiv()
	{
		HTMLDivElement otherLanguageDiv = new HTMLDivElementBuilder().addClass("other-language horizontal container").toHTMLElement();
		HTMLSelectElementBuilder otherLanguageSelect = new HTMLSelectElementBuilder().addClass("level-select");
		for (String level : LANGUAGE_LEVELS) otherLanguageSelect.addOptionElement(level);
		$(otherLanguageDiv).append(
				new HTMLInputElementBuilder().addClass("language-field").toHTMLElement(), // questo input non ha Name, è un problema nel back?
				otherLanguageSelect.toHTMLElement());
		return otherLanguageDiv;
	}
	
	private HTMLInputElement getInputElem(String name) { return (HTMLInputElement) document.querySelector("[name='" + name + "']"); }
	
	private boolean checkForm(Event event)
	{
		if (! getInputElem("password").value.equals(getInputElem("confirm-password").value))
		{
			alert("Passwords don't match!");
			return false;
		}
		else if ($("input[type='checkbox']:checked").length == 0)
		{
			alert("You must choose at least 1 Main Language!");
			return false;
		}
		return true;
	}
}
