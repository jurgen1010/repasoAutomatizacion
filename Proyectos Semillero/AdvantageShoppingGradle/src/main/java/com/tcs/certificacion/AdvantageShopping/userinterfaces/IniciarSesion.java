package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesion {

	public static final Target BOTON_CREAR_NUEVACUENTA = Target.the("boton crear nueva cuenta").locatedBy("//a[@class='create-new-account ng-scope']");
	public static final Target USERNAME = Target.the("username").locatedBy("//input[@name='username']");
	public static final Target PASSWORD = Target.the("password").locatedBy("//input[@name='password']");
	public static final Target BOTON_LOGIN = Target.the("boton login").locatedBy("//button[@id='sign_in_btnundefined']");
}
