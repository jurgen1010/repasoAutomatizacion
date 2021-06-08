package com.bancolombia.certificacion.banistmo.stepdefinitions;

import static com.bancolombia.certificacion.banistmo.models.Datos.leerData;

import com.bancolombia.certificacion.banistmo.models.Datos;
import com.bancolombia.certificacion.banistmo.tasks.IrASucursalVirtual;
import com.bancolombia.certificacion.banistmo.tasks.Loguearse;
import com.bancolombia.certificacion.banistmo.tasks.IrATransferencia;
import com.bancolombia.certificacion.banistmo.util.drivers.MyDriverChrome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TransferenciaStepDefinition {

	Actor actor;

	@Given("^que (.*) esta en la pagina de transferencias cuentas propias$")
	public void queJurgenEstaEnLaPaginaDeTransferenciasCuentasPropias(String name) {
		Datos.leerData();
		actor= Actor.named(name);
		actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("https://svpbanistmo.qa.todo1.com/login/index")));
		
		actor.wasAbleTo(IrASucursalVirtual.banistmo(),Loguearse.conUsuario(Datos.getUsuario())
							.conContrasena(Datos.getContrasena()),IrATransferencia.aCuentasPropias());
	
	}

	@When("^el realiza la transferencia$")
	public void elRealizaLaTransferencia() {
		
		

	}

	@Then("^el vera los saldos de sus cuentas actualizados$")
	public void elVeraLosSaldosDeSusCuentasActualizados() {
		

	}
}
