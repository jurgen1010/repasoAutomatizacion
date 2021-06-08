package com.tcs.certificacion.AdvantageShopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LeerUrl implements Question<String>{

	
	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).getDriver().getCurrentUrl().toString();
	}
	public static LeerUrl deLaVentana() {
		return new LeerUrl();
	}

}
