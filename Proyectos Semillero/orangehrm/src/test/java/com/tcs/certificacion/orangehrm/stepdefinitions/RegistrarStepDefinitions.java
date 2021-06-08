package com.tcs.certificacion.orangehrm.stepdefinitions;

import java.util.List;
import java.util.Map;

import com.tcs.certificacion.orangehrm.taks.IrARegistroUser;
import com.tcs.certificacion.orangehrm.taks.Loguearse;
import com.tcs.certificacion.orangehrm.util.drivers.MyDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegistrarStepDefinitions {

	Actor actor;
	@Given("^que el adminsitrador esta en la pagina de registro$")
	public void queElAdminsitradorEstaEnLaPaginaDeRegistro(Map<String,String>credenciales)  {
	    // Write code here that turns the phrase above into concrete actions
	    actor=Actor.named(credenciales.get("username"));
	    actor.can(BrowseTheWeb.with(MyDriver.web().
	    		enLaPagina("https://orangehrm-demo-6x.orangehrmlive.com")));
	    actor.attemptsTo(Loguearse.conUsuario(credenciales.get("username"), credenciales.get("contrasena")));
	    actor.attemptsTo(IrARegistroUser.ir());
	}

	@When("^el registra un usuario$")
	public void elRegistraUnUsuario(Map<String,String>credendiales)  {
	    // Write code here that turns the phrase above into concrete actions
	   
		
	}

	@Then("^el podra ver un mensaje de exito$")
	public void elPodraVerUnMensajeDeExito()  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
	    
	}
}
