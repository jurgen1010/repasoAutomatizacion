package com.tcs.certificacion.CalculadoraWindows.tasks;

import com.tcs.certificacion.CalculadoraWindows.userinterfaces.Calculadora;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Multiplicar implements Task{

	private String numero1,numero2;
	public Multiplicar(String numero1) {
		this.numero1=numero1;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(Calculadora.TECLA_NUMERO.of(numero1)),
							Click.on(Calculadora.TECLA_MULTIPLICAR),
							Click.on(Calculadora.TECLA_NUMERO.of(numero2)),
							Click.on(Calculadora.TECLA_IGUAL));
		
	}
	public static Multiplicar conNumero1(String numero1) {
		return Tasks.instrumented(Multiplicar.class, numero1);
	}
	public Multiplicar conNumero2(String numero2) {
		this.numero2=numero2;
		return this;
	}
}
