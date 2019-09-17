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
		$("#page").append(new HTMLDivElementBuilder("box").addClass("vertical container").build());
		$("#box").append(
				new HTMLHeadingElementBuilder().addText("Welcome Back!").build(),
				new HTMLSpanElementBuilder().addCss("color: grey; margin-top: 5px;").addText("Please log in :-)").build(),
				new HTMLFormElementBuilder("form").addClass("vertical container").changeMethod("POST").addAction("./login.jsp").build(),
				new HTMLSpanElementBuilder("bottom-text").addText("Don't have an account? ").build());
		$("#form").append(
				new HTMLSpanElementBuilder().addClass("form-text").addText("Email Address").build(),
				new HTMLInputElementBuilder().addClass("form-field").addName("email").addType("email").isRequired().build(),
				new HTMLSpanElementBuilder().addClass("form-text").addText("Password").build(),
				new HTMLInputElementBuilder().addClass("form-field").addName("password").addType("password").isRequired().build(),
				new HTMLInputElementBuilder("login").addType("submit").addValue("Log in").build());
		$("#bottom-text").append(new HTMLAnchorElementBuilder("change-page").addHref("./signup.html").addText("Sign up!").build());
	}

}
