package com.tcs.certificacion.traductorgoogle.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.traductorgoogle.userinterface.Apps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task{
	
	private String app;
	
	public Seleccionar(String app) {
		this.app=app;
	}
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Apps.APPS_GOOGLE)
				,Click.on(Apps.APP.called("selecciona la app "+app).of(app))
				);
	}
	
	public static Seleccionar laApp(String app) {
		return instrumented(Seleccionar.class, app);
	}
	
	

}
