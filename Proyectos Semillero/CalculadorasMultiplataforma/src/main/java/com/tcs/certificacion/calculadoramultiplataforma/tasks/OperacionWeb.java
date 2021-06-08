package com.tcs.certificacion.calculadoramultiplataforma.tasks;

import com.tcs.certificacion.calculadoramultiplataforma.userinterfaces.CalculadoraWeb;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OperacionWeb implements Task{

	private String numeroA,numeroB;
	public OperacionWeb(String numeroA) {
		this.numeroA=numeroA;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CalculadoraWeb.TECLA_NUMERO.of(numeroA)),
						 Click.on(CalculadoraWeb.TECLA_SUMAR),
						 Click.on(CalculadoraWeb.TECLA_NUMERO.of(numeroB)),
						 Click.on(CalculadoraWeb.TECLA_IGUAL));
		
	}
	public static OperacionWeb conNumeroA(String numeroA) {
		return Tasks.instrumented(OperacionWeb.class, numeroA);
	}
	public OperacionWeb conNumeroB(String numeroB) {
		this.numeroB=numeroB;
		return this;
	}
}
