package com.tcs.certificacion.CalculadoraWindows.tasks;

import com.tcs.certificacion.CalculadoraWindows.userinterfaces.Calculadora;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Restar implements Task{
	private static String numero1,numero2;
	
	public Restar (String numero1) {
		this.numero1=numero1;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Calculadora.TECLA_NUMERO.of(numero1)),
				Click.on(Calculadora.TECLA_RESTAR),
				Click.on(Calculadora.TECLA_NUMERO.of(numero2)),
				Click.on(Calculadora.TECLA_IGUAL)
		);
		
	}
	public static Restar conNumero1(String numero1) {
		return Tasks.instrumented(Restar.class, numero1);
	}
	public Restar conNumero2(String numero2) {
		this.numero2=numero2;
		return this;
	}
	
}
