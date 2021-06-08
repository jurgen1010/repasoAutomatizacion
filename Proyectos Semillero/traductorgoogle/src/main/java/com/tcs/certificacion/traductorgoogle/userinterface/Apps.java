package com.tcs.certificacion.traductorgoogle.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Apps {
	
	public static final Target 	APPS_GOOGLE=Target.the("Apps de google").locatedBy("//a[@title='Google Apps']");
	public static final Target APP=Target.the("").locatedBy("//li[@class='gb_T']//span[.='{0}']");

}
