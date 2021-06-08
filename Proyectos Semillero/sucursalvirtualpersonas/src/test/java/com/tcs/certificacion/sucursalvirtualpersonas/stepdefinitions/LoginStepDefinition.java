package com.tcs.certificacion.sucursalvirtualpersonas.stepdefinitions;


import java.util.List;

import org.openqa.selenium.WebDriver;

import com.tcs.certificacion.sucursalvirtualpersonas.models.Credenciales;
import com.tcs.certificacion.sucursalvirtualpersonas.tasks.Abrir;
import com.tcs.certificacion.sucursalvirtualpersonas.tasks.IrA;
import com.tcs.certificacion.sucursalvirtualpersonas.tasks.Loguearse;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.actors.OnStage.*;
public class LoginStepDefinition {
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast());
		
	}
	
	@Dado("^que (.*) está en la página (.*)$")
	public void queJurgenEstaEnLaPaginaBancolombiaSucursalVirtualPersonas(String name, String pagina)  {
	    theActorCalled(name).can(BrowseTheWeb.with(driver));
	    theActorInTheSpotlight().wasAbleTo(Abrir.elNavegador(),
	    		IrA.sucursalVirtualPersonas(pagina));
	    
	}

	@Cuando("^él ingresa sus credenciales$")
	public void elIngresaSusCredenciales(List<Credenciales> credenciales)  {
	    theActorInTheSpotlight().attemptsTo(Loguearse.conElUsuario(credenciales.get(0).getUsuario())
	    								.yConClave(credenciales.get(0).getClave()));
	    
	    
	}

	@Entonces("^él debe visualizar el mensaje Usuario o clave inválida\\. Por favor intente de nuevo\\.$")
	public void elDebeVisualizarElMensajeUsuarioOClaveInvalidaPorFavorIntenteDeNuevo()  {
	    
	    
	}
}
