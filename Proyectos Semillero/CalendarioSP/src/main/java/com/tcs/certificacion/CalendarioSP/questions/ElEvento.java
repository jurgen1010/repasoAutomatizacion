package com.tcs.certificacion.CalendarioSP.questions;



import com.tcs.certificacion.CalendarioSP.userinterfaces.NuevoEvento;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElEvento implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(NuevoEvento.EVENTO_AGREGADO).viewedBy(actor).asString();
		
	}
	public static ElEvento guardado() {
		return new ElEvento();
	}

}
