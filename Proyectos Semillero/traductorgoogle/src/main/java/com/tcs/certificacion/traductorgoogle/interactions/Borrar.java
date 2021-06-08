package com.tcs.certificacion.traductorgoogle.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class Borrar implements Interaction{

	private Target target;
	
	public Borrar(Target target) {
		this.target=target;
	}

	public <T extends Actor> void performAs(T actor) {
		target.resolveFor(actor).clear();
		
	}
	
	public static Borrar campo(Target target) {
		return new Borrar(target);
	}

}
