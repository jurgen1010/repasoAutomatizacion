package com.tcs.certificacion.AdvantageShopping.interactions;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Tabular implements Interaction{

	private Target target;
	public Tabular (Target target) {
		this.target=target;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElementFacade elemento = target.resolveFor(actor);
		elemento.sendKeys(Keys.TAB);
		
	}
	public static Tabular enCampo(Target target) {
		return Tasks.instrumented(Tabular.class, target);
	}

}
