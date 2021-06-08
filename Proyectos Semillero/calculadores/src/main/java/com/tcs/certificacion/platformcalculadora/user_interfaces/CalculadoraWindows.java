package com.tcs.certificacion.platformcalculadora.user_interfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraWindows {
	public static final Target BTN_NUMERO = Target.the("boton número 1 ").locatedBy("//Button[@Name='{0}']");
	public static final Target BTN_OPERADOR = Target.the("boton operador calculadora windows").locatedBy("//Button[@Name='Más']");
	public static final Target BTN_NUMERO2 = Target.the("boton número 2 ").locatedBy("//Button[@Name='{0}']");
	public static final Target BTN_IGUAL = Target.the("boton igual calculadora windows").locatedBy("//Button[@Name='Es igual a']");
	public static final Target TXT_RESULTADO = Target.the("resultado operacion calculadora windows").locatedBy("//*[@Name='Se muestra 5']");
}
