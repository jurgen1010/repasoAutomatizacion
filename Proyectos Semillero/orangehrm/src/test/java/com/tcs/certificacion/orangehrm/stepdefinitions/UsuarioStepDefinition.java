package com.tcs.certificacion.orangehrm.stepdefinitions;

import com.tcs.certificacion.orangehrm.taks.Loguearse;
import com.tcs.certificacion.orangehrm.util.drivers.MyDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class UsuarioStepDefinition {

	Actor actor;
	@Given("^que el (.*) está en la pagina Orangehrm$")
	public void queElEstáEnLaPaginaOrangehrm(String nombre)  {
		  actor=Actor.named(nombre);
		    actor.can(BrowseTheWeb.with(MyDriver.web()
		    		.enLaPagina("https://orangehrm-demo-6x.orangehrmlive.com")));  
	}

	@When("^el ingresa un usuario (.*) y una contraseña (.*)$")
	public void elIngresaUnUsuarioAdminYUnaContraseñaAdmin(String usuario, String contraseña)  {
	    actor.attemptsTo(Loguearse.conUsuario(usuario, contraseña));
	    
	    
	}

	@Then("^el usuario visualiza el nombre (.*)$")
	public void elUsuarioVisualizaElNombreJacquelineWhite(String nombre)  {
	    // 
	    
	}
}
