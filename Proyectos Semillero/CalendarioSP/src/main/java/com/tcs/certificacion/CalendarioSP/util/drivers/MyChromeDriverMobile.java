package com.tcs.certificacion.CalendarioSP.util.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyChromeDriverMobile {

	private static AndroidDriver<MobileElement> driver;
	public static MyChromeDriverMobile web() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","7.0");
		capabilities.setCapability("deviceName","1215fcda55b72e04");
		capabilities.setCapability("browserName", "Chrome");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Software Edition Assurance\\Drivers navegadores\\ChromeDriver.exe");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		return new MyChromeDriverMobile();
	}
	public AndroidDriver<MobileElement> enLaPagina(String url) {
		driver.get(url);
		return driver;
	}
}
