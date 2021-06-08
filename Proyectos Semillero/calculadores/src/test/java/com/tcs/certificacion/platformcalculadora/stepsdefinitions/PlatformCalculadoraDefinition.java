package com.tcs.certificacion.platformcalculadora.stepsdefinitions;

import static com.tcs.certificacion.platformcalculadora.drivers.OwnMobileDriver.*;
import static com.tcs.certificacion.platformcalculadora.drivers.OwnWindowsDriver.*;

import com.tcs.certificacion.platformcalculadora.drivers.OwnWebDriver;
import com.tcs.certificacion.platformcalculadora.drivers.OwnWindowsDriver;
import com.tcs.certificacion.platformcalculadora.questions.ElResulatdoOperacionWindows;
import com.tcs.certificacion.platformcalculadora.questions.ElResultadoOperacionMobile;
import com.tcs.certificacion.platformcalculadora.questions.ElResultadoOperacionWeb;
import com.tcs.certificacion.platformcalculadora.questions.LaValidacion;
import com.tcs.certificacion.platformcalculadora.tasks.OperacionMobile;
import com.tcs.certificacion.platformcalculadora.tasks.OperacionWeb;
import com.tcs.certificacion.platformcalculadora.tasks.OperacionWindows;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import static com.tcs.certificacion.platformcalculadora.drivers.OwnWebDriver.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class PlatformCalculadoraDefinition {
	
	private Actor julian = Actor.named("Julian");
	private Actor esteban = Actor.named("Esteban");
	private Actor villa = Actor.named("Villa");
	
	@Given("^que abro la calculadora Web, Mobile y Desktop$")
	public void queAbroLaCalculadoraWebMobileYDesktop()  {
	    // Write code here that turns the phrase above into concrete actions
	    julian.can(BrowseTheWeb.with(hisBrowser().on("https://www.google.com/search?ei=W9dAW4n_KM62zwK2iJfgDQ&q=calculadora&oq=calculadora&gs_l=psy-ab.3..0i67k1l2j0j0i67k1j0i131k1j0l5.22780.24709.0.24935.11.7.0.4.4.0.132.775.0j7.7.0....0...1c.1.64.psy-ab..0.11.810....0.gMcQcVLjsik")));
	    esteban.can(BrowseTheWeb.with(hisApp().on()));
	    villa.can(BrowseTheWeb.with(hisAppWindows().on()));
	}

	@When("^realizo la operacion \\+ con el numero (.*) y el numero (.*) en la web$")
	public void realizoLaOperacionConElNumeroYElNumeroEnLaWeb(String numero, String numero2)  {
	    // Write code here that turns the phrase above into concrete actions
	    julian.attemptsTo(OperacionWeb.operacion(numero, numero2));
	}

	@When("^realizo la operacion \\+ con el numero (.*) y el numero (.*) en el movil$")
	public void realizoLaOperacionConElNumeroYElNumeroEnElMovil(String numero, String numero2)  {
	    // Write code here that turns the phrase above into concrete actions
	    esteban.attemptsTo(OperacionMobile.operacion(numero, numero2));
	}

	@When("^realizo la operacion \\+ con el numero (.*) y el numero (.*) en el escritorio$")
	public void realizoLaOperacionConElNumeroYElNumeroEnElEscritorio(String numero, String numero2)  {
	    // Write code here that turns the phrase above into concrete actions
	    villa.attemptsTo(OperacionWindows.operacion(numero, numero2));
	}

	@Then("^los tres resultados deberian ser (.*)$")
	public void losTresResultadosDeberianSer(String result)  {
	    // Write code here that turns the phrase above into concrete actions
	    julian.should(seeThat(ElResultadoOperacionWeb.es(), equalTo(result)));
	    julian.remember("resultadoweb", result);
	    esteban.should(seeThat(ElResultadoOperacionMobile.es(), equalTo(result)));
	    esteban.remember("resultadomobil", result);
	    villa.should(seeThat(ElResulatdoOperacionWindows.es(), equalTo(result)));
	    villa.remember("resultadowindows", result);
	}

	@Then("^deberian ser iguales en todas las plataformas$")
	public void deberianSerIgualesEnTodasLasPlataformas()  {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println(julian.gaveAsThe("resultadoweb").toString());
//	    System.out.println(esteban.gaveAsThe("resultadomobil").toString());
//	    if(julian.gaveAsThe("resultadoweb").toString().equals(esteban.gaveAsThe("resultadomobil").toString())) {
//	    	
//	    }
		//System.out.println(villa.gaveAsThe("resultadowindows").toString());
		//System.out.println(villa.gaveAsThe("resultadowindows").toString());
		julian.should(seeThat(LaValidacion.es(julian, esteban, villa), equalTo("true")));
		
	}
}
