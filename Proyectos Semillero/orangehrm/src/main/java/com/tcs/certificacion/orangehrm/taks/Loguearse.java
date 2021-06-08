package com.tcs.certificacion.orangehrm.taks;

import com.tcs.certificacion.orangehrm.userinterfaces.LoginUsuario;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguearse implements Task{

	private String usuario;
	private String contraseña;

	
	public Loguearse(String usuario , String contraseña) {
		this.usuario=usuario;
		this.contraseña=contraseña;
	}
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuario).into(LoginUsuario.USUARIO),
				Enter.theValue(contraseña).into(LoginUsuario.PASSWORD),
				Click.on(LoginUsuario.BOTON_LOGIN));
		
	}
	public static Loguearse conUsuario (String usuario, String contraseña) {
		return instrumented(Loguearse.class,usuario,contraseña);
	}
	
}
