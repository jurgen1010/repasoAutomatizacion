package com.tcs.certificacion.calculadoramultiplataforma.tasks;

import com.tcs.certificacion.calculadoramultiplataforma.userinterfaces.CalculadoraAndroid;
import com.tcs.certificacion.calculadoramultiplataforma.userinterfaces.CalculadoraEscritorio;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OperacionEscritorio implements Task{

	private String numeroA,numeroB;
	public OperacionEscritorio(String numeroA) {
		this.numeroA=numeroA;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(CalculadoraEscritorio.TECLA_NUMERO.of(numeroA)),
			     Click.on(CalculadoraEscritorio.TECLA_SUM),
			     Click.on(CalculadoraEscritorio.TECLA_NUMERO.of(numeroB)),
			     Click.on(CalculadoraEscritorio.TECLA_IGUAL));

		
	}
	public static OperacionEscritorio conNumeroA(String numeroA) {
		return Tasks.instrumented(OperacionEscritorio.class, numeroA);
	}
	public OperacionEscritorio conNumeroB(String numeroB) {
		this.numeroB=numeroB;
		return this;
	}
	
}
