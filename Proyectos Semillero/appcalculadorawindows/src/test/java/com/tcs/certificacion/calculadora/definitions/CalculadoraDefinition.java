package com.tcs.certificacion.calculadora.definitions;



import com.tcs.certificacion.calculadora.drivers.OwnRemoteWindowsDriver;
import com.tcs.certificacion.calculadora.tasks.Operaciones;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CalculadoraDefinition {
	
	private Actor julian = Actor.named("Julian Villa");
	
	@Given("^julian este en la calculadora de windows$")
	public void julianEsteEnLaCalculadoraDeWindows()  {
	    // Write code here that turns the phrase above into concrete actions
	    julian.can(BrowseTheWeb.with(OwnRemoteWindowsDriver.hisBrowser().on()));
	}

	@When("^realice la operacion (.*),(.*),(.*)$")
	public void realiceLaOperacion(String numero, String operador, String numero2)  {
	    // Write code here that turns the phrase above into concrete actions
	    julian.attemptsTo(Operaciones.aritmeticas(numero,operador,numero2));
	}

	@Then("^podra ver el resultado(.*)$")
	public void podraVerElResultado(String resultado)  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
