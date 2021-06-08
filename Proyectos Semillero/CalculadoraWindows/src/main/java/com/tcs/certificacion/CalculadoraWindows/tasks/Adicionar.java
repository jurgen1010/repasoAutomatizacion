package com.tcs.certificacion.CalculadoraWindows.tasks;

import com.tcs.certificacion.CalculadoraWindows.userinterfaces.Calculadora;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Adicionar implements Task{

	private String operacion;
	private String numero;
	public Adicionar(String operacion,String numero) {
		this.operacion=operacion;
		this.numero=numero;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		switch (operacion) {
		case "suma":
			actor.attemptsTo(Click.on(Calculadora.TECLA_SUM),
					Click.on(Calculadora.TECLA_NUMERO.of(numero)),
					Click.on(Calculadora.TECLA_IGUAL));
			break;
		case "resta":
			actor.attemptsTo(Click.on(Calculadora.TECLA_RESTAR),
					Click.on(Calculadora.TECLA_NUMERO.of(numero)),
					Click.on(Calculadora.TECLA_IGUAL));
			break;
		case "multiplicacion":
			actor.attemptsTo(Click.on(Calculadora.TECLA_MULTIPLICAR),
							Click.on(Calculadora.TECLA_NUMERO.of(numero)),
							Click.on(Calculadora.TECLA_IGUAL));
		case "division":
			actor.attemptsTo(Click.on(Calculadora.TECLA_DIVIDIR),
							Click.on(Calculadora.TECLA_NUMERO.of(numero)),
							Click.on(Calculadora.TECLA_IGUAL));
			break;
		default:
			break;
		}
	}
	
	public static Adicionar operacion(String operacion,String numero) {
		return Tasks.instrumented(Adicionar.class, operacion,numero);
	}
}
