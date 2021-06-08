package com.tcs.certificacion.sucursalvirtualpersonas.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.sucursalvirtualpersonas.interactions.Cambiar;
import com.tcs.certificacion.sucursalvirtualpersonas.userinterfaces.PaginaInicial;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrA implements Task{
	private String nombre;
	
	public IrA(String nombre) {
		this.nombre=nombre;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaInicial.BTN_TRANSACCION),
						Click.on(PaginaInicial.SUCURSAL_VIRTUAL_PERSONAS),
						Cambiar.deVentana(nombre));
		
	}
	public static IrA sucursalVirtualPersonas(String nombre) {
		return Tasks.instrumented(IrA.class, nombre);
	}

}
