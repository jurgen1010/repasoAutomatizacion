package com.tcs.certificacion.calculadoramobilegradle.questions;

import com.tcs.certificacion.calculadoramobilegradle.userinterfaces.Calculadora;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerResultado implements Question<String>{

	@Override 
	public String answeredBy(Actor actor) {
		
		return Text.of(Calculadora.RESULTADO).viewedBy(actor).asString();
	}
	public static VerResultado deOpeacion() {
		return new VerResultado();
	}
}
