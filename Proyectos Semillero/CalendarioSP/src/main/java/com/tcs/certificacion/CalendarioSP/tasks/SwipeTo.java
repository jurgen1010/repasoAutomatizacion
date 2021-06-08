package com.tcs.certificacion.CalendarioSP.tasks;

import org.openqa.selenium.Dimension;

import com.tcs.certificacion.CalendarioSP.userinterfaces.Calendario;
import com.tcs.certificacion.CalendarioSP.util.drivers.MyAndroidDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SwipeTo implements Task{

	private String mes;
	public SwipeTo(String mes) {
		this.mes=mes;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
//		while (!Calendario.MES.resolveFor(actor).getText().equalsIgnoreCase(this.mes)) {
//			TouchAction action= new TouchAction((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver());
//			action.press(1200, 1200);
//			action.moveTo(300, 1200);
//			action.release().perform();
//			this.mes=Calendario.MES.resolveFor(actor).getText();
//		}
		 
		do {			
			//new TouchAction(MyAndroidDriver.actual()).press(PointOption.point(1200, 1200)).waitAction().moveTo(PointOption.point(300, 1200)).release().perform();
			new TouchAction(MyAndroidDriver.actual()).press(PointOption.point(1200, 1200)).moveTo(PointOption.point(300, 1200)).release().perform();
			//TouchAction action= new TouchAction((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver());
//			action.press(1200, 1200);
//			action.moveTo(300, 1200);
//			action.release().perform();
			//this.mes=Calendario.MES.resolveFor(actor).getText();
		} while (!Calendario.MES.resolveFor(actor).getText().equalsIgnoreCase(this.mes));
		
	}
	public static SwipeTo nextMounth(String mes) {
		return Tasks.instrumented(SwipeTo.class, mes);
	}

	
}
