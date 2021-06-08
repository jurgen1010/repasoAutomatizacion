package com.tcs.certificacion.buscargooglesp.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers;

import com.tcs.certificacion.buscargooglesp.questions.Leyendo;
import com.tcs.certificacion.buscargooglesp.tasks.BuscarEnGoogle;
import com.tcs.certificacion.buscargooglesp.util.drivers.MyDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class BusquedaStepDefinitions {
	
	Actor actor;

	@Given("^que (.*) esta en la pagina google$")
	public void queAlejandroEstaEnLaPaginaGoogle(String name) {
	    actor= Actor.named(name);
	    actor.can(BrowseTheWeb.with(MyDriver.web()
	    		.enLaPagina("https://www.google.com.co")));
	}


	@When("^el busca la expresion (.*)$")
	public void elBuscaLaExpresionScreenplayBdd(String expresion) {
	   actor.attemptsTo(BuscarEnGoogle.laExpresion(expresion));
	   //actor.wasAbleTo(todos);
	}

	@Then("^el podra ver la url (.*)$")
	public void elPodraVerLaUrl(String url) {
		actor.should(seeThat(Leyendo.laUrl(), is(url)));
	}
}
