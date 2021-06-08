package com.google.certificacion.googletraductor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.co")

public class InicioGoogle extends PageObject {	
	
	@FindBy(xpath="//a[@href='https://www.google.com.co/intl/es-419/options/' and @title = 'Google Apps']")
	WebElement btnMenu;
	
	@FindBy(xpath="//a[@id = 'gb51']")
	WebElement btnTraductor;
	
	
	public void clickMenu() {
		btnMenu.click();
	}
	
	public void clickTraductor() {
		btnTraductor.click();
	}

}
