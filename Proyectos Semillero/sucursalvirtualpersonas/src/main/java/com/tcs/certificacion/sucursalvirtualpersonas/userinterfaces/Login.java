package com.tcs.certificacion.sucursalvirtualpersonas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Login {

	public static final Target BTN_NUMERO = Target.the("numero opcion")
							.locatedBy("//td[@class='bg_buttonSmall'][not(contains(@onclick,'clearKeys();'))]");
	public static final Target TXT_BTN_NUMERO = Target.the("numero opcion")
			.locatedBy("//td[@class='bg_buttonSmall'][not(contains(@onclick,'clearKeys();'))]//div");
	public static final Target USERNAME = Target.the("campo usuario")
			.locatedBy("//input[@id='username']");
	public static final Target BTN_CONTINUAR = Target.the("boton continuar")
			.locatedBy("//button[@id='btnGo']");
	public static final Target DIGITO = Target.the("digito")
			.locatedBy("//td[@class='bg_buttonSmall']//div[.='{0}']");
	public static final Target BTN_INGRESAR = Target.the("boton ingresar")
			.locatedBy("//input[@id='btnGo']");
}
