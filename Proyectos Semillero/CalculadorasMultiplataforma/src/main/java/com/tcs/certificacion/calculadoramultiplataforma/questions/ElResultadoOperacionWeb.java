package com.tcs.certificacion.calculadoramultiplataforma.questions;

import com.tcs.certificacion.calculadoramultiplataforma.userinterfaces.CalculadoraWeb;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResultadoOperacionWeb implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(CalculadoraWeb.RESULTADO).viewedBy(actor).asString();
	}
	public static ElResultadoOperacionWeb es() {
		return new ElResultadoOperacionWeb();
	}

}
