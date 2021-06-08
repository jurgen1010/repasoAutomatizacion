package com.tcs.certificacion.platformcalculadora.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraMobile {
	public static final Target BTN_NUM = Target.the("numero 1 calculadora mobil").locatedBy("//android.widget.Button[@text='{0}']");
	public static final Target BTN_OPERADOR = Target.the("operador calculadora mobil").locatedBy("//android.widget.Button[@text='+']");
	public static final Target BTN_NUM2 = Target.the("numero 2 calculadora mobil").locatedBy("//android.widget.Button[@text='{0}']");
	public static final Target BTN_IGUAL= Target.the("boton igual calculadora mobil").locatedBy("//android.widget.Button[@text='=']");
	public static final Target TXT_RESULTADO = Target.the("resulatdo operacion mobil").locatedBy("//android.widget.EditText[@text='5']");
}
