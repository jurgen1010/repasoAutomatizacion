package com.bancolombia.myextra.questions;

import com.bancolombia.myextra.interactions.Text;
import com.bancolombia.myextra.userinterfaces.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Leyendo implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(Login.MENSAJE);
		
	}
	public static Leyendo elMensaje() {
		return new Leyendo();
	}

}
