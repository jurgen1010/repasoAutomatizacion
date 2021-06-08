package com.tcs.certificacion.simularcredito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

	public static final Target TXT_BUSQUEDA=Target.the("campo busqueda").locatedBy("//form[@id='searchbox']//input[@class='ui-autocomplete-input']");
	public static final Target BTN_BUSCAR=Target.the("boton buscar").locatedBy("//div[@class='col-md-8 col-md-offset-2 busqueda']//form[@id='searchbox']//div");
}
