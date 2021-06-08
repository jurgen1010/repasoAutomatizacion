package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.co")
public class GoogleHomePage extends PageObject{

	@FindBy(xpath="//*[@name='q']")
	WebElement txtBuscardorGoogle;
	
	@FindBy(xpath="//input[@value='Buscar con Google']")
	WebElementFacade btnBuscar;
	
	
	public void ingresarBusqueda(String expresion) {
		txtBuscardorGoogle.sendKeys(expresion);
	}
	
	public void clickBuscar() {
	
		btnBuscar.click();
	}
}
