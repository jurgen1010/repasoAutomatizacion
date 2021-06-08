package test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import calculadora.CalcGoogle;

public class TestCalculadora {
	WebDriver driver ;
	@Before
	public void init () {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1583722\\Desktop\\Selenium\\ChromeDriver.exe");//ruta de donde se encuentra la capabilty
		driver=new ChromeDriver();
		driver.get("https://www.google.com.co/search?q=calculadora&oq=calculadora&aqs=chrome..69i57j0l5.3465j0j8&sourceid=chrome&ie=UTF-8");
	}
	@Test
	public void SumarTesta () {
		WebElement input = driver.findElement(By.xpath("//div[@id='cwtltblr']"));
		input.click();
		input.sendKeys("4+5");
		input.sendKeys(Keys.ENTER);
		
		double result = Double.parseDouble(input.getText());
		takeSnapShot("test1.png");
		
		assertEquals(CalcGoogle.suma(4, 5),result,0.0);
		
	
	}
	@Test
public void RestaTest () {
		WebElement input = driver.findElement(By.xpath("//div[@id='cwtltblr']"));
		input.click();
		input.sendKeys("4-5");
		input.sendKeys(Keys.ENTER);
		
		double result = Double.parseDouble(input.getText());
		takeSnapShot("test2.png");
		assertEquals(CalcGoogle.resta(4, 5),result,0.0);
	}
	@Test
public void MultiplicacionTest () {
		WebElement input = driver.findElement(By.xpath("//div[@id='cwtltblr']"));
		input.click();
		input.sendKeys("4*5");
		input.sendKeys(Keys.ENTER);
		
		double result = Double.parseDouble(input.getText());
		takeSnapShot("test3.png");
		assertEquals(CalcGoogle.multiplicacion(4, 5),result,0.0);
	}
	@Test
public void DivicionTest () {
		WebElement input = driver.findElement(By.xpath("//div[@id='cwtltblr']"));
		input.click();
		input.sendKeys("4/5");
		input.sendKeys(Keys.ENTER);
		
		double result = Double.parseDouble(input.getText());
		takeSnapShot("test4.png");
		assertEquals(CalcGoogle.division(4, 5),result,0.0);	
	}
	@After
	public void finish() {
		driver.close();
	}
	private void takeSnapShot(String filename) {
		try {
			TakesScreenshot camera=((TakesScreenshot)driver);
			byte[] imageBytes =camera.getScreenshotAs(OutputType.BYTES);
			BufferedOutputStream out	= new	BufferedOutputStream(new FileOutputStream(filename));
			out.write(imageBytes);
			out.close();
		} catch (Exception e) {
			
		}
		
	}	
}

