package com.tcs.certificacion.CalendarioSP.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Calendario {

	public static final Target MES = Target.the("mes").located(By.id("com.samsung.android.calendar:id/title_string_main"));
	public static final Target DIA = Target.the("dia").locatedBy("//android.view.View[ contains(@content-desc,'{0}')]");
	public static final Target AÑO = Target.the("año").locatedBy("//*[@text='{0}']");
	public static final Target BOTON_ADD = Target.the("boton agregar evento").locatedBy("//*[@resource-id='com.samsung.android.calendar:id/floating_action_button']");
	
	
}
