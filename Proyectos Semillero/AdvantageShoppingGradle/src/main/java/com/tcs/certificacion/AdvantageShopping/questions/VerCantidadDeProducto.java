package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerCantidadDeProducto implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Producto.CAMPO_CANTIDAD.resolveFor(actor).getTextValue();
	}
	public static VerCantidadDeProducto ingresada() {
		return new VerCantidadDeProducto();
	}

}
