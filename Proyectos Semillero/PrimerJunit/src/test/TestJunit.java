package test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import test.Datos;


public class TestJunit {
	
	WebDriver driver;
	static Datos datos;
	@Before
	public void precondicion()  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1583722\\Desktop\\Selenium\\ChromeDriver.exe");//ruta de donde se encuentra la capabilty
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	@Test
	public void prueba1() throws FileNotFoundException, IOException, InterruptedException {
		datos =Datos.Datos();
		WebElement txtfirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtfirstName.sendKeys(datos.getNombres());
		
		WebElement txtlastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastName.sendKeys(datos.getApellidos());
		
		WebElement txtAddres = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAddres.sendKeys(datos.getAddres());
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		txtEmail.sendKeys(datos.getEmail());
		
		WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		txtPhone.sendKeys(datos.getTelefono());
		
		if(datos.getGenero().equals("Male")) {
		WebElement radioMale = driver.findElement(By.xpath("//input[@value='Male']"));
		radioMale.click();
		}
		else {
			WebElement radioFemale = driver.findElement(By.xpath("//input[@value='Female']"));
			radioFemale.click();
		}
		
		if(datos.getHobbieCricket().equals("S")) {
		WebElement selectHobbieCricket = driver.findElement(By.xpath("//input[@value='Cricket']"));
		selectHobbieCricket.click();
		}
		
		if(datos.getHobbieMovie().equals("S")) {
			WebElement selectHobbieMovie = driver.findElement(By.xpath("//input[@value='Movies']"));
			selectHobbieMovie.click();
		}
		
		if(datos.getHobbieHockey().equals("S")) {
			WebElement selectHobbieHockey = driver.findElement(By.xpath("//input[@value='Hockey']"));
			selectHobbieHockey.click();
		}
		WebElement selectcampoLuenguaje = driver.findElement(By.xpath("//div[@id='msdd']"));
		selectcampoLuenguaje.click();
		
		WebElement selectLuenguaje = driver.findElement(By.xpath("//a[contains(text(),'"+datos.getLenguages()+"')]"));
		selectLuenguaje.click();
		
		
		WebElement selectBody = driver.findElement(By.xpath("//body[@ng-controller='FormCtrl']"));
		selectBody.click();
		
		WebElement selectCampoSkill = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		selectCampoSkill.click();
		
		WebElement selectSkills = driver.findElement(By.xpath("//option[@value='"+datos.getSkills()+"']"));
		selectSkills.click();
		
		selectBody.click();
		
		WebElement selectCampoCountry = driver.findElement(By.xpath("//select[@ng-model='country']"));
		selectCampoCountry.click();
		
		WebElement selectCountry = driver.findElement(By.xpath("//option[@value='"+datos.getCountry1()+"']"));
		selectCountry.click();
		
		selectBody.click();
		
		WebElement selectComboCountry = driver.findElement(By.xpath("//span[@role='presentation']"));
		selectComboCountry.click();
		
		WebElement txtCountry = driver.findElement(By.xpath("//input[@type='search']"));
		txtCountry.click();
		
		txtCountry.sendKeys(datos.getConuntry2());
		txtCountry.sendKeys(Keys.ENTER);
		
		WebElement selectComboYear = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		selectComboYear.click();
		
		
		WebElement selectYear = driver.findElement(By.xpath("//*[text()='"+datos.getAñoNacimiento()+"']"));
		selectYear.click();
		
		WebElement selectComboMounth = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		selectComboMounth.click();
		
		WebElement selectMounth = driver.findElement(By.xpath("//*[text()='"+datos.getMesNacimiento()+"']"));
		selectMounth.click();
		
		WebElement selectComboDay = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		selectComboDay.click();
		
		WebElement selectDay = driver.findElement(By.xpath("//*[text()='"+datos.getDiaNacimiento()+"']"));
		selectDay.click();
		
		WebElement selectPassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		selectPassword.sendKeys(datos.getPassword());
		
		WebElement selectSecondPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		selectSecondPassword.sendKeys(datos.getPassword());
		
		WebElement selectFileUpload = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		selectFileUpload.sendKeys("C:\\Users\\1583722\\Desktop\\Ahorcado\\Google\\goku.jpg");
		
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		btnSubmit.click();
		
		Thread.sleep(5000);
		
		WebElement resultado = driver.findElement(By.xpath("//*[text()='EDIT']"));
		assertEquals("EDIT",resultado.getText());//resultado prueba vs result esperado
		//resultado.isEnabled();//forma de saber si se encuentra el elemento en la pagina
		//System.out.println(resultado.getAttribute("data-mounth"));//toma el atributo dentro de la etiqueta
	}
	
	@After
	public void poscondicion(){
		driver.close();
	}
}
