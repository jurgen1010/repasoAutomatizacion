package com.tcs.certificacion.electricprism.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CambiarFrame implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		BrowseTheWeb.as(actor).getDriver().switchTo().frame("demo");
		
	}
	public static CambiarFrame switchFrame() {
		return Tasks.instrumented(CambiarFrame.class);
	}

}
