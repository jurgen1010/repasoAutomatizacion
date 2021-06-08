package com.tcs.certificacion.platformcalculadora.tasks;

import com.tcs.certificacion.platformcalculadora.user_interfaces.CalculadoraWindows;

import static com.tcs.certificacion.calculadora.methods.CalculadoraMethods.*;

import com.tcs.certificacion.calculadora.methods.CalculadoraMethods;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OperacionWindows implements Task{
	
	private String numero, numero2;
	private CalculadoraMethods c;
	
	public OperacionWindows(String numero, String numero2) {
		 c = new CalculadoraMethods(numero, numero2);
		c.convertir();
		this.numero = c.getNumero();
		this.numero2 = c.getNumero2();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CalculadoraWindows.BTN_NUMERO.of(numero)),
				Click.on(CalculadoraWindows.BTN_OPERADOR),
				Click.on(CalculadoraWindows.BTN_NUMERO2.of(numero2)),
				Click.on(CalculadoraWindows.BTN_IGUAL));
	}
	
	public static OperacionWindows operacion(String numero, String numero2) {
		return Tasks.instrumented(OperacionWindows.class, numero, numero2);
	}

}
