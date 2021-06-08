package com.tcs.certificacion.calculadoramultiplataforma.questions;

import com.tcs.certificacion.calculadoramultiplataforma.userinterfaces.CalculadoraAndroid;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResultadoOperacionAndroid implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CalculadoraAndroid.RESULTADO).viewedBy(actor).asString();
	}
	public static ElResultadoOperacionAndroid es() {
		return new ElResultadoOperacionAndroid();
	}

}
