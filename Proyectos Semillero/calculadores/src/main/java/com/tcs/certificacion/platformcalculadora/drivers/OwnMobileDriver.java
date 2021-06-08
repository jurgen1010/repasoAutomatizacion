package com.tcs.certificacion.platformcalculadora.drivers;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class OwnMobileDriver {
	
	private static AppiumDriver<MobileElement> driver;
	
	public static OwnMobileDriver hisApp() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "5200e8f85bbfc4c5");
			capabilities.setCapability("platformName", "android");
			capabilities.setCapability("automationName", "uiautomator2");
			capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
			capabilities.setCapability("noReset", "true");
			driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),capabilities);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new OwnMobileDriver();
	}
	
	public static AppiumDriver<MobileElement> on(){
		return driver;
	}
}
