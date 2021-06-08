package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarColor implements Task{

	private String color;
	public SeleccionarColor (String color) {
		this.color=color;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Producto.COLOR.of(color)));
		
	}
	public static SeleccionarColor deProducto(String color) {
		return Tasks.instrumented(SeleccionarColor.class, color);
	}
}
