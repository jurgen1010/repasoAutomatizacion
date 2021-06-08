package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProducto implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Producto.BOTON_ADDTOCARD));
		
	}
public static AgregarProducto alCanasto() {
		
		return Tasks.instrumented(AgregarProducto.class);
	}
}
