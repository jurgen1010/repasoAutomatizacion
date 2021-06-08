package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarroDeCompras {

	public static final Target NOMBRE_PRODUCTO = Target.the("nombre producto").locatedBy("//label[@class='roboto-regular productName ng-binding']");
	public static final Target COLOR_PRODUCTO = Target.the("color producto").locatedBy("//span[@class='productColor']");
	public static final Target CANTIDAD = Target.the("cantidad producto").locatedBy("(//td[@class='smollCell quantityMobile']/label)[2]");
	public static final Target PRECIOTOTAL = Target.the("precio producto").locatedBy("(//td//span[@class='roboto-medium ng-binding'])[2]");
	public static final Target IMAGEN_PRODUCTO = Target.the("imagen producto").locatedBy("//tr[@class='ng-scope']//img[@class='imageUrl']");
	public static final Target BOTON_CHECKOUT = Target.the("boton checkout").locatedBy("//button[@id='checkOutButton']");
	public static final Target MENSAJE_STOCK_DISPONIBLE = Target.the("stock disponible").locatedBy("//label[@data-ng-class='message._class']");
	
	
}
