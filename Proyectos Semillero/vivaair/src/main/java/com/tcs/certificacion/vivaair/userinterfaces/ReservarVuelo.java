package com.tcs.certificacion.vivaair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReservarVuelo {
	public static final Target NOMBRES = Target.the("nombres").locatedBy("//input[@class='firstname']");
	public static final Target APELLIDOS = Target.the("apellidos").locatedBy("//input[@class='lastname']");
	public static final Target LISTA_GENERO = Target.the("lista genero").locatedBy("//div[@id='s2id_Adults[0].gender']//a[@class='select2-choice']");
	public static final Target OPCION_GENERO = Target.the("lista genero").locatedBy("//div[@id='select2-drop']//div[text()='{0}']");
	public static final Target NUMERO_DE_DOCUMENTO = Target.the("numero de documento").locatedBy("//input[@id='Adults[0].IdentificationNumber']");
	public static final Target ASISTENCIA = Target.the("opcion asistencia").locatedBy("//div[@class='special-assistance-input-wrapper']//fieldset//label//span[text()='{0}']");
	public static final Target EMAIL = Target.the("opcion asistencia").locatedBy("//input[@class='email']");
	public static final Target CONFIRMAR_EMAIL = Target.the("opcion asistencia").locatedBy("//input[@id='Passengers[0].repeatemail']");
	
	public static final Target CELULAR = Target.the("numero de celular").locatedBy("//input[@id='Passengers0_mobile']");
	public static final Target BOTON_CONTINUAR = Target.the("boton continuar").locatedBy("//a[@id='btnContinuePassengerDetails']");
	public static final Target PALABRA = Target.the("palabra asientos").locatedBy("//div[@class='extrasHeader']//h3[text()='Silla']");
	
	
	
}
