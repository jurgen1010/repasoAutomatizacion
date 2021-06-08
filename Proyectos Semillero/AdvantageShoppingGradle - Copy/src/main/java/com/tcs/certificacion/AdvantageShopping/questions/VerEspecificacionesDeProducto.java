package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerEspecificacionesDeProducto implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return Producto.ESPECIFICACIONES.resolveFor(actor).isVisible();
	}
	public static VerEspecificacionesDeProducto seleccionado() {
		return new VerEspecificacionesDeProducto();
	}
	
}
