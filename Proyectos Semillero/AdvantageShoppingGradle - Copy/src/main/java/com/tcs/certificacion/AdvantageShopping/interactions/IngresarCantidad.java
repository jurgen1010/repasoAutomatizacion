package com.tcs.certificacion.AdvantageShopping.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarCantidad implements Interaction{

	private Target target;
	private int cantidad;
	public IngresarCantidad(Target target, int cantidad) {
		this.target=target;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
			for (int i = 0; i < cantidad-1; i++) {			
				target.resolveFor(actor).click();	
		}
	
		
	}
	public static IngresarCantidad deProducto(Target target, int cantidad) {
		return Tasks.instrumented(IngresarCantidad.class, target,cantidad);
	}
}
