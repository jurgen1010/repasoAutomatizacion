package com.bancolombia.myextra.tasks;

import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;
import com.bancolombia.myextra.userinterfaces.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class IngresarCredenciales implements Task{

	private String usuario,contrasena;
	public IngresarCredenciales (String usuario) {
		this.usuario=usuario;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("A").into(Login.OPCION_MENU),
				Hit.theKey("<Enter>")
				
				);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(Enter.theValue(usuario).into(Login.USUARIO),
				Enter.theValue(contrasena).into(Login.CONTRSEÑA),
				Hit.theKey("<Enter>"));
		
	}
	public static IngresarCredenciales conUsuario(String usuario) {
		return Tasks.instrumented(IngresarCredenciales.class, usuario);
	}
	public IngresarCredenciales conContrseña(String contrasena){
		this.contrasena=contrasena;
		return this;
	}

}
