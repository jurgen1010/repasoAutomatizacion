package com.tcs.certificacion.platformcalculadora.tasks;

import com.tcs.certificacion.platformcalculadora.user_interfaces.CalculadoraMobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OperacionMobile implements Task {
	
	private String numero, numero2;
	
	public OperacionMobile(String numero, String numero2) {
		this.numero = numero;
		this.numero2 = numero2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CalculadoraMobile.BTN_NUM.of(numero)),
				Click.on(CalculadoraMobile.BTN_OPERADOR),
				Click.on(CalculadoraMobile.BTN_NUM2.of(numero2)),
				Click.on(CalculadoraMobile.BTN_IGUAL));
	}
	
	public static OperacionMobile operacion(String numero, String numero2) {
		return Tasks.instrumented(OperacionMobile.class, numero, numero2);
	}
}
