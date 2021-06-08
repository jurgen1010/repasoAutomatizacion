package com.bancolombia.certificacion.banistmo.tasks;

import com.bancolombia.certificacion.banistmo.userinterfaces.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguearse implements Task{

	private String usuario,contrasena;
	public Loguearse (String usuario) {
		this.usuario=usuario;
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuario).into(Login.USER),
				Click.on(Login.BOTON_ACEPTAR),
				Enter.theValue(contrasena).into(Login.TXT_PASSWORD),
				Click.on(Login.BOTON_ACEPTAR_PASSWORD));
		
	}
	public static Loguearse conUsuario(String usuario) {
		return Tasks.instrumented(Loguearse.class,usuario);
	}
	public Loguearse conContrasena(String contrasena) {
		this.contrasena=contrasena;
		return this;
	}

}
