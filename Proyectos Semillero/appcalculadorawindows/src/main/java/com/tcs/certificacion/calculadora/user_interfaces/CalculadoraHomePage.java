package com.tcs.certificacion.calculadora.user_interfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraHomePage {
	public static final Target BTN_NUMERO=Target.the("numero de la calculadora").locatedBy("//*[@AutomationId='num"+"{0}"+"'Button']");
	public static final Target BTN_MAS=Target.the("operador").located(By.name("{0}"));
	public static final Target BTN_NUMERO2=Target.the("numero de la calculadora").locatedBy("//*[@AutomationId='num"+"{0}"+"'Button']");
}
