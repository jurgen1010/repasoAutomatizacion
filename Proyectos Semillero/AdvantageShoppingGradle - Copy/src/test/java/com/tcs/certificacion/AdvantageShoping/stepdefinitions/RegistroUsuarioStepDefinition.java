package com.tcs.certificacion.AdvantageShoping.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import com.tcs.certificacion.AdvantageShopping.models.DatosUsuario;
import com.tcs.certificacion.AdvantageShopping.models.NombreCampos;
import com.tcs.certificacion.AdvantageShopping.questions.Leyendo;
import com.tcs.certificacion.AdvantageShopping.questions.Ver;
import com.tcs.certificacion.AdvantageShopping.questions.VerAdvertenciaLongitudCampos;

import com.tcs.certificacion.AdvantageShopping.questions.VerTitulosDeSecciones;
import com.tcs.certificacion.AdvantageShopping.tasks.ConfirmarContrasena;
import com.tcs.certificacion.AdvantageShopping.tasks.DiligenciarCampo;
import com.tcs.certificacion.AdvantageShopping.tasks.IrA;
import com.tcs.certificacion.AdvantageShopping.tasks.RegistrarUsuario;
import com.tcs.certificacion.AdvantageShopping.util.drivers.MyDriverChrome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegistroUsuarioStepDefinition {

	Actor actor;
	NombreCampos nombrecampo;
	@Given("^que el (.*) se encuentra en la pagina de registro$")
	public void queElAdministradorSeEncuentraEnLaPaginaDeRegistro(String name)  {
	    actor=Actor.named(name);
	    actor.can(BrowseTheWeb.with(MyDriverChrome.web().enLaPagina("http://www.advantageonlineshopping.com/#")));
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    actor.wasAbleTo(IrA.registroUsuario());
		
	}

	@When("^el registra un usuario$")
	public void elRegistraUnUsuario(List<DatosUsuario>datos)  {
	    
		//System.out.println(datos.get(0).getUsername());
	    actor.attemptsTo(RegistrarUsuario.conUsername(datos.get(0).getUsername())
	    							     .conEmail(datos.get(0).getEmail())
	    							     .conPassword(datos.get(0).getPassword())
	    							     .conConfirmpassword(datos.get(0).getConfirmpassword())
	    							     .conFirstname(datos.get(0).getFirstname())
	    							     .conLastname(datos.get(0).getLastname())
	    							     .conPhonenumber(datos.get(0).getPhonenumber())
	    							     .conCountry(datos.get(0).getCountry())
	    							     .conCity(datos.get(0).getCity())
	    							     .conAddress(datos.get(0).getAddress())
	    							     .conState_province_region(datos.get(0).getState_province_region())
	    							     .conPostalcode(datos.get(0).getPostalcode())
	    							     .conReceiveOffers(datos.get(0).getReceiveoffers())
	    							     .conConditionsofUse(datos.get(0).getConditionsofUse())
	    							     );
	}

	@Then("^el podra ver su nombre de usuario en pantalla$")
	public void elPodraVerSuNombreDeUsuarioEnPantalla(List<List<String>>esperado)  {
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    actor.should(seeThat(Leyendo.elNombreDeUsuario(), is(esperado.get(1).get(0))));
	    
	}
	@Then("^el boton de registro debera estar deshabilitado$")
	public void elBotonDeRegistroDeberaEstarDeshabilitado(List<List<String>>estadoesperado)  {
	    actor.should(seeThat(Ver.elEstadoDelBtnRegistrar(), is(estadoesperado.get(1).get(0))));
	    
	}
	@When("^el diligencia el campo username$")
	public void elDiligenciaElCampoUsername(List<List<String>>datos)  {
	   
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	   
	}
	@When("^el diligencia el campo password$")
	public void elDiligenciaElCampoPassword(List<List<String>>datos)  {
		
	    actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	   
	}

	@When("^el diligencia el campo fisrtname$")
	public void elDiligenciaElCampoFisrtname(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo lastname$")
	public void elDiligenciaElCampoLastname(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1))); 
	}
	@When("^el diligencia el campo phonenumber$")
	public void elDiligenciaElCampoPhonenumber(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo city$")
	public void elDiligenciaElCampoCity(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo address$")
	public void elDiligenciaElCampoAddress(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo state_province_region$")
	public void elDiligenciaElCampoState_province_region(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo postalcode$")
	public void elDiligenciaElCampoPostalcode(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo email$")
	public void elDiligenciaElCampoEmail(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo email con formato$")
	public void elDiligenciaElCampoEmailConFormato(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo passwrod con formato$")
	public void elDiligenciaElCampoPasswrodConFormato(List<List<String>>datos)  {
		actor.attemptsTo(DiligenciarCampo.conNombre(NombreCampos.nombreCampo(datos.get(1).get(0)), datos.get(1).get(1)));
	}
	@When("^el diligencia el campo password y confirmpassword$")
	public void elDiligenciaElCampoPasswordYConfirmpassword(List<DatosUsuario>datos)  {
	   actor.attemptsTo(ConfirmarContrasena.conPassword(datos.get(0).getPassword())
			   .conConfirmPassword(datos.get(0).getConfirmpassword()));
	}
	
	@Then("^el podra ver el mensaje de advertencia$")
	public void elPodraVerElMensajeDeAdvertencia(List<List<String>>datos)  {
		 actor.should(seeThat(VerAdvertenciaLongitudCampos.permitida(), is(datos.get(1).get(0))));
	}
	@When("^el registra un usuario sin el campo username$")
	public void elRegistraUnUsuarioSinElCampoUsername(List<DatosUsuario>datos)  {
		 actor.attemptsTo(RegistrarUsuario.conUsername(datos.get(0).getUsername())
			     .conEmail(datos.get(0).getEmail())
			     .conPassword(datos.get(0).getPassword())
			     .conConfirmpassword(datos.get(0).getConfirmpassword())
			     .conFirstname(datos.get(0).getFirstname())
			     .conLastname(datos.get(0).getLastname())
			     .conPhonenumber(datos.get(0).getPhonenumber())
			     .conCountry(datos.get(0).getCountry())
			     .conCity(datos.get(0).getCity())
			     .conAddress(datos.get(0).getAddress())
			     .conState_province_region(datos.get(0).getState_province_region())
			     .conPostalcode(datos.get(0).getPostalcode())
			     .conReceiveOffers(datos.get(0).getReceiveoffers())
			     .conConditionsofUse(datos.get(0).getConditionsofUse())
			     );
	}
	

	@When("^el registra un usuario sin el campo email$")
	public void elRegistraUnUsuarioSinElCampoEmail(List<DatosUsuario>datos)  {
		actor.attemptsTo(RegistrarUsuario.conUsername(datos.get(0).getUsername())
			     .conEmail(datos.get(0).getEmail())
			     .conPassword(datos.get(0).getPassword())
			     .conConfirmpassword(datos.get(0).getConfirmpassword())
			     .conFirstname(datos.get(0).getFirstname())
			     .conLastname(datos.get(0).getLastname())
			     .conPhonenumber(datos.get(0).getPhonenumber())
			     .conCountry(datos.get(0).getCountry())
			     .conCity(datos.get(0).getCity())
			     .conAddress(datos.get(0).getAddress())
			     .conState_province_region(datos.get(0).getState_province_region())
			     .conPostalcode(datos.get(0).getPostalcode())
			     .conReceiveOffers(datos.get(0).getReceiveoffers())
			     .conConditionsofUse(datos.get(0).getConditionsofUse())
			     );
	    
	}

	@When("^el registra un usuario sin el campo password$")
	public void elRegistraUnUsuarioSinElCampoPassword(List<DatosUsuario>datos)  {
		actor.attemptsTo(RegistrarUsuario.conUsername(datos.get(0).getUsername())
			     .conEmail(datos.get(0).getEmail())
			     .conPassword(datos.get(0).getPassword())
			     .conConfirmpassword(datos.get(0).getConfirmpassword())
			     .conFirstname(datos.get(0).getFirstname())
			     .conLastname(datos.get(0).getLastname())
			     .conPhonenumber(datos.get(0).getPhonenumber())
			     .conCountry(datos.get(0).getCountry())
			     .conCity(datos.get(0).getCity())
			     .conAddress(datos.get(0).getAddress())
			     .conState_province_region(datos.get(0).getState_province_region())
			     .conPostalcode(datos.get(0).getPostalcode())
			     .conReceiveOffers(datos.get(0).getReceiveoffers())
			     .conConditionsofUse(datos.get(0).getConditionsofUse())
			     );
	}

	@When("^el registra un usuario sin el campo confirmpassword$")
	public void elRegistraUnUsuarioSinElCampoConfirmpassword(List<DatosUsuario>datos)  {
		actor.attemptsTo(RegistrarUsuario.conUsername(datos.get(0).getUsername())
			     .conEmail(datos.get(0).getEmail())
			     .conPassword(datos.get(0).getPassword())
			     .conConfirmpassword(datos.get(0).getConfirmpassword())
			     .conFirstname(datos.get(0).getFirstname())
			     .conLastname(datos.get(0).getLastname())
			     .conPhonenumber(datos.get(0).getPhonenumber())
			     .conCountry(datos.get(0).getCountry())
			     .conCity(datos.get(0).getCity())
			     .conAddress(datos.get(0).getAddress())
			     .conState_province_region(datos.get(0).getState_province_region())
			     .conPostalcode(datos.get(0).getPostalcode())
			     .conReceiveOffers(datos.get(0).getReceiveoffers())
			     .conConditionsofUse(datos.get(0).getConditionsofUse())
			     );
	   
	}
	@Then("^el podra ver el nombre de las tres secciones$")
	public void elPodraVerElNombreDeLasTresSecciones(Map<String,String> datos)  {
		System.out.println(datos.get("account_details"));
		actor.should(seeThat(VerTitulosDeSecciones.enLaPagina("acountdetails"), Matchers.is(datos.get("account_details"))));
		actor.should(seeThat(VerTitulosDeSecciones.enLaPagina("personaldetails"), Matchers.is(datos.get("personal_details"))));
		actor.should(seeThat(VerTitulosDeSecciones.enLaPagina("address"), Matchers.is(datos.get("address"))));
		
	
	}
	
}
