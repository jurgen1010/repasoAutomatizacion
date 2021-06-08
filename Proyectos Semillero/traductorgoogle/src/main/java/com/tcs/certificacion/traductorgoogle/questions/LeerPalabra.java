package com.tcs.certificacion.traductorgoogle.questions;

import com.tcs.certificacion.traductorgoogle.userinterface.Traductor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LeerPalabra implements Question<String>{

	public String answeredBy(Actor actor) {
		return Text.of(Traductor.PALABRA_TRADUCIDA).viewedBy(actor).asString();
	}
	
	public static LeerPalabra traducida() {
		return new LeerPalabra();
	}

}
