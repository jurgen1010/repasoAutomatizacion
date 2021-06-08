package com.tcs.certificacion.AdvantageShopping.questions;

import java.util.ArrayList;
import java.util.List;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerTitulosDeSecciones implements Question<String> {

	private String seccion;
	private String target;

	public VerTitulosDeSecciones(String seccion) {
		this.seccion = seccion;
	}

	@Override
	public String answeredBy(Actor actor) {
		if (seccion.equals("acountdetails")) {
			target= Text.of(RegistroUsuario.PALABRA_ACOUNT_DETAIL).viewedBy(actor).asString();
		}
		else if(seccion.equals("personaldetails")) {
			target= Text.of(RegistroUsuario.PALABRA_PERSONAL_DETAIL).viewedBy(actor).asString();
		}
		else target = Text.of(RegistroUsuario.PALABRA_ADDRESS).viewedBy(actor).asString();
		
		return target;
	}

	public static VerTitulosDeSecciones enLaPagina(String seccion) {
		return new VerTitulosDeSecciones(seccion);
	}

}
