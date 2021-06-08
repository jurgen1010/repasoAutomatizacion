package com.bancolombia.myextra.interactions;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.objects.TargetMyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class OpenMyExtra implements Interaction{

	private String rutaEdp;
	private Long wait=(long)4000 ;
	private MyExtra myExtra;
	
	public OpenMyExtra(String rutaEdp) {
		this.rutaEdp=rutaEdp;
	}
	public OpenMyExtra(String rutaEdp,MyExtra myExtra) {
		this.rutaEdp=rutaEdp;
		this.myExtra=myExtra;
	}
	
	@Step("{0} open MyExtra with session #rutaEdp")
	public <T extends Actor> void performAs(T actor) {
		if(myExtra==null)
		MyExtra.iniciarMyExtra(rutaEdp, wait);
		else
			MyExtra.iniciarMyExtra(rutaEdp, wait, myExtra);
	}
	
	public static OpenMyExtra withSession(String rutaEdp) {
		return Tasks.instrumented(OpenMyExtra.class, rutaEdp);
	}
	public static OpenMyExtra withSessionPropia(String rutaEdp, MyExtra myExtra) {
		return Tasks.instrumented(OpenMyExtra.class, rutaEdp,myExtra);
	}

	public OpenMyExtra andWait(Long wait) {
		this.wait=wait;
		return this;
	}
}
