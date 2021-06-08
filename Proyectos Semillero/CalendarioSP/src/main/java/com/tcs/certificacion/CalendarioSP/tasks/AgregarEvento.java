package com.tcs.certificacion.CalendarioSP.tasks;

import com.tcs.certificacion.CalendarioSP.userinterfaces.Calendario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarEvento implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Calendario.BOTON_ADD));
		
	}
	public static AgregarEvento cumpleaños() {
		return Tasks.instrumented(AgregarEvento.class);
	}

}
