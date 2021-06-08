package com.tcs.certificacion.cura.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tcs.certificacion.cura.models.LoginPage;

public class LoginPageTest {
	 private WebDriver driver;
	 private LoginPage loginpage;
	@Before
	public void precondicion() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1583722\\Desktop\\Selenium\\ChromeDriver.exe");//ruta de donde se encuentra la capabilty
		driver=new ChromeDriver();
		driver.get("https://www.despegar.com.co/vuelos/");
	}
	@Test
public void prueba() {
		loginpage = new LoginPage(driver);
		loginpage.capturarUsuario();
		loginpage.capturarClave();
		loginpage.clickBtnMakeAppointment();
		
		
	}
	@After
public void poscondicion() {
		driver.close();
	}
}
