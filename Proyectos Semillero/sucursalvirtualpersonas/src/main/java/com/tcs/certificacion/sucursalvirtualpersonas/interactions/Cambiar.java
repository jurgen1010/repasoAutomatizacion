package com.tcs.certificacion.sucursalvirtualpersonas.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Set;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Cambiar implements Interaction{
	private String nombre;
	
	public Cambiar(String nombre) {
		this.nombre=nombre;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Set<String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
		for (String handle: handles) {
		 if(BrowseTheWeb.as(actor).getDriver().switchTo().window(handle).getTitle().equals(nombre)) {
			 break;
		 }
		}
		//System.out.println(handles);
		
		
		//BrowseTheWeb.as(actor).getDriver().switchTo().frame("demo");
	}
	
	public static  Cambiar deVentana(String nombre) {
		return instrumented(Cambiar.class, nombre);
	}
	

}
