package com.tcs.certificacion.vivaair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarVuelo {
	
	public static final Target VUELO_IDA = Target.the("vuelo ida").locatedBy("//label[@id='rbOneWayWrapper']");
	public static final Target ORIGEN = Target.the("ciudad origen").locatedBy("//div[@id='s2id_departureCityDrop']");	
	public static final Target OPCIONORIGEN = Target.the("opcion ciudad origen").locatedBy("//ul[@id='select2-results-20']//div[text()='{0}']");
	public static final Target DESTINO = Target.the("ciudad destino").locatedBy("//div[@id='s2id_arrivalCityDrop']");
	public static final Target OPCIODESTINO = Target.the("opcion ciudad origen").locatedBy("//ul[@id='select2-results-21']//div[text()='{0}']");
	public static final Target LISTA_NUMERO_ADULTOS = Target.the("lista numero de adultos").locatedBy("//div[@id='s2id_Adults']");
	public static final Target OPCION_NROADULTOS = Target.the("numero de adultos").locatedBy("//ul[@id='select2-results-22']//div[text()='{0}']");
	public static final Target FECHA_IDA = Target.the("fecha de ida").locatedBy("//input[@name='DepartureDateForDisplay']");
	public static final Target MONEDA = Target.the("moneda").locatedBy("//span[@id='select2-chosen-15']");
	public static final Target OPCION_MONEDA = Target.the("moneda").locatedBy("//ul[@class='select2-results']//span[text()='{0}']");
	public static final Target BOTON_BUSCAR_VUELO = Target.the("moneda").locatedBy("//a[@title='Reservar mi vuelo']");
	
	
	
}
