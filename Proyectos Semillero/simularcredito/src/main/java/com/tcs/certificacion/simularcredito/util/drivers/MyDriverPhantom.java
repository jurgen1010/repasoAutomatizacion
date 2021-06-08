package com.tcs.certificacion.simularcredito.util.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyDriverPhantom {
	
	private static PhantomJSDriver driver;
	
	public static MyDriverPhantom web() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);                
		caps.setCapability("takesScreenshot", true);  
		caps.setCapability(
		                        PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		                        "C:\\Users\\1583722\\Desktop\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe"
		                    );
		 driver = new  PhantomJSDriver(caps);
		 driver.manage().window().maximize();
		 return new MyDriverPhantom();
		
		
	}
	public PhantomJSDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}
}
