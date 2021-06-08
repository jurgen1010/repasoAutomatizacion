package com.tcs.certificacion.simularcredito.tasks;

import com.tcs.certificacion.simularcredito.userinterfaces.ResultadoBusqueda;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrASimulador implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ResultadoBusqueda.LINK_SIMULADOR_CREDITO));
		
	}
	public static IrASimulador conElLink() {
		return Tasks.instrumented(IrASimulador.class);
	}

}
