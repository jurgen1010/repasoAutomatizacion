package com.tcs.certificacion.calculadoramultiplataforma.stepdefinitions;

import java.net.MalformedURLException;

import com.tcs.certificacion.calculadoramultiplataforma.questions.ElResultadoOperacionAndroid;
import com.tcs.certificacion.calculadoramultiplataforma.questions.ElResultadoOperacionEscritorio;
import com.tcs.certificacion.calculadoramultiplataforma.questions.ElResultadoOperacionWeb;
import com.tcs.certificacion.calculadoramultiplataforma.questions.ValidacionResultados;
import com.tcs.certificacion.calculadoramultiplataforma.tasks.OperacionAndroid;
import com.tcs.certificacion.calculadoramultiplataforma.tasks.OperacionEscritorio;
import com.tcs.certificacion.calculadoramultiplataforma.tasks.OperacionWeb;
import com.tcs.certificacion.calculadoramultiplataforma.util.driver.MyAndroidDriver;
import com.tcs.certificacion.calculadoramultiplataforma.util.driver.MyWebDriver;
import com.tcs.certificacion.calculadoramultiplataforma.util.driver.MyWindowsDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CalculadorasStepDefinition {

	private Actor mateo =Actor.named("Mateo");
	private Actor jurgen =Actor.named("Jurgen");
	private Actor jhosi =Actor.named("Jhosi");
	@Given("^que el usuario abre la calculadora web, movil y desktop$")
	public void queElUsuarioAbreLaCalculadoraWebMovilYDesktop() throws MalformedURLException  {
	    
	    mateo.can(BrowseTheWeb.with(MyWebDriver.web().enLaPagina("https://www.google.com.co/search?q=calculadora&rlz=1C1GCEB_enCO824CO824&oq=calculadora&aqs=chrome..69i57j0l5.2190j0j8&sourceid=chrome&ie=UTF-8")));
	    jurgen.can(BrowseTheWeb.with(MyAndroidDriver.enLaApp().Android()));
	    jhosi.can(BrowseTheWeb.with(MyWindowsDriver.enLaAplicacion().escritorio()));
	}


	@When("^el usuario realiza una suma con el numero (.*) y el numero (.*) en la calculadora web$")
	public void elUsuarioRealizaUnaSumaConElNumeroYElNumeroEnLaCalculadoraWeb(String numeroA, String numeroB)  {
	    
	    mateo.attemptsTo(OperacionWeb.conNumeroA(numeroA)
	    							  .conNumeroB(numeroB));
	}

	@When("^el usuario realiza una suma con el numero (.*) y el numero (.*) en la calculadora movil$")
	public void elUsuarioRealizaUnaSumaConElNumeroYElNumeroEnLaCalculadoraMovil(String numeroA, String numeroB)  {
	    jurgen.attemptsTo(OperacionAndroid.conNumeroA(numeroA)
	    								   .conNumeroB(numeroB));
	    
	}

	@When("^el usuario realiza una suma con el numero (.*) y el numero (.*) en la calculadora desktop$")
	public void elUsuarioRealizaUnaSumaConElNumeroYElNumeroEnLaCalculadoraDesktop(String numeroA, String numeroB)  {
	    
	    jhosi.attemptsTo(OperacionEscritorio.conNumeroA(numeroA)
	    					                .conNumeroB(numeroB));
	}

	@Then("^los tres resultados deberian ser (.*)$")
	public void losTresResultadosDeberianSer(String resultado)  {
	    
	    mateo.should(seeThat(ElResultadoOperacionWeb.es(), equalTo(resultado)));
	    mateo.remember("resultadoweb", resultado);
	    jurgen.should(seeThat(ElResultadoOperacionAndroid.es(), equalTo(resultado)));
	    jurgen.remember("resultadomovil", resultado);
	    jhosi.should(seeThat(ElResultadoOperacionEscritorio.es(), equalTo("Se muestra "+resultado)));
	    jhosi.remember("resultadowindows", resultado);
	    //jhosi.remember("resultadowindows", ElResultadoOperacionEscritorio.es());
	    //jhosi.remember("resultadowindows", "16");
	    System.out.println(jhosi.recall("resultadowindows").toString());
	}

	@Then("^deberian ser iguales en todas las plataformas$")
	public void deberianSerIgualesEnTodasLasPlataformas()  {
	    
	    mateo.should(seeThat(ValidacionResultados.es(mateo, jurgen, jhosi), equalTo(true)));
	}
}
