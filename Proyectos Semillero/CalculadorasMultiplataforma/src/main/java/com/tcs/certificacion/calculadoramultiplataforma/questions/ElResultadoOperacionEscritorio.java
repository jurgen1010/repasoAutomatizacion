package com.tcs.certificacion.calculadoramultiplataforma.questions;

import com.tcs.certificacion.calculadoramultiplataforma.userinterfaces.CalculadoraEscritorio;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResultadoOperacionEscritorio implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(CalculadoraEscritorio.RESULTADO).viewedBy(actor).asString();
	}
	public static ElResultadoOperacionEscritorio es() {
		return new ElResultadoOperacionEscritorio();
	}

}
