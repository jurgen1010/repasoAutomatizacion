package com.tcs.certificacion.sucursalvirtualpersonas.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.tcs.certificacion.sucursalvirtualpersonas.interactions.IngresarCredenciales;

import com.tcs.certificacion.sucursalvirtualpersonas.userinterfaces.Login;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguearse implements Task{

	private String usuario;
	private String clave;
	public Loguearse (String usuario) {
		this.usuario=usuario;				
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Enter.theValue(usuario).into(Login.USERNAME),
				Click.on(Login.BTN_CONTINUAR));
		for(int i = 0; i < clave.length(); i++) {
			char numero = clave.charAt(i);
			String num = Character.toString(numero);
			actor.attemptsTo(IngresarCredenciales.conClave(Login.DIGITO.of(num)));
		}
		actor.attemptsTo(Click.on(Login.BTN_INGRESAR));
		
		//actor.attemptsTo(IngresarCredenciales.conClave(clave));
//		for (int i = 0; i < clave.length(); i++) {
//			char numero= clave.charAt(i);
//			String Numero = Character.toString(numero);
//			actor.attemptsTo(ClickJs.en(Login.BTN_OPCION.of(Numero)));
//		}
		
	}
	public static Loguearse conElUsuario(String usuario) {
		return instrumented(Loguearse.class, usuario);
	}
	public Loguearse yConClave(String clave) {
		this.clave=clave;
		return this;
	}
	
}
