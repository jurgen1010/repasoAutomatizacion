package com.tcs.certificacion.CalendarioSP.stepdefinitions;

import java.net.MalformedURLException;
import java.util.Map;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.tcs.certificacion.CalendarioSP.questions.ElEvento;
import com.tcs.certificacion.CalendarioSP.tasks.AgregarEvento;
import com.tcs.certificacion.CalendarioSP.tasks.GuardarEvento;
import com.tcs.certificacion.CalendarioSP.tasks.SeleccionarDia;
import com.tcs.certificacion.CalendarioSP.tasks.SwipeTo;
import com.tcs.certificacion.CalendarioSP.util.drivers.MyAndroidDriver;
import com.tcs.certificacion.CalendarioSP.util.drivers.MyChromeDriverMobile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CalendarioStepDefinition {

	private Actor jurgen = Actor.named("Jurgen");
	@Given("^que el usuario se encuentra en el calendario Android$")
	public void queElUsuarioSeEncuentraEnElCalendarioAndroid() throws MalformedURLException  {
	    jurgen.can(BrowseTheWeb.with(MyAndroidDriver.enLaApp().Android()));
	    //jurgen.can(BrowseTheWeb.with(MyChromeDriverMobile.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	}

	@When("^el agrega una fecha de cumpleaños$")
	public void elAgregaUnaFechaDeCumpleaños(Map<String,String> datos)  {
	    jurgen.attemptsTo(SwipeTo.nextMounth(datos.get("Mes")),
	    					SeleccionarDia.cumpleaños(datos.get("Dia")),
	    					AgregarEvento.cumpleaños(),
	    					GuardarEvento.cumpleañosConTitulo(datos.get("Titulo")).cumpleañosConNota(datos.get("Nota")),
	    					SeleccionarDia.cumpleaños(datos.get("Dia"))
	    					);
	    									    
	    System.out.println(datos.get("Titulo"));
	    System.out.println(datos.get("Dia"));
	    
	}

	@Then("^el podra ver el evento creado en su calendario$")
	public void elPodraVerElEventoCreadoEnSuCalendario(Map<String, String>datos)  {
	    jurgen.should(seeThat(ElEvento.guardado(), Matchers.is(datos.get("Evento"))));
	    
	}
}
