package com.tcs.certificacion.orangehrm.taks;

import com.tcs.certificacion.orangehrm.userinterfaces.RegistroUsuario;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrARegistroUser implements Task{

	public  IrARegistroUser() {
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(RegistroUsuario.COMBOADMIN),
				Click.on(RegistroUsuario.USER_MANAGEMENT),
				Click.on(RegistroUsuario.USER));
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			actor.attemptsTo(Click.on(RegistroUsuario.ADDUSER));
	
		
	}

	public static IrARegistroUser ir() {
		return instrumented(IrARegistroUser.class);
	}
}
