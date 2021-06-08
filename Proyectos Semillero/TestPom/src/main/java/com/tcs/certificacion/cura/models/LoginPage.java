package com.tcs.certificacion.cura.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	private WebDriver driver;
	
	@FindBy(id="btn-make-appointment")
	private WebElement btnMakeAppointment; 
	@FindBy(xpath="//input[@placeholder='Username' and @readonly]")
	private WebElement txtDemoUser;
	@FindBy(xpath="//input[@placeholder='Password' and @readonly]")
	private WebElement txtDemoPasword;
	@FindBy(xpath="//input[@id='txt-username' and @name='username']")
	private WebElement txtUserName;
	@FindBy(xpath="//input[@id='txt-password' and @name='password']")
	private WebElement txtPassword;
	@FindBy(xpath="//button[@id='btn-login' and @class='btn btn-default']")
	private WebElement btnLogin;
	
	
	public void clickBtnMakeAppointment() {
		btnMakeAppointment.click();
	}
	public String  capturarUsuario() {
		return txtDemoUser.getAttribute("value");
	}
	public String capturarClave() {
		return txtDemoPasword.getAttribute("value");
	}
	
	public LoginPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void escribirUsuario(String user) {
		txtUserName.sendKeys(user);
	}
	public void escribirContrasena(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void clickBtnLogin() {
		btnLogin.click();
	}
}
