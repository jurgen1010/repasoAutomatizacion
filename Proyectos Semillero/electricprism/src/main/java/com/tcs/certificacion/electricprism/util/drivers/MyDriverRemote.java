package com.tcs.certificacion.electricprism.util.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyDriverRemote {

	private static RemoteWebDriver driver;
	
	public static MyDriverRemote web() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new RemoteWebDriver(new URL("http://10.101.208.93:4444/wd/hub"),capabilities);
		return new MyDriverRemote();
	}
	public RemoteWebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}
}
