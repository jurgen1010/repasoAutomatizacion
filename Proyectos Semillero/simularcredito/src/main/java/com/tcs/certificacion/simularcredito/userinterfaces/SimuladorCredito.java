package com.tcs.certificacion.simularcredito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SimuladorCredito {

	public static final Target COMBO_SIMULAR=Target.the("combo tipo simulacion").locatedBy("//select[@name='comboTipoSimulacion']");
	public static final Target OPCION_SIMULAR=Target.the("tipo simulacion").locatedBy("//select[@name='comboTipoSimulacion']//option[.='{0}']");
	public static final Target FECHA_NACIMIENTO=Target.the("fecha de nacimiento").locatedBy("//input[@name='dateFechaNacimiento']");
	public static final Target COMBO_TASA=Target.the("combo tipo tasa").locatedBy("//select[@name='comboTipoTasa']");
	public static final Target OPCION_COMBO_TASA=Target.the("opcion tipo tasa").locatedBy("//select[@name='comboTipoTasa']//option[.='{0}']");
	public static final Target COMBO_TIPOPRODUCTO=Target.the("combo tipo producto").locatedBy("//select[@name='comboTipoProducto']");
	public static final Target OPCION_TIPOPRODUCTO=Target.the("opcion tipo producto").locatedBy("//select[@name='comboTipoProducto']//option[.='{0}']");
	public static final Target SEGURO_DESEMPLEADO=Target.the("seguro desempleado").locatedBy("//input[@name='checkSeguroDesempleo']");
	public static final Target TXT_PLAZO_PRESTAMO=Target.the("plazo prestamo").locatedBy("//input[@name='textPlazoInversion']");
	public static final Target TXT_VALOR_PRESTAMO=Target.the("valor prestamo").locatedBy("//input[@name='textValorPrestamo']");
	public static final Target BTN_SIMULAR=Target.the("boton simular").locatedBy("//button[.='Simular']");
	public static final Target TASA=Target.the("valor tasa").locatedBy("(//td[@class='monto valor ng-binding'])[1]");
	
	
}
