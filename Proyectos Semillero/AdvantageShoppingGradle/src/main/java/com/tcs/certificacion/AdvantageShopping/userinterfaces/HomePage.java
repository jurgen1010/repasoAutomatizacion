package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

	public static final Target ICONO_USER = Target.the("icono usuario").locatedBy("//*[@id='menuUser']");
	public static final Target RED_SOCIAL = Target.the("icono red social").locatedBy("//*[@id=\"follow\"]/a/img[@name='follow_{0}']");
	public static final Target CATEOGIRA = Target.the("categoria").locatedBy("//*[@id='{0}Txt\']");
	
	
	
}
