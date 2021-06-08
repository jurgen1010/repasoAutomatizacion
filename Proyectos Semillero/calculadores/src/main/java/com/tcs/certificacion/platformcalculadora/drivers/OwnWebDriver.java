package com.tcs.certificacion.platformcalculadora.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OwnWebDriver {
	
	private static WebDriver driver;
	
	public static OwnWebDriver hisBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized","--incognito");
		driver = new ChromeDriver(options);
		return new OwnWebDriver();
	}
	
	public static WebDriver on(String url) {
		driver.get(url);
		return driver;
	}
}
