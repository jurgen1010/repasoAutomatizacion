package com.bancolombia.certificacion.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Login {

	public static final Target LINK_SUCURSALVIRTUAL = Target.the("link sucursal").locatedBy("//a[.='presione aquí']");
	public static final Target USER = Target.the("USUARIO").locatedBy("//input[@id='username']");
	public static final Target BOTON_ACEPTAR = Target.the("boton aceptar").locatedBy("(//input[@id='btnGo'])[1]");
	public static final Target TXT_PASSWORD = Target.the("campo password").locatedBy("//input[@id='password']");
	public static final Target BOTON_ACEPTAR_PASSWORD = Target.the("campo password").locatedBy("//input[@id='btnGo']");
	
	
}
