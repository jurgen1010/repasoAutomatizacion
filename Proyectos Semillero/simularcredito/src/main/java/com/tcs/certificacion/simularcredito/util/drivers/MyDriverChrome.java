package com.tcs.certificacion.simularcredito.util.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriverChrome {
	
	private static WebDriver driver;
	
	public static MyDriverChrome web() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1583722\\Desktop\\Selenium\\ChromeDriver.exe");
		driver=new ChromeDriver();
		return new MyDriverChrome();
	}
	
	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}

}
