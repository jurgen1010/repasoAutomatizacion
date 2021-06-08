package com.tcs.certificacion.calculadoramultiplataforma.util.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyAndroidDriver {

	//private static AppiumDriver<MobileElement> driver;
	private static AndroidDriver<MobileElement> driver;
	public static  MyAndroidDriver enLaApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","7.0");
		capabilities.setCapability("deviceName","1215fcda55b72e04");
		capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
		capabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");	
		capabilities.setCapability("noReset", "true");
		driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		return new MyAndroidDriver();
	}
	public AndroidDriver<MobileElement> Android(){
		return driver;
	}
}
