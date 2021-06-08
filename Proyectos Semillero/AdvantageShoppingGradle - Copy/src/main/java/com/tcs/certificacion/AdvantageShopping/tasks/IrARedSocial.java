package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.interactions.Cambiar;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.HomePage;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IrARedSocial implements Task{

	
	private String redsocial;
	public IrARedSocial(String redsocial) {
		this.redsocial=redsocial;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.RED_SOCIAL.of(redsocial)),
						Cambiar.deVentana());
		
	}
	public static IrARedSocial conNombre(String redsocial) {
		return Tasks.instrumented(IrARedSocial.class, redsocial);
	}

}
