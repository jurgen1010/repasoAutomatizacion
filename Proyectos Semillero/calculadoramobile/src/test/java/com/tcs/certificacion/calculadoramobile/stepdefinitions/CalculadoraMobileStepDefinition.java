package com.tcs.certificacion.calculadoramobile.stepdefinitions;

import java.net.MalformedURLException;
import java.util.List;

import org.hamcrest.Matchers;

import com.tcs.certificacion.calculadoramobile.questions.VerResultado;
import com.tcs.certificacion.calculadoramobile.tasks.Sumar;
import com.tcs.certificacion.calculadoramobile.util.drivers.MyDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CalculadoraMobileStepDefinition {

	Actor actor;
	@Given("^que el (.*) se encuentra en la calculadora del movil android$")
	public void queElUsuarioSeEncuentraEnLaCalculadoraDelMovilAndroid(String name) throws MalformedURLException  {	    
	    actor=Actor.named(name);
	    actor.can(BrowseTheWeb.with(MyDriver.Android().enLaAplicacion()));	   
	}
	@When("^el realiza una suma$")
	public void elRealizaUnaSuma(List<List<String>>datos)  {
	    actor.attemptsTo(Sumar.conNumeroA(datos.get(1).get(0))
	    					  .conNumeroB(datos.get(1).get(1)));	    
	}
	@Then("^el podra ver el resultado: (.*)$")
	public void elPodraVerElResultado(String resultado)  {
	    actor.should(seeThat(VerResultado.deOpeacion(), Matchers.is(resultado)));
	    
	}
}
