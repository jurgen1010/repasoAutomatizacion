package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Producto {

	public static final Target SECCION_IMAGENES_PRODUCTO = Target.the("imagenes producto").locatedBy("//div[@id='lengthAllImages']/div");
	public static final Target COLOR = Target.the("color producto").locatedBy("//div[@class='colors ng-scope']/div/span[@title='{0}']");
	public static final Target COLOR_SELECCIONADO = Target.the("color producto seleccionado").locatedBy("//*[@id=\"productProperties\"]/div/div/span[contains(@class,'Selected')]");
	public static final Target BOTON_MAS = Target.the("boton mas cantidad de producto").locatedBy("//div[@class='e-sec-plus-minus']//div[@class='plus']");
	public static final Target CAMPO_CANTIDAD = Target.the("campo cantidad").locatedBy("//input[@name='quantity']");
	public static final Target ESPECIFICACIONES = Target.the("especificaciones").locatedBy("//article[@class='max-width '][2]");
	public static final Target BOTON_ADDTOCARD = Target.the("boton add to cart").locatedBy("//button[@name='save_to_cart']");
	public static final Target BOTON_SHOPPING_CART = Target.the("boton shopping cart").locatedBy("//*[@id='menuCart']");
	
}
