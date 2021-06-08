package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.HomePage;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.Producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProductoCanasto implements Task {

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Producto.BOTON_ADDTOCARD),
							Click.on(Producto.BOTON_SHOPPING_CART));
		
	}
	
	
	public static AgregarProductoCanasto alCanasto() {
		
		return Tasks.instrumented(AgregarProductoCanasto.class);
	}

	
}
