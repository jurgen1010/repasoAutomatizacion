package co.com.certificacion.stepdefinitions;

import co.com.certificacion.tasks.IngresarAlRegistroDeUsuario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUsuarioStepDefinition {

    @Dado("^que el usuario se encuentra dentro del regitro de nuevo usuario$")
    public void queElUsuarioSeEncuentraDentroDelRegitroDeNuevoUsuario()  {
        theActorInTheSpotlight().attemptsTo(IngresarAlRegistroDeUsuario.conClick());
    }

    @Cuando("^ingreso el ingresa la informacion solicitada para registrarse$")
    public void ingresoElIngresaLaInformacionSolicitadaParaRegistrarse()  {

    }

    @Entonces("^Visualizara un mensaje de bienvenida por haberse registrado$")
    public void visualizaraUnMensajeDeBienvenidaPorHaberseRegistrado()  {

    }

}
