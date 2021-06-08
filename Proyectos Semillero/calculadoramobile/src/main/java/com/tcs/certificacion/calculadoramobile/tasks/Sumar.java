package com.tcs.certificacion.calculadoramobile.tasks;

import com.tcs.certificacion.calculadoramobile.userinterfaces.Calculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Sumar implements Task{

	private String numeroA, numeroB;
	
	public Sumar(String numeroA) {
		this.numeroA = numeroA;		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Calculadora.TECLA_NUMERO.of(numeroA)),
						Click.on(Calculadora.TECLA_SUM),
						Click.on(Calculadora.TECLA_NUMERO.of(numeroB)),
						Click.on(Calculadora.TECLA_IGUAL));		
	}
	public static Sumar conNumeroA(String numeroA) {
		return Tasks.instrumented(Sumar.class, numeroA);
	}
	public Sumar conNumeroB(String numeroB) {
		this.numeroB=numeroB;
		return this;
	}

}
