package co.com.certificacion.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario extends PageObject {

    public static final Target UNETE_HOY = Target.the("boton Unete hoy")
        .locatedBy("//li/a[@class='unauthenticated-nav-bar__sign-up']");
}
