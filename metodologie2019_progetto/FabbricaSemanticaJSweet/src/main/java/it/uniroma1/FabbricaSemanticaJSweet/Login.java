package it.uniroma1.FabbricaSemanticaJSweet;

import static def.jquery.Globals.$;

import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder;
import it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder;

public class Login extends FabbricaSemanticaPage
{
	public static void main(String[] args) { new Login(PageType.LOGIN_PAGE); }
	
	public Login(PageType pageName)
	{
		super(pageName);
		$("#page").append(new HTMLDivElementBuilder("box").addClass("vertical container").toHTMLElement());
		$("#box").append(
				new HTMLHeadingElementBuilder().addText("Welcome Back!").toHTMLElement(),
				new HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please log in to play :-)").toHTMLElement(),
				new HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./login.jsp").toHTMLElement(),
				new HTMLSpanElementBuilder("bottom-text").addText("Don't have an account? ").toHTMLElement());
		$("#form").append(
				new HTMLSpanElementBuilder().addClass("form-text").addText("Email Address").toHTMLElement(),
				new HTMLInputElementBuilder().addClass("form-field").addName("email").addType("email").isRequired().toHTMLElement(),
				new HTMLSpanElementBuilder().addClass("form-text").addText("Password").toHTMLElement(),
				new HTMLInputElementBuilder().addClass("form-field").addName("password").addType("password").isRequired().toHTMLElement(),
				new HTMLInputElementBuilder("login").addType("submit").addValue("Log in").toHTMLElement());
		$("#bottom-text").append(new HTMLAnchorElementBuilder("change-page").addHref("./signup.html").addText("Sign up!").toHTMLElement());
	}

}
