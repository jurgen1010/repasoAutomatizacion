package com.tcs.certificacion.sucursalvirtualpersonas.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.sucursalvirtualpersonas.userinterfaces.PaginaInicial;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new PaginaInicial()));
		
	}
	
	public static Abrir elNavegador() {
		return instrumented(Abrir.class);
	}

	
}
