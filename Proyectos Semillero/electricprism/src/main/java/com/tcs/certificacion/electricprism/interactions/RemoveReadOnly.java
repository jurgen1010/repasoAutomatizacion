package com.tcs.certificacion.electricprism.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class RemoveReadOnly implements Interaction{

	private Target campoFecha;
	private String fecha;
	public RemoveReadOnly(Target campoFecha) {
		this.campoFecha=campoFecha;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElementFacade element = campoFecha.resolveFor(actor);
		BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].removeAttribute('readonly','readonly')",element);
		actor.attemptsTo(Enter.theValue(fecha).into(element));
		
	}
	public static  RemoveReadOnly enTarget(Target campoFecha) {
		return Tasks.instrumented(RemoveReadOnly.class, campoFecha);
	}
	public RemoveReadOnly conFecha(String fecha) {
		this.fecha=fecha;
		return this;
	}
	

}
