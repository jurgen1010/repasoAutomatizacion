package com.bancolombia.certificacion.banistmo.tasks;

import com.bancolombia.certificacion.banistmo.userinterfaces.Transferencia;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrATransferencia implements Task{

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Transferencia.MENU_TRANSFERENCIAS),
						Click.on(Transferencia.CUENTAS_PROPIAS));
		
	}
	public static IrATransferencia aCuentasPropias() {
		return Tasks.instrumented(IrATransferencia.class);
	}

	
}
