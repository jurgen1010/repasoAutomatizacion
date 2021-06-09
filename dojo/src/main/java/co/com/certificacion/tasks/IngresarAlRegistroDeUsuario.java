package co.com.certificacion.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.userinterfaces.RegistroUsuario.UNETE_HOY;

public class IngresarAlRegistroDeUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(UNETE_HOY, WebElementStateMatchers.isNotPresent()).forNoMoreThan(5).seconds();
        //WebElementFacade uneteHoy = UNETE_HOY.resolveFor(actor);
        //uneteHoy.click();
        actor.attemptsTo(Click.on(UNETE_HOY));
        System.out.println("Click relizado");
    }

    public static IngresarAlRegistroDeUsuario conClick(){
        return Tasks.instrumented(IngresarAlRegistroDeUsuario.class);
    }
}
