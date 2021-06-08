package com.tcs.certificacion.AdvantageShopping.tasks;

import org.openqa.selenium.Keys;

import com.tcs.certificacion.AdvantageShopping.interactions.Tabular;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciarCampo implements Task{

	private String camponame,valor;
	public DiligenciarCampo (String camponame, String valor) {
		this.camponame=camponame;
		this.valor=valor;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(valor).into(RegistroUsuario.CAMPO.of(camponame)).thenHit(Keys.TAB)
								//Tabular.enCampo(RegistroUsuario.CAMPO.of(camponame))
								);
		
	}
	public static DiligenciarCampo conNombre(String camponame,String valor) {
		return Tasks.instrumented(DiligenciarCampo.class, camponame,valor);
			
		}
}
