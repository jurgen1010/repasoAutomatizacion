package com.tcs.certificacion.vivaair.questions;

import com.tcs.certificacion.vivaair.userinterfaces.ReservarVuelo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LeerPalabra implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
	
		return Text.of(ReservarVuelo.PALABRA).viewedBy(actor).asString();
	}
	
	public static LeerPalabra enPantalla() {
		return new LeerPalabra();
	}

}
