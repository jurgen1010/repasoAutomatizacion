package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.Categoria;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerBotonBuyNow implements Question<Boolean>{

	public Boolean answeredBy(Actor actor) {
		return Categoria.BOTON_BUY_NOW.resolveFor(actor).isVisible();
	}
	public static VerBotonBuyNow enEstado() {
		return new VerBotonBuyNow();
	}

}
