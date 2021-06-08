package com.tcs.certificacion.platformcalculadora.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaValidacion implements Question<String> {
	
	private String resultweb, resultmobil, resultwindows;
	
	public LaValidacion(Actor julian, Actor esteban, Actor villa) {
		this.resultweb = julian.gaveAsThe("resultadoweb").toString();
		this.resultmobil = esteban.gaveAsThe("resultadomobil").toString();
		this.resultwindows = villa.gaveAsThe("resultadowindows").toString();
	}

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		if(resultmobil.equals(resultweb)&&resultmobil.equals(resultwindows))
			return "true";
		else
			return "false";
	}
	
	public static LaValidacion es(Actor julian, Actor esteban, Actor villa) {
		return new LaValidacion(julian, esteban, villa);
	}
}
