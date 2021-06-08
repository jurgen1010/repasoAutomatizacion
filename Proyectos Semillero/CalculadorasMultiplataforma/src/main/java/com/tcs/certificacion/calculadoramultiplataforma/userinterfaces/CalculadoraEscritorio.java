package com.tcs.certificacion.calculadoramultiplataforma.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraEscritorio {

	public static final Target TECLA_NUMERO= Target.the("tecla numero").locatedBy("//*[@AutomationId='num{0}Button']");
	public static final Target TECLA_SUM= Target.the("tecla suma").locatedBy("//*[@AutomationId='plusButton']");
	public static final Target TECLA_IGUAL= Target.the("tecla igual").locatedBy("//*[@AutomationId='equalButton']");
	public static final Target RESULTADO= Target.the("resultado").locatedBy("//*[@AutomationId='CalculatorResults']");
}
