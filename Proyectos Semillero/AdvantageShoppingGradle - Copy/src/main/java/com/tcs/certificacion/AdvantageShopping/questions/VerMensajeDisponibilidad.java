package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.CarroDeCompras;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerMensajeDisponibilidad implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CarroDeCompras.MENSAJE_STOCK_DISPONIBLE).viewedBy(actor).asString();
	}
	public static VerMensajeDisponibilidad deStock() {
		return new VerMensajeDisponibilidad();
	}

}
