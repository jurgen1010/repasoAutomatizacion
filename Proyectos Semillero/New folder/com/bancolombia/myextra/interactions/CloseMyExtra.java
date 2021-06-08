package com.bancolombia.myextra.interactions;

import com.bancolombia.myextra.controller.MyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class CloseMyExtra implements Interaction{
	private MyExtra myExtra;
	
	public CloseMyExtra(MyExtra myExtra) {
		this.myExtra=myExtra;
		}
	public CloseMyExtra() {
	}
	
	@Step("{0} close MyExtra")
	public <T extends Actor> void performAs(T actor) {	
		if(myExtra==null)
		MyExtra.sesion().cerrarMyExtra();
		else
			myExtra.cerrarMyExtra();
	}
	
	public static CloseMyExtra now() {
		return Tasks.instrumented(CloseMyExtra.class);
	}
	public static CloseMyExtra now(MyExtra myExtra) {
		return Tasks.instrumented(CloseMyExtra.class,myExtra);
	}

}
