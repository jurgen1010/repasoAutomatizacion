package com.tcs.certificacion.AdvantageShopping.interactions;

import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class AceptarConditionsOfUse  implements Interaction{

	private  Target target;
	 private String ConditionsofUse;
	 public AceptarConditionsOfUse (Target target, String ConditionsofUse) {
		 this.target=target;
		 this.ConditionsofUse=ConditionsofUse;
	 }
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement elemento = target.resolveFor(actor);
		if (ConditionsofUse.equals("si")) {
			elemento.click();
		}
		
	}
	public static AceptarConditionsOfUse deLaPagina(Target target, String ConditionsofUse) {
		return Tasks.instrumented(AceptarConditionsOfUse.class, target,ConditionsofUse );
	}
}
