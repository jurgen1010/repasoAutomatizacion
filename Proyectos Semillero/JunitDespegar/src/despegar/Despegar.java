package despegar;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Despegar {
	WebDriver driver;
	@Before
	public void precondicion()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1583722\\Desktop\\Selenium\\ChromeDriver.exe");//ruta de donde se encuentra la capabilty
		driver=new ChromeDriver();
		driver.get("https://www.despegar.com.co/vuelos/");
	}
	
	
	@Test
	public void prueba1() throws InterruptedException {
	Thread.sleep(3000);
		
	WebElement cerrarPublicidad = driver.findElement(By.xpath("//span[@class='as-login-close as-login-icon-close-circled']"));
	cerrarPublicidad.click();
	
	WebElement txtOrigen = driver.findElement(By.xpath("//input[@placeholder='Ingresa desde dónde viajas']"));
	txtOrigen.click();
	txtOrigen.sendKeys("Medellín, Colombia");
	Thread.sleep(2000);
	txtOrigen.sendKeys(Keys.ENTER);
	
	WebElement txtDestino = driver.findElement(By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']"));
	txtDestino.click();
	txtDestino.sendKeys("Cali");
	Thread.sleep(2000);
	txtDestino.sendKeys(Keys.ENTER);
	
	WebElement campoMesIda = driver.findElement(By.xpath("//input[@placeholder='Ida']"));
	campoMesIda.click();
	
	//WebElement mesActual = driver.findElement(By.xpath("//div[@class='_dpmg2--month _dpmg2--o-1 _dpmg2--has-start-range _dpmg2--month-active']")).getAttribute("month-active");
	//String mes = mesActual.getAttribute("data-month");
	String fechaini=("2018-10");
	String fechafin=("2018-10");

	while(!driver.findElement(By.xpath("//div[@class='_dpmg2--months']//div[contains(@class,'month-active')]")).getAttribute("data-month").equals(fechaini)) 
	{
		
		driver.findElement(By.xpath("//div[@class='_dpmg2--controlsWrapper']//div[@class='_dpmg2--controls-next']")).click();
	}
	driver.findElement(By.xpath("//div[@class='_dpmg2--months']//div[contains(@class,'month-active')]//div[@class='_dpmg2--dates']//*[text()='11']")).click();;
	

	while(!driver.findElement(By.xpath("//div[@class='_dpmg2--months']//div[contains(@class,'month-active')]")).getAttribute("data-month").equals(fechafin)) 
	{
		
		driver.findElement(By.xpath("//div[@class='_dpmg2--controlsWrapper']//div[@class='_dpmg2--controls-next']")).click();
	}
	driver.findElement(By.xpath("//div[@class='_dpmg2--months']//div[contains(@class,'month-active')]//div[@class='_dpmg2--dates']//*[text()='14']")).click();;
	
	
	WebElement campoPasajerosClase =driver.findElement(By.xpath("//input[@class='input-tag sbox-ui-no-focus-color "
			+ "sbox-bind-disable-passengers-input "
			+ "sbox-bind-reference-flight-roundtrip-passengers-input sbox-bind-reference-flight-plus-hotel-passengers-right-input']"));
	campoPasajerosClase.click();
	
	
	 //driver.findElement(By.xpath("//div[contains(@class,'_pnlpk-panel--show')]//div[contains(@class,'_pnlpk-stepper-adults')]//a[@class='steppers-icon-right sbox-3-icon-plus']")).click();
	 //driver.findElement(By.xpath("//div[contains(@class,'_pnlpk-panel--show')]//div[contains(@class,'_pnlpk-stepper-minors')]//a[@class='steppers-icon-right sbox-3-icon-plus']")).click();
	
	 //driver.findElement(By.xpath("//div[contains(@class, '_pnlpk-panel--show')]//div[contains(@class, '_pnlpk-minor-age-select-last-item')]//select[contains(@class,'select-tag')]//option[@value = '15']")).click();
	 driver.findElement(By.xpath("//option[@value = 'YC']")).click();
	 driver.findElement(By.xpath("//div[contains(@class, '_pnlpk-main _pnlpk-panel _pnlpk-panel--popup _pnlpk-panel--mobile _pnlpk-panel--show')]//div[contains(@class, '_pnlpk-panel__footer -medium-down-to-lg')]//a[@class = '_pnlpk-panel__button _pnlpk-apply-button sbox-3-btn-ghost _pnlpk-panel__button--link-right -md']")).click();
	 driver.findElement(By.xpath("//div[@class = 'sbox-dates-distri-container']//em[@class = 'btn-text']")).click();
	 
	 Thread.sleep(8000);
	 
	 JavascriptExecutor jsx = (JavascriptExecutor) driver;
	 jsx.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 
	 Thread.sleep(3000);
	 
	 List<WebElement> elementos= driver.findElements(By.xpath("//p[@class='item-fare fare-price']//span[@class='price-wrapper']//span[@class='amount price-amount']"));
	 double suma=0;
	 for (WebElement e : elementos) {
		 
		 System.out.println(e.getText().replace(".", "").replace("$", ""));
		 suma=suma+Integer.parseInt(e.getText().replace(".", "").replace("$", ""));
		 
		 
	 }
	 System.out.println("EL PROMEDIO DE LOS PRECIOS DE VUELO ES: "+suma/elementos.size());
//	 WebElement e;
//	 elementos.forEach( suma=suma+Integer.parseInt(e.getText().replace(".", "").replace("$", "")));	 
	}
	
	@After
	public void poscondicion() {
		//driver.close();
	}
}
