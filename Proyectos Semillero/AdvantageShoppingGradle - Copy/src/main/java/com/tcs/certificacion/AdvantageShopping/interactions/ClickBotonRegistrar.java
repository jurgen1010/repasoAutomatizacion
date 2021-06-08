package com.tcs.certificacion.AdvantageShopping.interactions;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class ClickBotonRegistrar implements Interaction{

	private Target target;
	public ClickBotonRegistrar(Target target) {
		this.target=target;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElementFacade elemento = target.resolveFor(actor);
		if (elemento.isCurrentlyEnabled()) {
			elemento.click();
		}
		
	}
	public static ClickBotonRegistrar enEstadoHabilitado(Target target) {
		return Tasks.instrumented(ClickBotonRegistrar.class, target);
	}
}
