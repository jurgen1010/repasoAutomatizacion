package com.google.certificacion.googletraductor.definitions;

import static org.junit.Assert.assertEquals;

import com.google.certificacion.googletraductor.pages.TraductorGooglePage;
import com.google.certificacion.googletraductor.steps.IngresarAppTraductor;
import com.google.certificacion.googletraductor.steps.Traductor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TraductorDefinitions {
	
	@Steps
	IngresarAppTraductor ingresarapptraductor;
	
	@Steps
	Traductor traductor;
	

	@Given("^que Jhoan esta en el traductor de Google.")
	public void queJhoanEstaEnElTraductorDeGoogle() {
		
		ingresarapptraductor.abrirNavegador();
		ingresarapptraductor.abrirAppTraductor();

	}

	@When("^el escribe la palabra (.*) del idioma (.*) al idioma (.*)")
	public void elEscribeLaPalabraHolaDelIdiomaEspaOlAlIdiomaIngles(String palabra,String idiomaOrigen, String idiomaDestino) {
		
		traductor.seleccionarIdiomaOrigen(idiomaOrigen);
		traductor.seleccionarIdiomaDestino(idiomaDestino);
		traductor.escribirTraduccion(palabra);
		
	}

	@Then("^el podra ver la palabra (.*)")
	public void elPodraVerLaPalabraHello(String traducida){
		
		assertEquals(traducida, traductor.palabraTraduccion());
		
	}

}
