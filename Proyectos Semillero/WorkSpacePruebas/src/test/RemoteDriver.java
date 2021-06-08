package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriver {

	private WebDriver driver;
	
	@Before
	public void before() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		driver = new RemoteWebDriver(new URL("http://10.101.208.92:4444/wd/hub"),capabilities);
	}
	@Test
	public void star() {
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("dragon ball super");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@After
	public void after() {
		driver.quit();
	}
}
