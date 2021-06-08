package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.Categoria;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerImagenesDeProducto implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Producto.SECCION_IMAGENES_PRODUCTO.resolveFor(actor).isVisible();
	}
	public static VerImagenesDeProducto seleccionado() {
		return new VerImagenesDeProducto();
	}

}
