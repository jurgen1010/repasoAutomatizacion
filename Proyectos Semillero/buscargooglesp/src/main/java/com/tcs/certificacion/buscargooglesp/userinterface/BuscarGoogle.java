package com.tcs.certificacion.buscargooglesp.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarGoogle {
	public static final Target BUSQUEDA_GOOGLE=Target.the("campo busqueda de google")
			.locatedBy("//*[@name='q']");
	
	public static final Target BUSCAR=Target.the("boton buscar")
			.locatedBy("//*[@value='{0}']");
	
	public static final Target URL_RESULTADO=Target.the("Primer resultado de busqueda")
			.locatedBy("//h3[.='Screenplay - Serenity BDD']/ancestor::a//cite");
			
}