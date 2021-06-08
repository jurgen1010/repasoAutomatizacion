package com.tcs.certificacion.calculadora.drivers;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class OwnRemoteWindowsDriver {
	private static WindowsDriver<WindowsElement> driver;
	
	public static OwnRemoteWindowsDriver hisBrowser() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
//			capabilities.setCapability("platformName", "Windows");
//			capabilities.setCapability("deviceName", "WindowsPC");
			driver = new WindowsDriver<WindowsElement>(new URL("http://localhost:4723"),capabilities);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new OwnRemoteWindowsDriver();
	}
	
	public static WindowsDriver<WindowsElement> on() {
		return driver;
	}
}
