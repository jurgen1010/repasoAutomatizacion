package com.tcs.certificacion.vivaair.stepdefinitions;

import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import com.tcs.certificacion.vivaair.questions.LeerPalabra;
import com.tcs.certificacion.vivaair.task.Buscar;
import com.tcs.certificacion.vivaair.task.Reservar;
import com.tcs.certificacion.vivaair.task.Seleccionar;
import com.tcs.certificacion.vivaair.util.drivers.MyDriver;
import com.tcs.certificacion.vivaair.util.drivers.MyDriverPhantom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ReservarStepDefinition {

	Actor jurgen = Actor.named("Jurgen");
	@Given("^que el usuario se encuentra en la pagina de viva air$")
	public void queElUsuarioSeEncuentraEnLaPaginaDeVivaAir()  {
		jurgen.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("https://www.vivaair.com/co")));
//		jurgen.can(BrowseTheWeb.with(MyDriverPhantom.web().enLaPagina("https://www.vivaair.com/co")));
	    
	}

	@When("^ingresa los datos de la reserva$")
	public void ingresaLosDatosDeLaReserva(List<List<String>>datos)  {
		jurgen.attemptsTo(Buscar.conCiudadOrigen(datos.get(1).get(0)).conCiudadDestino(datos.get(1).get(1))
	    		.conNumeroAdultos(datos.get(1).get(2)).conFechaIda(datos.get(1).get(3))
	    		.conMoneda(datos.get(1).get(4)));
		
		jurgen.attemptsTo(Seleccionar.conElPrecio(datos.get(1).get(5)));
		jurgen.attemptsTo(Reservar.conNombres(datos.get(1).get(6)).conApellidos(datos.get(1).get(7))
				.conGenero(datos.get(1).get(8)).conNroDocumento(datos.get(1).get(9)).conAsistencia(datos.get(1).get(10))
				.conEmail(datos.get(1).get(11)).conCelular(datos.get(1).get(12))
				);
	    
	}

	@Then("^el podra reservar el tiquete$")
	public void elPodraReservarElTiquete()  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    jurgen.should(seeThat(LeerPalabra.enPantalla(), is("Silla")));
	    
	}
}
