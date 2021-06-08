package com.tcs.certificacion.CalculadoraWindows.tasks;

import com.tcs.certificacion.CalculadoraWindows.interactions.Operacion;
import com.tcs.certificacion.CalculadoraWindows.userinterfaces.Calculadora;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Sumar implements Task{

	
	private static String numero1,numero2,numero3="";
	private static String operacion;
	
	public Sumar (String numero1) {
		this.numero1=numero1;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Calculadora.TECLA_NUMERO.of(numero1)),
								Click.on(Calculadora.TECLA_SUM),
								Click.on(Calculadora.TECLA_NUMERO.of(numero2))																							
						);
		if (!numero3.equals(" ")) {
			Operacion.adicional(Calculadora.TECLA_NUMERO.of(numero3), operacion);
		}
		actor.attemptsTo(Click.on(Calculadora.TECLA_IGUAL));
	}
	public static Sumar conNumero1(String numero1) {
		return Tasks.instrumented(Sumar.class, numero1);
	}
	public Sumar conNumero2(String numero2) {
		this.numero2=numero2;
		return this;
	}
}
