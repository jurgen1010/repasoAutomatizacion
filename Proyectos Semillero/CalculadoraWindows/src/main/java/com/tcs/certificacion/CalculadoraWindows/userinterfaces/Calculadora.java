package com.tcs.certificacion.CalculadoraWindows.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Calculadora {

	public static final Target TECLA_NUMERO= Target.the("tecla numero").locatedBy("//*[@AutomationId='num{0}Button']");
	public static final Target TECLA_SUM= Target.the("tecla suma").locatedBy("//*[@AutomationId='plusButton']");
	public static final Target TECLA_IGUAL= Target.the("tecla igual").locatedBy("//*[@AutomationId='equalButton']");
	public static final Target TECLA_MULTIPLICAR= Target.the("tecla multiplicar").locatedBy("//*[@AutomationId='multiplyButton']");
	public static final Target TECLA_DIVIDIR= Target.the("tecla dividir").locatedBy("//*[@AutomationId='divideButton']");
	public static final Target TECLA_RESTAR= Target.the("tecla restar").locatedBy("//*[@AutomationId='minusButton']");
	public static final Target RESULTADO= Target.the("resultado").locatedBy("//*[@AutomationId='CalculatorResults']");
}
