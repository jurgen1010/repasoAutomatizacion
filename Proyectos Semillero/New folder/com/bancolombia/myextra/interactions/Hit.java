package com.bancolombia.myextra.interactions;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.objects.TargetMyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Hit implements Interaction{

	private String key;
	private long wait=0;
	private MyExtra myExtra;
	
	public Hit(String key) {
		this.key=key;
	}
	
	@Step("{0} sendkey #key")
	public <T extends Actor> void performAs(T actor) {
		if(myExtra==null)
		MyExtra.sesion().EnviarTeclas(key, wait);
		else
			myExtra.EnviarTeclas(key, wait, myExtra);
	}
	
	public static Hit theKey(String key) {
		return Tasks.instrumented(Hit.class, key);
	}

	public Hit andWait(Long wait) {
		this.wait=wait;
		return this;
	}
	public Hit withSession(MyExtra myExtra) {
		this.myExtra=myExtra;
		return this;
	}
}
