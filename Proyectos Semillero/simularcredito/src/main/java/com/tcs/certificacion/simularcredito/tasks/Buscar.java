package com.tcs.certificacion.simularcredito.tasks;

import com.tcs.certificacion.simularcredito.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar implements Task{

	private String palabra;
	public Buscar(String palabra) {
		this.palabra=palabra;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(palabra).into(HomePage.TXT_BUSQUEDA),
						Click.on(HomePage.BTN_BUSCAR));
		
	}
	
	public static Buscar conLaPalabra(String palabra) {
		return Tasks.instrumented(Buscar.class, palabra);
	}

}
