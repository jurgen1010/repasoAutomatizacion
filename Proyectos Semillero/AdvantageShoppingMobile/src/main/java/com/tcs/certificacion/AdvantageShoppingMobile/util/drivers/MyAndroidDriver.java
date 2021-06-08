package com.tcs.certificacion.AdvantageShoppingMobile.util.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyAndroidDriver {
	private static AppiumDriver<MobileElement> driver;
	public static MyAndroidDriver installApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","7.1.1");
		capabilities.setCapability("deviceName","emulator-5554");
		capabilities.setCapability("app", "C:\\Users\\1583722\\Downloads\\Advantage+demo+1_1_6.apk");
		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		return new MyAndroidDriver();
	}
	public static MyAndroidDriver openApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","7.0");
		capabilities.setCapability("deviceName","1215fcda55b72e04");
		capabilities.setCapability("appPackage", "com.Advantage.aShopping");
		capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		return new MyAndroidDriver();
	}
	public static MyAndroidDriver uninstallApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","8.1.0");
		capabilities.setCapability("deviceName","emulator-5554");
		capabilities.setCapability("app", "C:\\Users\\1583722\\Downloads\\Advantage+demo+1_1_6.apk");
		capabilities.setCapability("fullReset", "true");
		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		return new MyAndroidDriver();
		
	}
	public AppiumDriver<MobileElement> getDriver(){
		return driver;
	}
}
