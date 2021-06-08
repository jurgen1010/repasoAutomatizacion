package com.tcs.certificacion.CalendarioSP.tasks;

import com.tcs.certificacion.CalendarioSP.userinterfaces.Calendario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarDia implements Task{

	private String dia;
	public SeleccionarDia(String dia) {
		this.dia=dia;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Calendario.DIA.of(dia)));
		
	}
	public static SeleccionarDia cumpleaños(String dia) {
		return Tasks.instrumented(SeleccionarDia.class, dia);
	}

}
