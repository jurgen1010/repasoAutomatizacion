package com.google.certificacion.googlebusqueda.definitions;

import com.google.certificacion.googlebusqueda.steps.BuscarGoogle;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaDefinitions {
	@Steps
	BuscarGoogle buscarGoogle;
	
	@Given("^que (.*) esta en la pagina google$")
	public void queAlejandroEstaEnLaPaginaGoogle(String nombre)  {
	    buscarGoogle.abrirNavegador();
	}


	@When("^el busca la expresion (.*)$")
	public void elBuscaLaExpresionScreenplayBdd(String expresion)  {
	    buscarGoogle.buscarGoogle(expresion);
	    
	}

	@Then("^el podra ver la url serenity-bdd\\.info/docs/articles/screenplay-tutorial\\.html$")
	public void elPodraVerLaUrlSerenityBddInfoDocsArticlesScreenplayTutorialHtml()  {
	    System.out.println("se ejecuto el metodo elPodraVerLaUrlSerenityBddInfoDocsArticlesScreenplayTutorialHtml");
	    
	}
}
