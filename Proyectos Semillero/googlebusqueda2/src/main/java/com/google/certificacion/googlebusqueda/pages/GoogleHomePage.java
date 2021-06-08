package com.google.certificacion.googlebusqueda.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.co")
public class GoogleHomePage extends PageObject{

	@FindBy(xpath="//*[@name='q']")
	WebElement txtBuscadorGoogle;
	
	@FindBy(xpath="//*[@value='Buscar con Google']")
	WebElementFacade btnBuscar;
	
	public void ingresarBusqueda(String expresion) {
		txtBuscadorGoogle.sendKeys(expresion);
	}
	
	public void clickBuscar() {
		btnBuscar.click();
	}
}
