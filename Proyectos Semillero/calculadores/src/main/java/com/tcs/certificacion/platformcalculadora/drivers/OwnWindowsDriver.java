package com.tcs.certificacion.platformcalculadora.drivers;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class OwnWindowsDriver {
	
	private static WindowsDriver<WindowsElement> driver;
	
	public static OwnWindowsDriver hisAppWindows() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
			driver = new WindowsDriver<WindowsElement>(new URL("http://localhost:42000/wd/hub"),capabilities);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new OwnWindowsDriver();
	}
	
	public static WindowsDriver<WindowsElement> on(){
		return driver;
	}
}
