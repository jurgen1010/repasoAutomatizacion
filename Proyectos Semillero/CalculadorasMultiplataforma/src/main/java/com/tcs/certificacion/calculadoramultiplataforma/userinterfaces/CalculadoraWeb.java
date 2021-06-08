package com.tcs.certificacion.calculadoramultiplataforma.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraWeb {

	public static final Target TECLA_NUMERO = Target.the("tecla numero").locatedBy("//div[@class='cwcd cwbbc']//span[@class='BVPfqc' and contains(text(),'{0}')]");
	public static final Target TECLA_SUMAR = Target.the("tecla sumar").locatedBy("//span[.='+']");
	public static final Target TECLA_IGUAL = Target.the("tecla igual").locatedBy("//span[.='=']");
	public static final Target RESULTADO = Target.the("resultado").locatedBy("//div[@class='cwtlotc']");
}
