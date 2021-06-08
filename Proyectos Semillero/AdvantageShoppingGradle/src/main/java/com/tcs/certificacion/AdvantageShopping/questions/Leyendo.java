package com.tcs.certificacion.AdvantageShopping.questions;





import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Leyendo implements Question<String>{

	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(RegistroUsuario.USER_LOGUEADO).viewedBy(actor).asString();
		
	}
	public static Leyendo elNombreDeUsuario() {
		return new Leyendo();
	}

	
}
