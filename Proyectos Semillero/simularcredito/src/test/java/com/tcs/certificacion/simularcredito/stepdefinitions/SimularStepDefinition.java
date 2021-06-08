package com.tcs.certificacion.simularcredito.stepdefinitions;

import java.util.List;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import com.tcs.certificacion.simularcredito.models.Datos;
import com.tcs.certificacion.simularcredito.questions.Ver;
import com.tcs.certificacion.simularcredito.tasks.Buscar;
import com.tcs.certificacion.simularcredito.tasks.IrASimulador;
import com.tcs.certificacion.simularcredito.tasks.Simular;
import com.tcs.certificacion.simularcredito.util.drivers.MyDriverChrome;
import com.tcs.certificacion.simularcredito.util.drivers.MyDriverPhantom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SimularStepDefinition {

	Actor actorChrome ;
	Actor actorPhantom;
	@Given("^que el (.*) se encuantra en la pagina de (.*) tu credito de Bancolombia$")
	public void queElUsuarioSeEncuantraEnLaPaginaDeSimuladorTuCreditoDeBancolombia(String name,String palabra)  {
		actorChrome = Actor.named(name);
		actorChrome.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("https://www.grupobancolombia.com/wps/portal/personas")));
		actorChrome.wasAbleTo(Buscar.conLaPalabra(palabra));
		actorChrome.wasAbleTo(IrASimulador.conElLink());
		actorPhantom = Actor.named(name);
		actorPhantom.can(BrowseTheWeb.with(MyDriverPhantom.web().enLaPagina("https://www.grupobancolombia.com/wps/portal/personas")));
		actorPhantom.wasAbleTo(Buscar.conLaPalabra(palabra));
		actorPhantom.wasAbleTo(IrASimulador.conElLink());
		
	}

	@When("^el diligencia la solicitud del credito con los datos$")
	public void elDiligenciaLaSolicitudDelCreditoConLosDatos(List<Datos> datos)  {
		
		actorChrome.attemptsTo(Simular.tipoSimulacion(datos.get(0).getSimular()).yConFechaDeNacimiento(datos.get(0).getFechanacimiento())
			   .yConTasa(datos.get(0).getTasa()).yConTipoCredito(datos.get(0).getTipocredito())
			   .yConPlazoMeses(datos.get(0).getPlazomeses()).yConValorPrestamo(datos.get(0).getValorprestamo()));
		actorPhantom.attemptsTo(Simular.tipoSimulacion(datos.get(0).getSimular()).yConFechaDeNacimiento(datos.get(0).getFechanacimiento())
				   .yConTasa(datos.get(0).getTasa()).yConTipoCredito(datos.get(0).getTipocredito())
				   .yConPlazoMeses(datos.get(0).getPlazomeses()).yConValorPrestamo(datos.get(0).getValorprestamo()));
	   
	    
	}

	@Then("^el podra ver el resultado de la simulacion (.*)$")
	public void elPodraVerElResultadoDeLaSimulacion(String Tasa)  {
//	    actorChrome.should(seeThat(Ver.laTasaAnual(), is(Tasa)));
//	    actorPhantom.should(seeThat(Ver.laTasaAnual(), is(Tasa)));
//	    
//	    System.out.println(actorChrome.asksFor(Ver.laTasaAnual()));
//	    System.out.println(actorPhantom.asksFor(Ver.laTasaAnual()));
	    
	    actorChrome.should(seeThat(Ver.laTasaAnual(), is(actorPhantom.asksFor(Ver.laTasaAnual()))));
	    
	}
}
