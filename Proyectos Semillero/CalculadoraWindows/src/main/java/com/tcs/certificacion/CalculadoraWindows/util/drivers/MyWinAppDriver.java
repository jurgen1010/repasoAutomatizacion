package com.tcs.certificacion.CalculadoraWindows.util.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;



public class MyWinAppDriver {
	private static WebDriver driver;
	//private static WindowsDriver<WindowsElement> driver;

	public static MyWinAppDriver web() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
//		capabilities.setCapability("platformName", "Windows");
//		capabilities.setCapability("deviceName", "WindowsPC");
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/"), capabilities);
			//driver =  new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723/"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return new MyWinAppDriver();
	}
	public WebDriver enLaAplicacion() {
		return driver;
	}
	

}
