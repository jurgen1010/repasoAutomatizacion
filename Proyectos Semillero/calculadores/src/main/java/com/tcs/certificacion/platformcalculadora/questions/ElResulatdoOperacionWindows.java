package com.tcs.certificacion.platformcalculadora.questions;

import com.tcs.certificacion.platformcalculadora.user_interfaces.CalculadoraWindows;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResulatdoOperacionWindows implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(CalculadoraWindows.TXT_RESULTADO).viewedBy(actor).asString().substring(11);
	}
	
	public static ElResulatdoOperacionWindows es() {
		return new ElResulatdoOperacionWindows();
	}
}
