package com.tcs.certificacion.platformcalculadora.questions;

import com.tcs.certificacion.platformcalculadora.user_interfaces.CalculadoraWeb;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResultadoOperacionWeb implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(CalculadoraWeb.TXT_RESUL_WEB).viewedBy(actor).asString();
	}
	
	public static ElResultadoOperacionWeb es() {
		return new ElResultadoOperacionWeb();
	}
}
