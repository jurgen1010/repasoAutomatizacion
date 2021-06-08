package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesDeProducto {

	public static final Target NOMBRE_PRODUCTO_VENTANA_EMERGENTE = Target.the("nombre producto en ventana").locatedBy("(//h3[@class='ng-binding'])[1]");
	public static final Target IMAGEN_PRODUCTO_VENTANA_EMERGENTE = Target.the("imagen producto en ventana").locatedBy("(//*[@id=\"product\"]/td[1]/a/img)[1]");
	public static final Target CANTIDAD_PRODUCTO_VENTANA_EMERGENTE = Target.the("cantidad producto en ventana").locatedBy("(//*[@id=\"product\"]/td[2]/a/label[@class='ng-binding'])[1]");
	public static final Target COLOR_PRODUCTO_VENTANA_EMERGENTE = Target.the("color producto en ventana").locatedBy("//tool-tip-cart[@style='display: block;']//label[contains(.,'Color:')]/span");
	public static final Target PRECIO_PRODUCTO_VENTANA_EMERGENTE = Target.the("precio producto en ventana").locatedBy("(//*[@id=\"product\"]/td[3]/p)[1]");
	
	
	
	
	
}
