package com.tcs.certificacion.calculadora.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraPage {
	public static final Target TXT_NUMERO_ONE=Target.the("tecla numero 1 ").locatedBy("//android.widget.Button[@content-desc='{0}']");
	public static final Target TXT_OPERADOR_SUMA=Target.the("operador suma").locatedBy("//android.widget.Button[@text='{0}']");
	public static final Target TXT_NUMERO_TWO=Target.the("tecla numero 2").locatedBy("//android.widget.Button[@content-desc='{0}']");
	public static final Target BTN_RESULTADO=Target.the("operador igual").locatedBy("//android.widget.Button[@content-desc=\"Igual\"]");
}
