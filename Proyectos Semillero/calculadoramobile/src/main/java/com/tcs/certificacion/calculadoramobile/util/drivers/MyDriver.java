package com.tcs.certificacion.calculadoramobile.util.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MyDriver {
	//private static AndroidDriver<MobileElement> driver;
	//private static AndroidDriver driver;
	private static AppiumDriver<MobileElement> driver;
	
	public static  MyDriver Android() throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("platformVersion","7.0");
	capabilities.setCapability("deviceName","1215fcda55b72e04");
	capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
	capabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");	
	capabilities.setCapability("automationName", "UiAutomator2");
	driver= new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	return new MyDriver();
	
	}
	public AppiumDriver<MobileElement> enLaAplicacion() {
		return driver;
	}
}
