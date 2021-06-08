package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.DetallesDeProducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerPrecioProducto implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(DetallesDeProducto.PRECIO_PRODUCTO_VENTANA_EMERGENTE).viewedBy(actor).asString();
	}
	public static VerPrecioProducto enVentanaDetalle() {
		return new VerPrecioProducto();
	}
}
