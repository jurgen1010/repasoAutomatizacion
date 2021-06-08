package com.tcs.certificacion.traductorgoogle.util.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
	
	private static WebDriver driver;
	
	public static MyDriver web() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1460318\\Documents\\Trainning\\Driver\\ChromeDriver.exe");
		driver=new ChromeDriver();
		return new MyDriver();
	}
	
	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}

}