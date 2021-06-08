package com.tcs.certificacion.calculadoradefinitions;

import com.tcs.certificacion.calculadora.drivers.OwnRemoteAppiumDriver;
import com.tcs.certificacion.calculadora.tasks.Suma;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CalculadoraDefinition {
	
	private Actor julian=Actor.named("Julian Villa");
	
	@Given("^julian se encuentra en la calculadora del celular$")
	public void julianSeEncuentraEnLaCalculadoraDelCelular()  {
	    // Write code here that turns the phrase above into concrete actions
	    julian.can(BrowseTheWeb.with(OwnRemoteAppiumDriver.hisBrowser().on()));
	}

	@When("^realizao la operacion (.*),(.*),(.*)$")
	public void realizaoLaOperacion(String numero, String operador, String numero2)  {
	    // Write code here that turns the phrase above into concrete actions
	    julian.attemptsTo(Suma.numeros(numero, operador, numero2));
	}

	@Then("^puedo visualizar el resultado (.*)$")
	public void puedoVisualizarElResultado(String resultado)  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
