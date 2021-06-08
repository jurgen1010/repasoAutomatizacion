package com.google.certificacion.googlebusqueda.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.BuscarGoogle;

public class BusquedaDefinitions {
	
	@Steps
	BuscarGoogle buscarGoogle;
	
	@Given("^que (.*) esta en la pagina google$")
	public void queJurgenEstaEnLaPaginaGoogle(String nombre)  {
	    
	    
	    buscarGoogle.abrirNavegador();
	}

	@When("^el busca la expresion (.*)")
	public void elBuscaLaExpresionScreenplayBdd (String expresion)  {
	   
		buscarGoogle.buscarGoogle(expresion);
	}

	@Then("^el podra ver la url (.*)")
	public void elPodraVerLaUrlSerenityBddInfoDocsArticlesScreenplayTutorialHtml(String pagina)  {
	    System.out.println("Se ejecuto el metodo elPodraVerLaUrlSerenityBddInfoDocsArticlesScreenplayTutorialHtml");
	}
}
