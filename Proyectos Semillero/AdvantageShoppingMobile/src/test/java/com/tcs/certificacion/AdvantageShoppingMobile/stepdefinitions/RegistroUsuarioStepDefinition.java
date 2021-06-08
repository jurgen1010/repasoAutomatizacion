package com.tcs.certificacion.AdvantageShoppingMobile.stepdefinitions;

import java.net.MalformedURLException;
import java.util.List;

import com.tcs.certificacion.AdvantageShoppingMobile.util.drivers.MyAndroidDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegistroUsuarioStepDefinition {

	Actor jurgen = Actor.named("Jurgen");
	@Given("^que el administrador se encuentra en la pagina de registro$")
	public void queElAdministradorSeEncuentraEnLaPaginaDeRegistro() throws MalformedURLException  {
	
		jurgen.can(BrowseTheWeb.with(MyAndroidDriver.installApp().getDriver()));
		//jurgen.can(BrowseTheWeb.with(MyAndroidDriver.uninstallApp().getDriver()));
	    
	}

	@When("^el registra un usuario$")
	public void elRegistraUnUsuario(List<List<String>> datos)  {
	    
	    
	}

	@Then("^el podra ver su nombre de usuario en pantalla$")
	public void elPodraVerSuNombreDeUsuarioEnPantalla(List<List<String>> datos)  {
	    
	   
	    
	}
}
