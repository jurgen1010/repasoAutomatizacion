package com.tcs.certificacion.AdvantageShoping.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import com.tcs.certificacion.AdvantageShopping.interactions.IngresarCantidad;
import com.tcs.certificacion.AdvantageShopping.questions.VerBotonBuyNow;
import com.tcs.certificacion.AdvantageShopping.questions.VerCantidadDeProducto;
import com.tcs.certificacion.AdvantageShopping.questions.VerEspecificacionesDeProducto;
import com.tcs.certificacion.AdvantageShopping.questions.VerImagenesDeProducto;
import com.tcs.certificacion.AdvantageShopping.questions.VerSeleccionColor;
import com.tcs.certificacion.AdvantageShopping.tasks.IrACategoria;
import com.tcs.certificacion.AdvantageShopping.tasks.SeleccionarCantidad;
import com.tcs.certificacion.AdvantageShopping.tasks.SeleccionarColor;
import com.tcs.certificacion.AdvantageShopping.tasks.SeleccionarProducto;
import com.tcs.certificacion.AdvantageShopping.util.drivers.MyDriverChrome;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SeleccionProductoStepDefinition {

	Actor actor;
	@Given("^que el (.*) se encuentra en la pagina  de Advantage Demo$")
	public void queElAdministradorSeEncuentraEnLaPaginaDeAdvantageDemo(String name)  {
	   actor=Actor.named(name) ;
	   actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	  
	}

	@When("^el selecciona la categoria speakers$")
	public void elSeleccionaLaCategoriaSpeakers(Map<String,String>datos) throws InterruptedException  {
		 Thread.sleep(2000);
	    actor.attemptsTo(IrACategoria.deProducto(datos.get("categoria")));
	}
	@When("^el selecciona la categoria mices$")
	public void elSeleccionaLaCategoriaMices(Map<String,String>datos) throws InterruptedException  {
		Thread.sleep(2000);
	    actor.attemptsTo(IrACategoria.deProducto(datos.get("categoria")));
	    
	}

	@When("^el selecciona la categoria tablets$")
	public void elSeleccionaLaCategoriaTablets(Map<String,String>datos) throws InterruptedException  {
		Thread.sleep(2000);
	    actor.attemptsTo(IrACategoria.deProducto(datos.get("categoria")));
	    
	}
	

	@When("^el selecciona la categoria laptops$")
	public void elSeleccionaLaCategoriaLaptops(Map<String,String>datos) throws InterruptedException  {
		Thread.sleep(2000);
	    actor.attemptsTo(IrACategoria.deProducto(datos.get("categoria")));
	    
	}

	@When("^el selecciona la categoria headphones$")
	public void elSeleccionaLaCategoriaHeadphones(Map<String,String>datos) throws InterruptedException  {
		Thread.sleep(2000);
	    actor.attemptsTo(IrACategoria.deProducto(datos.get("categoria")));
	    
	}

	@Then("^el podra ver el boton buy now dentro de la categoria$")
	public void elPodraVerElBotonBuyNowDentroDeLaCategoria(Map<String,Boolean>datos) throws InterruptedException  {
		Thread.sleep(2000);
		actor.should(seeThat(VerBotonBuyNow.enEstado(), Matchers.is(datos.get("visibildadboton"))));
	    
	}
	@Given("^que el Administrador selecciona una categoria$")
	public void queElAdministradorSeleccionaUnaCategoria(List<List<String>>datos) {
		actor=Actor.named("Administrador");
	   actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	   System.out.println("VALOR:"+datos.get(1).get(0));
	   actor.wasAbleTo(IrACategoria.deProducto(datos.get(1).get(0)));
	}

	@When("^el selecciona un producto dentro de la categoria$")
	public void elSeleccionaUnProductoDentroDeLaCategoria(List<List<String>>datos) {
		System.out.println(datos.get(1).get(0));
	    actor.attemptsTo(SeleccionarProducto.conNombre(datos.get(1).get(0)));
	    
	}

	@Then("^el podra ver las diferentes vistas del producto$")
	public void elPodraVerLasDiferentesVistasDelProducto(List<List<Boolean>>datos) {
	   actor.should(seeThat(VerImagenesDeProducto.seleccionado(), Matchers.is(datos.get(1).get(0))));
	}
	@Given("^que el Administrador selecciona un producto dentro de la categoria$")
	public void queElAdministradorSeleccionaUnProductoDentroDeLaCategoria(List<List<String>>datos) throws InterruptedException  {
	    actor= Actor.named("Administrador");
	    actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	    Thread.sleep(3000);
	    actor.attemptsTo(IrACategoria.deProducto(datos.get(1).get(0)), SeleccionarProducto.conNombre(datos.get(1).get(1)));
	    
	    
	}

	@When("^el selecciona el color del producto$")
	public void elSeleccionaElColorDelProducto(List<List<String>>datos) throws InterruptedException  {
	    actor.attemptsTo(SeleccionarColor.deProducto(datos.get(1).get(0)));
	    Thread.sleep(2000);
	}

	@Then("^el podra ver el color seleccionado$")
	public void elPodraVerElColorSeleccionado(List<List<String>>datos)  {
	    
		
	    actor.should(seeThat(VerSeleccionColor.deProducto(), Matchers.is(datos.get(1).get(0))));
	}
	@When("^el selecciona la cantidad del producto$")
	public void elSeleccionaLaCantidadDelProducto(List<List<String>>datos)  {
		System.out.println(datos.get(1).get(0));
	   actor.attemptsTo(SeleccionarCantidad.deProducto(datos.get(1).get(0)));
	}

	@Then("^el podra ver la cantidad seleccionada$")
	public void elPodraVerLaCantidadSeleccionada(List<List<String>>datos)  {
	   actor.should(seeThat(VerCantidadDeProducto.ingresada(), Matchers.is(datos.get(1).get(0))));
	}
	@Then("^el podra ver las especificaciones del producto$")
	public void elPodraVerLasEspecificacionesDelProducto(List<List<Boolean>>datos)  {
	    actor.should(seeThat(VerEspecificacionesDeProducto.seleccionado(), Matchers.is(datos.get(1).get(0))));
	}
}
