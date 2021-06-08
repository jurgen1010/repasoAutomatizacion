package com.tcs.certificacion.CalculadoraWindows.questions;

import com.tcs.certificacion.CalculadoraWindows.userinterfaces.Calculadora;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerResulltado implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(Calculadora.RESULTADO).viewedBy(actor).asString();
	}
	public static VerResulltado deOperacion() {
		return new VerResulltado();
	}

}
