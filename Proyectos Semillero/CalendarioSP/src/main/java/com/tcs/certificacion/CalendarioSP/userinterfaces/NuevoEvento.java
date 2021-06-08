package com.tcs.certificacion.CalendarioSP.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NuevoEvento {

	public static final Target TITULO= Target.the("titulo evento").locatedBy("//*[@resource-id='com.samsung.android.calendar:id/title']");
	public static final Target NOTA= Target.the("nota evento").locatedBy("//*[@resource-id='com.samsung.android.calendar:id/description']");
	public static final Target BOTON_GUARDAR= Target.the("boton guardar").locatedBy("//*[@text='GUARDAR']");
	public static final Target EVENTO_AGREGADO= Target.the("evento agregado").locatedBy("//*[@resource-id='com.samsung.android.calendar:id/event_title']");
	
}
