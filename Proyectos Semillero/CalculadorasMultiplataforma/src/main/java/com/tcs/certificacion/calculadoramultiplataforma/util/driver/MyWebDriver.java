package com.tcs.certificacion.calculadoramultiplataforma.util.driver;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.serenitybdd.core.webdriver.driverproviders.ChromeDriverCapabilities;

public class MyWebDriver {

	private static WebDriver driver;
	public static MyWebDriver web() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Software Edition Assurance\\Drivers navegadores\\ChromeDriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver= new ChromeDriver(chromeOptions);
		return new MyWebDriver();
	}
	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}
}
