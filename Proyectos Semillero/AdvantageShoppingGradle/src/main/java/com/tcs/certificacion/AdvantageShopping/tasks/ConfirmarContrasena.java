package com.tcs.certificacion.AdvantageShopping.tasks;

import org.openqa.selenium.Keys;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ConfirmarContrasena implements Task{

	private String password,confirmpassword;
	public ConfirmarContrasena(String password) {
		this.password=password;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(password).into(RegistroUsuario.PASSWORD),
							Enter.theValue(confirmpassword).into(RegistroUsuario.CONFIRMPASSWORD).thenHit(Keys.TAB));
		
	}
	public static ConfirmarContrasena conPassword(String password) {
		return Tasks.instrumented(ConfirmarContrasena.class, password);
	}
	public ConfirmarContrasena conConfirmPassword(String confirmpassword) {
		this.confirmpassword=confirmpassword;
		return this;
	}

}
