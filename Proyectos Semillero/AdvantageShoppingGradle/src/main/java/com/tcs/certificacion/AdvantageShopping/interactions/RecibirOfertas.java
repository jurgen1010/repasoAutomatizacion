package com.tcs.certificacion.AdvantageShopping.interactions;

import org.openqa.selenium.WebElement;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class RecibirOfertas implements Interaction{

	
	 private  Target target;
	 private String receiveoffers;
	
	public RecibirOfertas(Target target ,String receiveoffers) {
		
		this.target=target;
		this.receiveoffers=receiveoffers;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement elemento = target.resolveFor(actor);
		if (receiveoffers.equals("no")) {
			elemento.click();
		}
		
	}
	
	public static RecibirOfertas deLaPagina(Target target,String receiveoffers) {
		return Tasks.instrumented(RecibirOfertas.class,target,receiveoffers);
	}

}
