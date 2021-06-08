package com.bancolombia.certificacion.banistmo.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Set;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Cambiar implements Interaction{

	
	@Override
	public <T extends Actor> void performAs(T actor) {
//		Set<String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
//		for (String handle: handles) {
//		 BrowseTheWeb.as(actor).getDriver().switchTo().window(handle);
//		 
//		}
		Set<String> setVentanas= Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
		setVentanas.remove(Serenity.getWebdriverManager().getCurrentDriver().getWindowHandle());
		Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(setVentanas.iterator().next());
		
	}
	public static  Cambiar deVentana() {
		return instrumented(Cambiar.class);
	}
	

}
