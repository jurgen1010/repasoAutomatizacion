package com.google.certificacion.googletraductor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.findby.By;

public class TraductorGooglePage extends PageObject{
	
	@FindBy(xpath="//div[@id = 'gt-sl-gms']")
	WebElement cmbOrigen;
	
	@FindBy(xpath = "//div[@id = 'gt-tl-gms']")
	WebElement cmbDestino;
	
	@FindBy(xpath = "//textarea[@id = 'source']")
	WebElement txtPalabra;
	
	@FindBy(xpath = "//div[@id = 'gt-res-dir-ctr']")
	WebElement txtTraduccion;
	
	public void clickIdiomaOrigen() {
		cmbOrigen.click();
	}
	
	public void elegirIdiomaOrigen(String paisorigen) {
		WebElement idiomaOrigen = this.getDriver().findElement(By.xpath(String.format("//div[@id = 'gt-sl-gms-menu']//*[contains(text(), '%s')]", paisorigen)));
		idiomaOrigen.click();
	}
	
	public void clickIdiomaDestino() {
		cmbDestino.click();
	}
	
	public void elegirIdiomaDestino(String paistraductor) {
		WebElement idiomaDestino = this.getDriver().findElement(By.xpath(String.format("//div[@id = 'gt-tl-gms-menu']//*[contains(text(), '%s')]", paistraductor)));
		idiomaDestino.click();
	}
	
	public void escribirTraduccion(String palabra) {
		txtPalabra.sendKeys(palabra);
	}
	
	public String palabraTraduccion() {
		return txtTraduccion.getText();
	}
	
}
