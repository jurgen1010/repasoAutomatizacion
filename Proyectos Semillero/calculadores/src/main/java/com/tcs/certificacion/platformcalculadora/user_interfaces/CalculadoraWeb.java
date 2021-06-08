package com.tcs.certificacion.platformcalculadora.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraWeb {
	public static final Target BTN_NUM = Target.the("boton #1 calculadora web").locatedBy("//div[@id='cwbt34']//span[text()='{0}']");
	public static final Target BTN_OPERADOR = Target.the("boton operador calculadora web").locatedBy("//div[@id='cwbt46']//span[text()='+']");
	public static final Target BTN_NUM2 = Target.the("boton #2 calculadora web").locatedBy("//div[@id='cwbt35']//span[text()='{0}']");
	public static final Target BTN_IGUAL = Target.the("boton = calculadora web").locatedBy("//div[@id='cwbt45']//span[text()='=']");
	public static final Target TXT_RESUL_WEB = Target.the("resultado operacion web").locatedBy("//div[@id='cwtltblr']//span[text()='5']");
}
