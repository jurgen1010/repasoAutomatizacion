package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Categoria {

	public static final Target BOTON_BUY_NOW = Target.the("buy now").locatedBy("//button[@name='buy_now']");
	public static final Target NOMBRE_PRODUCTO = Target.the("buy now").locatedBy("//a[@class='productName ng-binding' and text()='{0}']");
	
	
	
}
