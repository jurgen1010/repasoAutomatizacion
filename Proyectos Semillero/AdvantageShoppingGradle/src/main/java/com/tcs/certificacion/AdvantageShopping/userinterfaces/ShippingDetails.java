package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShippingDetails {
	public static final Target EDITAR_SHIPPING_DETAILS = Target.the("editar shipping details").locatedBy("//a[@translate='Edit_shipping_Details']");
	public static final Target FIRSTNAME = Target.the("firstname").locatedBy("//*[@id=\"userDetailsEditMode\"]/sec-form/div[1]/sec-view[1]/div/input");
	public static final Target LASTNAME = Target.the("lastname").locatedBy("//input[@name='last_name']");
	public static final Target PHONENUMBER = Target.the("phonenumber").locatedBy("//input[@name='phone_number']");
	public static final Target CITY = Target.the("city").locatedBy("//input[@name='city']");
	public static final Target ADDRESS = Target.the("addres").locatedBy("//input[@name='address']");
	public static final Target POSTALCODE = Target.the("postalcode").locatedBy("//input[@name='postal_code']");
	public static final Target STATE_PROVINCE_REGION = Target.the("state province region").locatedBy("//input[@name='state_/_province_/_region']");
	public static final Target BOTON_NEXT = Target.the("boton next").locatedBy("//button[@id='next_btnundefined']");
	public static final Target BOTON_NEXT_DOS = Target.the("boton next 2").locatedBy("//button[@id='next_btn']");
	
	
}
