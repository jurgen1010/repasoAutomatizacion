package com.tcs.certificacion.AdvantageShoping.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import com.tcs.certificacion.AdvantageShopping.models.DatosUsuario;
import com.tcs.certificacion.AdvantageShopping.questions.VerCantidadProducto;
import com.tcs.certificacion.AdvantageShopping.questions.VerImagenProducto;
import com.tcs.certificacion.AdvantageShopping.questions.VerImagenesDeProducto;
import com.tcs.certificacion.AdvantageShopping.questions.VerMensajeCompra;
import com.tcs.certificacion.AdvantageShopping.questions.VerNombreProducto;
import com.tcs.certificacion.AdvantageShopping.questions.VerPaymentMethod;
import com.tcs.certificacion.AdvantageShopping.questions.VerPrecioProducto;
import com.tcs.certificacion.AdvantageShopping.tasks.AgregarProductoCanasto;
import com.tcs.certificacion.AdvantageShopping.tasks.EditarShippingDetails;
import com.tcs.certificacion.AdvantageShopping.tasks.IrACategoria;
import com.tcs.certificacion.AdvantageShopping.tasks.Loguearse;
import com.tcs.certificacion.AdvantageShopping.tasks.PagarProductoMasterCredit;
import com.tcs.certificacion.AdvantageShopping.tasks.PagarProductoSafePay;
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

public class CompraProductoStepDefinition {

	Actor actor;
	@Given("^que el usuario ha seleccionado un producto$")
	public void queElUsuarioHaSeleccionadoUnProducto(List<List<String>>datos) throws InterruptedException  {
	 actor=Actor.named("usuario");
	 actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	 Thread.sleep(3000);
	 actor.wasAbleTo(IrACategoria.deProducto(datos.get(1).get(0)));
	 actor.wasAbleTo(SeleccionarProducto.conNombre(datos.get(1).get(1)));
	 actor.wasAbleTo(SeleccionarColor.deProducto(datos.get(1).get(2)));
	 actor.wasAbleTo(SeleccionarCantidad.deProducto(datos.get(1).get(3)));
	 
	}

	@When("^el agrega el producto al carro de compras$")
	public void elAgregaElProductoAlCarroDeCompras() throws InterruptedException  {
	    
	   actor.attemptsTo(AgregarProductoCanasto.alCanasto());
	   Thread.sleep(2000);
	}

	@Then("^el podra ver la informacion del producto agregado$")
	public void elPodraVerLaInformacionDelProductoAgregado(List<List<String>>datos) throws InterruptedException  {
	    
		actor.should(seeThat(VerNombreProducto.enVentanaDetalle(), Matchers.is(datos.get(1).get(4).toUpperCase())));
//		actor.should(seeThat(VerCantidadProducto.enVentanaDetalle(), Matchers.is("QTY: "+datos.get(1).get(0))));
//		actor.should(seeThat(VerImagenProducto.enVetanaDetalle(), Matchers.is(true)));
//		actor.should(seeThat(VerPrecioProducto.enVentanaDetalle(), Matchers.is(datos.get(1).get(1))));
		
	}
	@Given("^que el usuario se ha logueado en la pagina Advantage Demo con credenciales$")
	public void queElUsuarioSeHaLogueadoEnLaPaginaAdvantageDemoConCredenciales(List<List<String>>datos) throws InterruptedException {
	  actor=Actor.named("usuario");
	  actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	  Thread.sleep(3000);
	  actor.wasAbleTo(Loguearse.conUsuario(datos.get(1).get(0)).conPassword(datos.get(1).get(1)));
	}
	@When("^el agrega un producto al canasto de compra$")
	public void elAgregaUnProductoAlCanastoDeCompra(List<List<String>>datos) throws InterruptedException  {
	   
		actor.attemptsTo(IrACategoria.deProducto(datos.get(1).get(0)),
							SeleccionarProducto.conNombre(datos.get(1).get(1)),
							SeleccionarColor.deProducto(datos.get(1).get(2)),
							SeleccionarCantidad.deProducto(datos.get(1).get(4)),
							AgregarProductoCanasto.alCanasto());
		
	    
	}

	@When("^edita la informacion en la seccion Shipping Details$")
	public void editaLaInformacionEnLaSeccionShippingDetails(List<List<String>>datos) throws InterruptedException   {
		System.out.println(datos.get(1).get(6));
	    actor.attemptsTo(EditarShippingDetails.conFirstName(datos.get(1).get(0))
	    				.conLastName(datos.get(1).get(1))
	    				.conPhoneNumber(datos.get(1).get(2))
	    				.conCity(datos.get(1).get(3))
	    				.conAddress(datos.get(1).get(4))
	    				.conPostalcode(datos.get(1).get(5))
	    				.conState_province_region(datos.get(1).get(6)));
	    
	    
	}

	@Then("^el podra ver la seccion de Payment Method$")
	public void elPodraVerLaSeccionDePaymentMethod(Map<String,String>datos)  {
	    actor.should(seeThat(VerPaymentMethod.enPantalla(), Matchers.is(datos.get("esperado"))));
	    
	}
	@Given("^que el usuario ha seleccionado un producto tecnologico$")
	public void queElUsuarioHaSeleccionadoUnProductoTecnologico(List<List<String>>datos) throws InterruptedException  {
	    actor = Actor.named("jurgen");
	    actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	    Thread.sleep(3000);
	    actor.wasAbleTo(Loguearse.conUsuario(datos.get(1).get(0)).conPassword(datos.get(1).get(1)));
	    actor.wasAbleTo(IrACategoria.deProducto(datos.get(1).get(2)),
				SeleccionarProducto.conNombre(datos.get(1).get(3)),
				SeleccionarColor.deProducto(datos.get(1).get(4)),
				SeleccionarCantidad.deProducto(datos.get(1).get(5)),
				AgregarProductoCanasto.alCanasto());
	   
	}

	@When("^el reliza el pago por medio de SafePay$")
	public void elRelizaElPagoPorMedioDeSafePay(List<List<String>>datos)  {
	   
	   actor.attemptsTo(PagarProductoSafePay.conUsername(datos.get(1).get(0)).
			   											conPassword(datos.get(1).get(1)));
	}
	@When("^el reliza el pago por medio de MasterCredit$")
	public void elRelizaElPagoPorMedioDeMasterCredit(List<List<String>>datos) {
	    actor.attemptsTo(PagarProductoMasterCredit.conNumeroTargeta(datos.get(1).get(0))
	    											.conCvv(datos.get(1).get(1))
	    											.conMes(datos.get(1).get(2))
	    											.conAño(datos.get(1).get(3))
	    											.conCardHolderName(datos.get(1).get(4)));
	}

	@Then("^el podra ver un mensaje de agradecimiento$")
	public void elPodraVerUnMensajeDeAgradecimiento(Map<String,Boolean>datos)  {
	    actor.should(seeThat(VerMensajeCompra.exitosa(), Matchers.is(datos.get("visibilidadmensaje"))));
	   
	}
	

}
