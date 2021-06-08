package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.HomePage;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.IniciarSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguearse implements Task{

	private String username,password;
	public Loguearse (String username) {
		this.username=username;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(	Click.on(HomePage.ICONO_USER),
							Enter.theValue(username).into(IniciarSesion.USERNAME),
							Enter.theValue(password).into(IniciarSesion.PASSWORD),
							Click.on(IniciarSesion.BOTON_LOGIN));
		
	}
	public static Loguearse conUsuario(String username) {
		return Tasks.instrumented(Loguearse.class, username);
	}
	public Loguearse conPassword(String password) {
		this.password=password;
		return this;
	}
	
}
