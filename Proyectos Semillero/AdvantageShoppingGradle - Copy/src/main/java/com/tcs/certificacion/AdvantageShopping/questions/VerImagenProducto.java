package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.CarroDeCompras;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.DetallesDeProducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerImagenProducto implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		
		return DetallesDeProducto.IMAGEN_PRODUCTO_VENTANA_EMERGENTE.resolveFor(actor).isVisible();
	}
	public static VerImagenProducto enVetanaDetalle() {
		return new VerImagenProducto();
	}

}
