package com.bancolombia.certificacion.banistmo.tasks;

import com.bancolombia.certificacion.banistmo.interactions.Cambiar;
import com.bancolombia.certificacion.banistmo.userinterfaces.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrASucursalVirtual implements Task{

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Login.LINK_SUCURSALVIRTUAL),
				Cambiar.deVentana());
		
	}
	public static IrASucursalVirtual banistmo() {
		return Tasks.instrumented(IrASucursalVirtual.class);
	}

}
