package com.tcs.certificacion.buscargooglesp.questions;

import com.tcs.certificacion.buscargooglesp.userinterface.BuscarGoogle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Leyendo implements Question<String> {

	public String answeredBy(Actor actor) {
		return Text.of(BuscarGoogle.URL_RESULTADO).viewedBy(actor).asString();
	}
	public static Leyendo laUrl() {
		return new Leyendo();
	}

}
