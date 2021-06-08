package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.Categoria;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task {

	private String nombre;
	public SeleccionarProducto (String nombre) {
		this.nombre=nombre;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Categoria.NOMBRE_PRODUCTO.of(nombre)));
		
	}
	public static SeleccionarProducto conNombre(String nombre) {
		return Tasks.instrumented(SeleccionarProducto.class,nombre);
	}

	
}
