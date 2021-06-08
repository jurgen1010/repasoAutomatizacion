package com.tcs.certificacion.vivaair.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.vivaair.userinterfaces.SeleccionarVuelo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task {

	private String precio;

	public Seleccionar(String precio) {
		this.precio=precio;
	}
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarVuelo.PRECIO_VUELO.of(precio))
				);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(SeleccionarVuelo.BOTON_TERMINOS));
		
	}
	public static Seleccionar conElPrecio(String precio) {
		return instrumented(Seleccionar.class, precio);
	}
	
}
