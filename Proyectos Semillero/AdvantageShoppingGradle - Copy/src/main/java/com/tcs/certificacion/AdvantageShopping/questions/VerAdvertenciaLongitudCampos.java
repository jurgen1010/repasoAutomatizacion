package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class VerAdvertenciaLongitudCampos implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(RegistroUsuario.MENSAJE_LONGITUD_ACCOUNT_DETAILS).viewedBy(actor).asString();
		
	}
	public static VerAdvertenciaLongitudCampos permitida() {
		return new VerAdvertenciaLongitudCampos();
	}

}
