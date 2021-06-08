package com.tcs.certificacion.calculadoramobile.util.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;



public class CalendarioSwipe {

	private static AndroidDriver<MobileElement> driver;
	@Before
	public void before() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","7.0");
		capabilities.setCapability("deviceName","1215fcda55b72e04");
		capabilities.setCapability("appPackage","com.samsung.android.calendar");
		capabilities.setCapability("appActivity","com.android.calendar.AllInOneActivity");	
		driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		
	}
	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Test
	public void calendario() throws InterruptedException {
		System.out.println("RUNNING TEST CASE");
		
		WebElement mes = driver.findElement(By.xpath("//*[@resource-id='com.samsung.android.calendar:id/title_string_main']"));
		
		while (!mes.getText().equalsIgnoreCase("ABR.")) {
			TouchAction action = new TouchAction(driver);
			action.press(1200, 1200);
			action.moveTo(300, 1200);
			action.release().perform();
			mes = driver.findElement(By.xpath("//*[@resource-id='com.samsung.android.calendar:id/title_string_main']"));
		}
		

	}
}
