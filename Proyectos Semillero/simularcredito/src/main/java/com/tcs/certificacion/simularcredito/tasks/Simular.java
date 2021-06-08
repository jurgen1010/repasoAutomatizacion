package com.tcs.certificacion.simularcredito.tasks;

import com.tcs.certificacion.simularcredito.userinterfaces.SimuladorCredito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Simular implements Task{

	private String simular,fechanacimiento,tasa,tipocredito,plazomeses,valorprestamo;
	
	public Simular(String simular) {
		this.simular=simular;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SimuladorCredito.COMBO_SIMULAR),
				Click.on(SimuladorCredito.OPCION_SIMULAR.of(simular)),
				Enter.theValue(fechanacimiento).into(SimuladorCredito.FECHA_NACIMIENTO),
				Click.on(SimuladorCredito.COMBO_TASA),
				Click.on(SimuladorCredito.OPCION_COMBO_TASA.of(tasa)),
				Click.on(SimuladorCredito.COMBO_TIPOPRODUCTO),
				Click.on(SimuladorCredito.OPCION_TIPOPRODUCTO.of(tipocredito)),
				Click.on(SimuladorCredito.SEGURO_DESEMPLEADO),
				Enter.theValue(plazomeses).into(SimuladorCredito.TXT_PLAZO_PRESTAMO),
				Enter.theValue(valorprestamo).into(SimuladorCredito.TXT_VALOR_PRESTAMO),
				Click.on(SimuladorCredito.BTN_SIMULAR)
				);
		
	}
	public static Simular tipoSimulacion(String simular) {
		return Tasks.instrumented(Simular.class, simular);
	}
	public Simular yConFechaDeNacimiento(String fechanacimiento) {
		this.fechanacimiento=fechanacimiento;
		return this;
	}
	public Simular yConTasa(String tasa) {
		this.tasa=tasa;
		return this;
	}
	public Simular yConTipoCredito(String tipocredito) {
		this.tipocredito=tipocredito;
		return this;
	}
	public Simular yConPlazoMeses(String plazomeses) {
		this.plazomeses=plazomeses;
		return this;
	}
	public Simular yConValorPrestamo(String valorprestamo) {
		this.valorprestamo=valorprestamo;
		return this;
	}

}
