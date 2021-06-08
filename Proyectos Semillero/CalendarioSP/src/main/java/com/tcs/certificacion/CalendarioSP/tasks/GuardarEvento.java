package com.tcs.certificacion.CalendarioSP.tasks;

import org.apache.commons.codec.language.Nysiis;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.tcs.certificacion.CalendarioSP.userinterfaces.Calendario;
import com.tcs.certificacion.CalendarioSP.userinterfaces.NuevoEvento;
import com.tcs.certificacion.CalendarioSP.util.drivers.MyAndroidDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import net.thucydides.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class GuardarEvento implements Task{

	private String titulo,nota;
	
	public GuardarEvento(String titulo) {
		this.titulo=titulo;
	}
		
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AndroidDriver<MobileElement>driver=(AndroidDriver<MobileElement>) BrowseTheWeb.as(actor).getDriver();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		actor.attemptsTo(
						 Enter.theValue(titulo).into(NuevoEvento.TITULO)
						 );				
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		actor.attemptsTo(
				         Click.on(NuevoEvento.NOTA),
					     Enter.theValue(nota).into(NuevoEvento.NOTA),
						 Click.on(NuevoEvento.BOTON_GUARDAR)
						 
						 );
	}
	public static GuardarEvento cumpleañosConTitulo(String titulo) {
		return Tasks.instrumented(GuardarEvento.class, titulo);
	} 
	public GuardarEvento cumpleañosConNota(String nota) {
		this.nota=nota;
		return this;
	}
}
