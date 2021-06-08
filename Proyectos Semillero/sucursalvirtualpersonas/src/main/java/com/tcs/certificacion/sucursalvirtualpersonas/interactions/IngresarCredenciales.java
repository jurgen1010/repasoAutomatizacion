package com.tcs.certificacion.sucursalvirtualpersonas.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.tcs.certificacion.sucursalvirtualpersonas.userinterfaces.Login;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarCredenciales implements Interaction{

	private String clave ;
	private Target target;
	public IngresarCredenciales(Target target) {
		this.target=target;
	}
	
	//@SuppressWarnings("static-access")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		WebElement elemento= target.resolveFor(actor);
		BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].click();",elemento);
		
		
//		List<WebElementFacade> botones = Login.BTN_NUMERO.resolveAllFor(actor);
//		List<WebElementFacade> txtbotones = Login.TXT_BTN_NUMERO.resolveAllFor(actor);
//		
//		JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
//		for (int i = 0; i < clave.length(); i++) {
//			for (int j = 0; j < txtbotones.size(); j++) {
//				if(clave.valueOf(i).equals(txtbotones.get(j).getText()));{
//					js.executeScript(botones.get(j).getAttribute("onclick"));
//				}
//			}
//		}
		
	}
//	public static IngresarCredenciales conClave(String clave) {
//		return instrumented(IngresarCredenciales.class, clave);
//	}
	public static IngresarCredenciales conClave(Target target) {
		return instrumented(IngresarCredenciales.class, target);
	}
	
}
