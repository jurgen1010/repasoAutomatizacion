package com.tcs.certificacion.platformcalculadora.questions;

import com.tcs.certificacion.platformcalculadora.user_interfaces.CalculadoraMobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResultadoOperacionMobile implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(CalculadoraMobile.TXT_RESULTADO).viewedBy(actor).asString();
	}
	
	public static ElResultadoOperacionMobile es() {
		return new ElResultadoOperacionMobile();
	}
}
