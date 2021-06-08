package com.tcs.certificacion.calculadoramultiplataforma.util.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyWindowsDriver {

	public static WebDriver driver;
	
	public static  MyWindowsDriver enLaAplicacion() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4729/"), capabilities);
		return new MyWindowsDriver();
	}
	public WebDriver escritorio() {
		return driver;
	}
}
