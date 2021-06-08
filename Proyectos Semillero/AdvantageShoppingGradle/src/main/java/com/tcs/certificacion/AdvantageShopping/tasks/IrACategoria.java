package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrACategoria implements Task {

	private String categoria;
	public IrACategoria (String categoria) {
		this.categoria=categoria;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(HomePage.CATEOGIRA.of(categoria)));
	}
	public static IrACategoria deProducto(String categoria) {
		return Tasks.instrumented(IrACategoria.class, categoria);
	}

}
