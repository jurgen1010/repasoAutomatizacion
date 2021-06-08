package com.tcs.certificacion.calculadora.tasks;

import com.tcs.certificacion.calculadora.user_interfaces.CalculadoraPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Suma implements Task{
	private String numero,operador,numero2;
	public Suma(String numero, String operador, String numero2) {
		this.numero = numero;
		this.operador = operador;
		this.numero2 = numero2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CalculadoraPage.TXT_NUMERO_ONE.of(numero)),
				Click.on(CalculadoraPage.TXT_OPERADOR_SUMA.of(operador)),
				Click.on(CalculadoraPage.TXT_NUMERO_TWO.of(numero2)),
				Click.on(CalculadoraPage.BTN_RESULTADO));
	}
	
	public static Suma numeros(String numero, String operador, String numero2) {
		return Tasks.instrumented(Suma.class,numero,operador,numero2);
	}
}
