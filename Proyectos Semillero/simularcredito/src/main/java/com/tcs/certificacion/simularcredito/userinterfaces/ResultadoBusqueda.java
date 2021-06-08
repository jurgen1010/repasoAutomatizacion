package com.tcs.certificacion.simularcredito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadoBusqueda {

	public static final Target LINK_SIMULADOR_CREDITO=Target.the("opcion simulador credito")
			.locatedBy("//*[@id=\"main-content\"]/div[1]/div/div/div[2]/table[1]/tbody/tr[1]/td/a[.='Simulador Crédito de Consumo']");
	
}
