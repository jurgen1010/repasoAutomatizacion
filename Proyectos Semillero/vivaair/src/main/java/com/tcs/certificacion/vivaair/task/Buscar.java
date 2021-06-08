package com.tcs.certificacion.vivaair.task;

import com.tcs.certificacion.vivaair.userinterfaces.BuscarVuelo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar implements Task{

	private String origen,destino,numeroadultos,fechaida,moneda;
	
	public Buscar(String origen){
		this.origen=origen;
		
	}
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
						Click.on(BuscarVuelo.VUELO_IDA),
						Click.on(BuscarVuelo.ORIGEN),
						Click.on(BuscarVuelo.OPCIONORIGEN.of(origen)),
						Click.on(BuscarVuelo.DESTINO),
					    Click.on(BuscarVuelo.OPCIODESTINO.of(destino)),
					    Click.on(BuscarVuelo.FECHA_IDA),
					    Enter.theValue(fechaida).into(BuscarVuelo.FECHA_IDA),
					    Click.on(BuscarVuelo.LISTA_NUMERO_ADULTOS),
					    Click.on(BuscarVuelo.OPCION_NROADULTOS.of(numeroadultos)),
					    Click.on(BuscarVuelo.MONEDA),
					    Click.on(BuscarVuelo.OPCION_MONEDA.of(moneda)),
					    Click.on(BuscarVuelo.BOTON_BUSCAR_VUELO)
						);
		
	}
	
	public static Buscar conCiudadOrigen(String origen) {
		return instrumented(Buscar.class, origen);
	}
	public  Buscar conCiudadDestino(String destino) {
		this.destino=destino;
		return this;
	}
	public  Buscar conNumeroAdultos(String numeroadultos) {
		this.numeroadultos=numeroadultos;
		return this;
	}
	public  Buscar conFechaIda(String fechaida) {
		this.fechaida=fechaida;
		return this;
	}
	public  Buscar conMoneda(String moneda) {
		this.moneda=moneda;
		return this;
	}
	
	
	
}
