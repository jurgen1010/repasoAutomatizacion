package com.tcs.certificacion.calculadoramultiplataforma.tasks;

import com.tcs.certificacion.calculadoramultiplataforma.userinterfaces.CalculadoraAndroid;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OperacionAndroid implements Task{

	private String numeroA,numeroB;
	public OperacionAndroid(String numeroA) {
		this.numeroA=numeroA;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CalculadoraAndroid.TECLA_NUMERO.of(numeroA)),
					     Click.on(CalculadoraAndroid.TECLA_SUM),
					     Click.on(CalculadoraAndroid.TECLA_NUMERO.of(numeroB)),
					     Click.on(CalculadoraAndroid.TECLA_IGUAL));
		
	}
	public static OperacionAndroid conNumeroA(String numeroA) {
		return Tasks.instrumented(OperacionAndroid.class, numeroA);
	}
	public OperacionAndroid conNumeroB(String numeroB) {
		this.numeroB=numeroB;
		return this;
	}
}
