package com.tcs.certificacion.platformcalculadora.tasks;

import com.tcs.certificacion.platformcalculadora.user_interfaces.CalculadoraWeb;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OperacionWeb implements Task {

	private String numero, operador,numero2;
	
	public OperacionWeb(String numero, String numero2) {
		this.numero = numero;
		//this.operador = operador;
		this.numero2 = numero2;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CalculadoraWeb.BTN_NUM.of(numero)),
				Click.on(CalculadoraWeb.BTN_OPERADOR),
				Click.on(CalculadoraWeb.BTN_NUM2.of(numero2)),
				Click.on(CalculadoraWeb.BTN_IGUAL));
	}

	public static OperacionWeb operacion(String numero, String numero2) {
		return Tasks.instrumented(OperacionWeb.class, numero, numero2);
	}
}
