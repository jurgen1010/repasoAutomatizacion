package com.bancolombia.certificacion.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Transferencia {

	public static final Target MENU_TRANSFERENCIAS = Target.the("menu transferencias").locatedBy("//a[.='Transferencias']");
	public static final Target CUENTAS_PROPIAS = Target.the("cuentas propias").locatedBy("//*[@id=\"transfers_content_tab\"]/ul/li[1]/a");
	public static final Target CUENTA_ORIGEN = Target.the("cuenta origen").locatedBy("//select[@id='debitAccount']");
	public static final Target OPCION_CUENTA_ORIGEN = Target.the("opcion cuenta origen").locatedBy("//select[@id='debitAccount']//option[contains(text(),'{0}')]");
	public static final Target CUENTA_DESTINO = Target.the("cuenta destino").locatedBy("");
	
}
