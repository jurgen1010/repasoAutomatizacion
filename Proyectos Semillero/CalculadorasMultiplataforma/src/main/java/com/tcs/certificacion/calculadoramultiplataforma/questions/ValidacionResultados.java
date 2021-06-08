package com.tcs.certificacion.calculadoramultiplataforma.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionResultados implements Question<Boolean>{

	private String resultadoweb,resultadomovil,resultadowindows;
	public ValidacionResultados(Actor mateo, Actor jurgen,Actor jhosi) {
		this.resultadoweb = mateo.gaveAsThe("resultadoweb").toString();
		this.resultadomovil = jurgen.gaveAsThe("resultadomovil").toString();
		this.resultadowindows = jhosi.recall("resultadowindows");
	}
	@Override
	public Boolean answeredBy(Actor actor) {
		if (resultadomovil.equals(resultadoweb)&&resultadomovil.equals(resultadowindows)) 
			return true;
		else 
			return false;
	}
	public static ValidacionResultados es(Actor mateo,Actor jurgen,Actor jhosi) {
		return new ValidacionResultados(mateo, jurgen, jhosi);
	}
	
	
}
