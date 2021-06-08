package com.tcs.certificacion.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUsuario {

	public static final Target USUARIO = Target.the("campo usuario")
			.locatedBy("//input[@name='txtUsername']");
	public static final Target PASSWORD = Target.the("campos contraseña")
			.locatedBy("//input[@name='txtPassword']");
	public static final Target BOTON_LOGIN = Target.the("boton login")
			.locatedBy("//input[@name='Submit']");
}
