package com.tcs.certificacion.sucursalvirtualpersonas.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com")
public class PaginaInicial extends PageObject{

	public static final Target BTN_TRANSACCION = Target.the("boton transacciones")
			.locatedBy("//li[@id='transacciones']");
	public static final Target SUCURSAL_VIRTUAL_PERSONAS = Target.the("link sucursal")
			.locatedBy("//a[.='Sucursal Virtual Personas  ']");
	
}
