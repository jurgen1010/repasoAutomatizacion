package com.tcs.certificacion.AdvantageShoping.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import com.tcs.certificacion.AdvantageShopping.questions.VerCantidadProducto;
import com.tcs.certificacion.AdvantageShopping.questions.VerMensajeDisponibilidad;
import com.tcs.certificacion.AdvantageShopping.questions.VerPrecioProducto;
import com.tcs.certificacion.AdvantageShopping.tasks.AgregarProducto;
import com.tcs.certificacion.AdvantageShopping.tasks.AgregarProductoCanasto;
import com.tcs.certificacion.AdvantageShopping.tasks.IrACategoria;
import com.tcs.certificacion.AdvantageShopping.tasks.SeleccionarCantidad;
import com.tcs.certificacion.AdvantageShopping.tasks.SeleccionarProducto;
import com.tcs.certificacion.AdvantageShopping.util.drivers.MyDriverChrome;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class InventarioProductosStepDefinitions {

	 Actor actor;
	 @Given("^que el usuario ha selecciona un producto$")
	 public void queElUsuarioHaSeleccionaUnProducto(List<List<String>>datos) throws InterruptedException  {
	    actor=Actor.named("usuario");
		actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	    Thread.sleep(4000);
	    actor.wasAbleTo(IrACategoria.deProducto(datos.get(1).get(0)),SeleccionarProducto.conNombre(datos.get(1).get(1)));


	    
	}

	 @When("^el agrega al canasto cierta cantidad del producto$")
	 public void elAgregaAlCanastoCiertaCantidadDelProducto(Map<String,String>datos)  {
	  
		actor.attemptsTo(SeleccionarCantidad.deProducto(datos.get("cantidad")));
		actor.attemptsTo(AgregarProductoCanasto.alCanasto());
	}

	@Then("^el podra ver el precio acorde a la cantidad agregada$")
	public void elPodraVerElPrecioAcordeALaCantidadAgregada(Map<String,String>datos)  {
	    actor.should(seeThat(VerPrecioProducto.enVentanaDetalle(), Matchers.is(datos.get("precioesperado"))));
	    
	}
	@When("^el agrega al canasto cierta cantidad del producto no disponible en stock$")
	public void elAgregaAlCanastoCiertaCantidadDelProductoNoDisponibleEnStock(Map<String,String>datos)  {
		actor.attemptsTo(SeleccionarCantidad.deProducto(datos.get("cantidad")));
		actor.attemptsTo(AgregarProducto.alCanasto());
	   
	}

	@Then("^el podra ver un mensaje de advertencia$")
	public void elPodraVerUnMensajeDeAdvertencia(Map<String,String>datos)  {
	    
	   actor.should(seeThat(VerMensajeDisponibilidad.deStock(), Matchers.is(datos.get("visibilidadmensaje"))));
	}

	@Then("^solo la cantidad de producto disponible agregada al canasto$")
	public void soloLaCantidadDeProductoDisponibleAgregadaAlCanasto(Map<String,String>datos)  {
		actor.should(seeThat(VerCantidadProducto.enVentanaDetalle(), Matchers.is("QTY: "+datos.get("cantidadagregada"))));
	}
}
