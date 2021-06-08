package com.bancolombia.certificacion.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Transferir implements Task{

	private String cuentaOrigen,cuentaDestino,valorTransferencia,tipoTransferencia;
	public Transferir (String cuentaOrigen) {
		this.cuentaOrigen=cuentaOrigen;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}
	public static Transferir conCuentaOrigen(String cuentaOrigen) {
		return Tasks.instrumented(Transferir.class, cuentaOrigen);
	}
	public Transferir conCuentaDestino(String cuentaDestino) {
		this.cuentaDestino=cuentaDestino;
		return this;
	}
	public Transferir conValorTranferencia(String valorTransferencia) {
		this.valorTransferencia=valorTransferencia;
		return this;
	}
	public Transferir conTipoTransferencia(String tipoTransferencia) {
		this.tipoTransferencia=tipoTransferencia;
		return this;
	}

}
