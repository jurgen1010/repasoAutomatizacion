package com.tcs.certificacion.AdvantageShopping.util.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriverChrome {
	
	private static WebDriver driver;
	
	public static MyDriverChrome web() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1583722\\Desktop\\Selenium\\ChromeDriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver=new ChromeDriver(chromeOptions);
		return new MyDriverChrome();
	}
	
	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}

}
