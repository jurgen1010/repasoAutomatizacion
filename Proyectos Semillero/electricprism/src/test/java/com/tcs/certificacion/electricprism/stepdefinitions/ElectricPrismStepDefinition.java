package com.tcs.certificacion.electricprism.stepdefinitions;

import java.net.MalformedURLException;
import java.util.List;

import com.tcs.certificacion.electricprism.models.Datos;
import com.tcs.certificacion.electricprism.tasks.IngresarFechas;
import com.tcs.certificacion.electricprism.util.drivers.MyDriverRemote;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ElectricPrismStepDefinition {

	Actor actor;
	@Given("^que el (.*) se encuenta la pagina electricprism$")
	public void queElUsuarioSeEncuentaLaPaginaElectricprism(String name) throws MalformedURLException  {
	   actor=Actor.named(name);
	   actor.can(BrowseTheWeb.with(MyDriverRemote.web().enLaPagina("http://www.electricprism.com/aeron/calendar/")));
	   
	    
	}

	@When("^el ingresa las fechas$")
	public void elIngresaLasFechas(List<Datos>datos)  {
	    actor.attemptsTo(IngresarFechas.enDefault(datos.get(0).getFechaDefault())
	    								.enDashBoard(datos.get(0).getFechaDashboard())
	    								.enExperimental(datos.get(0).getFechaExperimental()));
	    
	}

	@Then("^el podra ver las fechas en cada uno de los campos\\.$")
	public void elPodraVerLasFechasEnCadaUnoDeLosCampos()  {
	    
	    
	}
}
