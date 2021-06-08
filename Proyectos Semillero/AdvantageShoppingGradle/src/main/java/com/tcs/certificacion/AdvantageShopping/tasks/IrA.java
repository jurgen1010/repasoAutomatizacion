package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.HomePage;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.IniciarSesion;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IrA implements Task{



	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(HomePage.ICONO_USER),
		Click.on(IniciarSesion.BOTON_CREAR_NUEVACUENTA));
						
		
	}
	public static IrA  registroUsuario() {
		return Tasks.instrumented(IrA.class);
	}
	
}
