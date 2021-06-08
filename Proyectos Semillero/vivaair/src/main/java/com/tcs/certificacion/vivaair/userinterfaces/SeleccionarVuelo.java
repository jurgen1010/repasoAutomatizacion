package com.tcs.certificacion.vivaair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarVuelo {

	public static final Target PRECIO_VUELO = Target.the("precio de vuelo").locatedBy("//div[@id='divAvailabilityOut']//div[@class='flightAvailability'][1]//label[@class='{0}']");
	public static final Target BOTON_TERMINOS = Target.the("boton acepto terminos").locatedBy("//a[@class='red right confirm']");
	
}
