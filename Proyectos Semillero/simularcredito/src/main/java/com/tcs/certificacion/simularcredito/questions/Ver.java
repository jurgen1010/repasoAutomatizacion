package com.tcs.certificacion.simularcredito.questions;

import com.tcs.certificacion.simularcredito.userinterfaces.SimuladorCredito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Ver implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(SimuladorCredito.TASA).viewedBy(actor).asString();
	
	}
	
	public static Ver laTasaAnual() {
		return new Ver();
	}

}
