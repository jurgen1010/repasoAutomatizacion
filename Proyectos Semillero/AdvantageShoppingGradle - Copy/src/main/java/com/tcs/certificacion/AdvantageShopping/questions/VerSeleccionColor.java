package com.tcs.certificacion.AdvantageShopping.questions;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerSeleccionColor implements Question<String>{
	private String estado,color;
	
	
	
	public String answeredBy(Actor actor) {
		
		return Producto.COLOR_SELECCIONADO.resolveFor(actor).getAttribute("title").toString();
//		if(estado.equals("productColor ng-scope "+color+" colorSelected")) {
//			return true;
//		}
//		else return false;
	}
	public static VerSeleccionColor deProducto() {
		return new VerSeleccionColor();
	}
//	public VerSeleccionColor deColor(String color) {
//		this.color=color;
//		return this;
//	}

}
