package com.tcs.certificacion.CalculadoraWindows.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import com.tcs.certificacion.CalculadoraWindows.questions.VerResulltado;
import com.tcs.certificacion.CalculadoraWindows.tasks.Adicionar;
import com.tcs.certificacion.CalculadoraWindows.tasks.Dividir;
import com.tcs.certificacion.CalculadoraWindows.tasks.Multiplicar;
import com.tcs.certificacion.CalculadoraWindows.tasks.Restar;
import com.tcs.certificacion.CalculadoraWindows.tasks.Sumar;
import com.tcs.certificacion.CalculadoraWindows.util.drivers.MyWinAppDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.*;

public class CalculadoraStepDefinitions {

	Actor actor;

	@Given("^que el (.*) se encuentra en la calculadora de Windows$")
	public void queElUsuarioSeEncuentraEnLaCalculadoraDeWindows(String name) {
		actor = Actor.named(name);
		actor.can(BrowseTheWeb.with(MyWinAppDriver.web().enLaAplicacion()));
	}

	@When("^el realiza una suma$")
	public void elRealizaUnaSuma(List<List<String>> datos) {
		actor.attemptsTo(Sumar.conNumero1(datos.get(1).get(0)).conNumero2(datos.get(1).get(1)));
	}

	@When("^el realiza una multiplicar$")
	public void elRealizaUnaMultiplicar(List<List<String>> datos) {
		actor.attemptsTo(Multiplicar.conNumero1(datos.get(1).get(0)).conNumero2(datos.get(1).get(1)));
	}

	@When("^el realiza una division$")
	public void elRealizaUnaDivision(List<List<String>> datos) {
		actor.attemptsTo(Dividir.conNumero1(datos.get(1).get(0)).conNumero2(datos.get(1).get(1)));
	}

	@When("^el realiza una resta$")
	public void elRealizaUnaResta(List<List<String>> datos) {
		actor.attemptsTo(Restar.conNumero1(datos.get(1).get(0)).conNumero2(datos.get(1).get(1)));
	}

	@When("^realiza una (.*) sobre la operacion anterior (.*)$")
	public void realizaUnaSumaSobreLaOperacionAnterior(String operacion,String numero) {
		actor.attemptsTo(Adicionar.operacion(operacion, numero));
	}

	@Then("^el podra ver el resultado: (.*)$")
	public void elPodraVerElResultado(int resultado) {
		actor.should(seeThat(VerResulltado.deOperacion(), Matchers.is("Se muestra " + resultado)));
	}

}
