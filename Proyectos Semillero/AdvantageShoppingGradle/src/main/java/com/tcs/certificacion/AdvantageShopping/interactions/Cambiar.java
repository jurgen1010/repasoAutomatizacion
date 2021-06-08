package com.tcs.certificacion.AdvantageShopping.interactions;

import java.util.Set;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Cambiar implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		Set<String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
		for (String handle: handles) {
		 BrowseTheWeb.as(actor).getDriver().switchTo().window(handle);
		}
		
	}
	public static Cambiar deVentana() {
		return Tasks.instrumented(Cambiar.class);
	}
}
