package com.tcs.certificacion.AdvantageShoping.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import com.tcs.certificacion.AdvantageShopping.questions.LeerUrl;
import com.tcs.certificacion.AdvantageShopping.tasks.IrARedSocial;
import com.tcs.certificacion.AdvantageShopping.util.drivers.MyDriverChrome;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RedesSocialesStepDefinitions {
	Actor actor;
	@Given("^que el (.*) se encuentra en la pagina principal de Advantage Demo$")
	public void queElUsuarioSeEncuentraEnLaPaginaPrincipalDeAdvantageDemo(String name)  {
	    actor=Actor.named(name);
	    actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	    
	}

	
	@When("^el selecciona la opcion de seguimiento facebook$")
	public void elSeleccionaLaOpcionDeSeguimientoFacebook(Map<String, String>datos) throws InterruptedException {
		Thread.sleep(2000);
		actor.attemptsTo(IrARedSocial.conNombre(datos.get("redsocial")));
	    
	}
	@Then("^el podra ver el perfil de la pagina Advantage Demo en facebook$")
	public void elPodraVerElPerfilDeLaPaginaAdvantageDemoEnFacebook(Map<String, String>datos) {
		actor.should(seeThat(LeerUrl.deLaVentana(), is(datos.get("urlperfil"))));
	}
	@When("^el selecciona la opcion de seguimiento twitter$")
	public void elSeleccionaLaOpcionDeSeguimientoTwitter(Map<String, String>datos) throws InterruptedException  {
		Thread.sleep(2000);
		actor.attemptsTo(IrARedSocial.conNombre(datos.get("redsocial")));
	}

	@Then("^el podra ver el perfil de la pagina Advantage Demo en twitter$")
	public void elPodraVerElPerfilDeLaPaginaAdvantageDemoEnTwitter(Map<String, String>datos)  {
		actor.should(seeThat(LeerUrl.deLaVentana(), is(datos.get("urlperfil"))));
	}

	@When("^el selecciona la opcion de seguimiento linkedin$")
	public void elSeleccionaLaOpcionDeSeguimientoLinkedin(Map<String, String>datos) throws InterruptedException  {
		Thread.sleep(2000);
		actor.attemptsTo(IrARedSocial.conNombre(datos.get("redsocial")));
	}

	@Then("^el podra ver el perfil de la pagina Advantage Demo en linkedin$")
	public void elPodraVerElPerfilDeLaPaginaAdvantageDemoEnLinkedin(Map<String, String>datos)  {
		actor.should(seeThat(LeerUrl.deLaVentana(), is(datos.get("urlperfil"))));
	}
	
}
