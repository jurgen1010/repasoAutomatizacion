package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.interactions.IngresarCantidad;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class SeleccionarCantidad implements Task{

	private String cantidad;
	public SeleccionarCantidad (String cantidad) {
		
		this.cantidad=cantidad;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(cantidad).into(Producto.CAMPO_CANTIDAD));
		
	}
	public static SeleccionarCantidad deProducto(String cantidad) {
		return Tasks.instrumented(SeleccionarCantidad.class, cantidad);
	}

	
}
