package com.tcs.certificacion.CalculadoraWindows.interactions;

import com.tcs.certificacion.CalculadoraWindows.userinterfaces.Calculadora;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Operacion implements Interaction{

	private Target target;
	private String operacion;
	
	public Operacion(Target target, String opearcion) {
		this.operacion=operacion;
		this.target=target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		switch (operacion) {
		case "suma":
			actor.attemptsTo(Click.on(Calculadora.TECLA_SUM),
							Click.on(target));
			break;
			
		case "resta":
			actor.attemptsTo(Click.on(Calculadora.TECLA_RESTAR),
							Click.on(target));
			break;

		default:
			break;
		}
		
	}
	public static Operacion adicional(Target target,String operacion) {
		return Tasks.instrumented(Operacion.class, target,operacion);
	}
}
