package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.OrdenDePago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerMensajeCompra implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return OrdenDePago.MENSAJE_COMPRA_EXITOSA.resolveFor(actor).isVisible();
	}
	public static VerMensajeCompra exitosa() {
		return new VerMensajeCompra();
	}

}
