package com.tcs.certificacion.AdvantageShopping.questions;

import org.openqa.selenium.WebElement;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.pages.WebElementFacade;

public class Ver implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		WebElementFacade elemento = (WebElementFacade) RegistroUsuario.BOTON_REGISTRAR.resolveFor(actor);
		//return elemento.getAttribute("class");
		
		if (elemento.isEnabled()) {
			return "true";
		}
		else
			return "false";
		
		
	}
	public static Ver elEstadoDelBtnRegistrar() {
		
		return new Ver();
				
	}
	
}
