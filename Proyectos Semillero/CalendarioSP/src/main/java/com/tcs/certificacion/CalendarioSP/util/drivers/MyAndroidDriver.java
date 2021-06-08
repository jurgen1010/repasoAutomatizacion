package com.tcs.certificacion.CalendarioSP.util.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyAndroidDriver {
	
	private static AndroidDriver<MobileElement> driver;
	public static MyAndroidDriver enLaApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","7.0");
		capabilities.setCapability("deviceName","1215fcda55b72e04");
		capabilities.setCapability("appPackage","com.samsung.android.calendar");
		capabilities.setCapability("appActivity","com.android.calendar.AllInOneActivity");
		//capabilities.setCapability("automationName", "UiAutomator2");
		//capabilities.setCapability("noReset", "true");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		return new MyAndroidDriver();
	}
	public AndroidDriver<MobileElement> Android(){
		return driver;
	}
	
	public static AppiumDriver<MobileElement> actual(){
		return driver;
	}
}
