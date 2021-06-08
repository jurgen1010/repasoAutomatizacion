package com.tcs.certificacion.calculadora.tasks;

import com.tcs.certificacion.calculadora.user_interfaces.CalculadoraHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Operaciones implements Task {
	
	private String numero,operador,numero2;
	
	public Operaciones(String numero,String operador, String numero2) {
		this.numero = numero;
		this.operador = operador;
		this.numero2 = numero2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CalculadoraHomePage.BTN_NUMERO.of(numero)),
				Click.on(CalculadoraHomePage.BTN_MAS.of(operador)),
				Click.on(CalculadoraHomePage.BTN_NUMERO2.of(numero2)));
	}
	
	public static Operaciones aritmeticas(String numero, String operador, String numero2) {
		return Tasks.instrumented(Operaciones.class,numero, operador, numero2);
	}
}
