package com.tcs.certificacion.calculadoramultiplataforma.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraAndroid {

	public static final Target TECLA_NUMERO = Target.the("tecla numero").locatedBy("//*[@text='{0}']");
	public static final Target TECLA_SUM= Target.the("tecla suma").locatedBy("//*[@text='+']");
	public static final Target TECLA_IGUAL= Target.the("tecla igual").locatedBy("//*[@text='=']");
	public static final Target RESULTADO= Target.the("resultado").locatedBy("//android.widget.EditText");
}
