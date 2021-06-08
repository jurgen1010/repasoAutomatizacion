package com.tcs.certificacion.buscargooglesp.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.tcs.certificacion.buscargooglesp.userinterface.BuscarGoogle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

public class BuscarEnGoogle implements Task {

	private String expresion;

	public BuscarEnGoogle(String expresion) {
		this.expresion = expresion;
	}

	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(expresion).into(BuscarGoogle.BUSQUEDA_GOOGLE), 
				Click.on(BuscarGoogle.BUSCAR.of("Buscar con Google"))
				);
		//Hit.the(Keys.ENTER);
	}

	public static BuscarEnGoogle laExpresion(String expresion) {
		return instrumented(BuscarEnGoogle.class, expresion);
	}

}
