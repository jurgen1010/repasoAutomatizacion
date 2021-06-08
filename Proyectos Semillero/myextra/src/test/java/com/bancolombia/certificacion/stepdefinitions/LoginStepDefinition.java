package com.bancolombia.certificacion.stepdefinitions;

import java.util.List;

import org.glassfish.grizzly.nio.SelectorHandlerTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.interactions.CloseMyExtra;
import com.bancolombia.myextra.interactions.OpenMyExtra;
import com.bancolombia.myextra.models.Credenciales;
import com.bancolombia.myextra.questions.Leyendo;
import com.bancolombia.myextra.tasks.IngresarCredenciales;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class LoginStepDefinition {

	Actor actor;
	Actor actor2;
	@Given("^que el (.*) se encuentra en la pagina de logueo$")
	public void queElUsuarioSeEncuentraEnLaPaginaDeLogueo(String name)  {
		actor= Actor.named(name);
	    actor.wasAbleTo(OpenMyExtra.withSession("C:\\Users\\1583722\\Documents\\Micro Focus\\EXTRA!\\sessions\\Mainframe Demo Session.edp"));
//	    actor2=Actor.named("usuario2");
//	    actor2.wasAbleTo(OpenMyExtra.withSessionPropia("C:\\Users\\1583722\\Documents\\Micro Focus\\EXTRA!\\sessions\\AS400 Demo Session.edp", MyExtra.sesion()));
	    
	}


	@When("^el ingresa las credenciales$")
	public void elIngresaLasCredenciales(List<Credenciales>credenciales)  {
	   actor.attemptsTo(IngresarCredenciales.conUsuario(credenciales.get(0).getUsuario())
			   .conContrseña(credenciales.get(0).getContrsena()));
	    
	}

	@Then("^el podra ver el mensaje (.*)$")
	public void elPodraVerElMensajeYouAreNowLogged(String mensaje) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.should(seeThat(Leyendo.elMensaje(), is(mensaje)));
		actor.attemptsTo(CloseMyExtra.now());
	    
	}
}
