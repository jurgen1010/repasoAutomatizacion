package com.tcs.certificacion.traductorgoogle.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import com.tcs.certificacion.traductorgoogle.questions.LeerPalabra;
import com.tcs.certificacion.traductorgoogle.task.Seleccionar;
import com.tcs.certificacion.traductorgoogle.task.Traducir;
import com.tcs.certificacion.traductorgoogle.util.drivers.MyDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TraductorStepDefinition {
	Actor alejandro = Actor.named("Alejandro");
	@Given("^que (.*) esta en la pagina de (.*) de google$")
	public void queAlejandroEstaEnLaPaginaDeTraductorDeGoogle(String name, String app) {
	    alejandro.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("https://www.google.com.co")));
	    alejandro.wasAbleTo(Seleccionar.laApp(app));
	}


	@When("^el traduce con los datos$")
	public void elTraduceConLosDatos(List<List<String>> datos) {
	    alejandro.attemptsTo(Traducir.laPalabra(datos.get(1).get(0)).
	    		conElIdiomaOrigen(datos.get(1).get(1)).
	    		yElIdiomaDestino(datos.get(1).get(2)));
	}

	@Then("^el podra ver la palabra (.*)$")
	public void elPodraVerLaPalabraHelloWorld(String palabraEsperada) {
	    alejandro.should(seeThat(LeerPalabra.traducida(), is(palabraEsperada)));
	    
	}
}