package com.tcs.certificacion.todolist.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://50hw014108:8109/")

public class Todolist extends PageObject{

	@FindBy(xpath="//input[@placeholder='Inserta una tarea nueva']")
	WebElementFacade txtTarea;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg']")
	WebElementFacade btnAñadir;
	
	@FindBy(xpath="//div[@class='col-sm-4 col-sm-offset-4']//div//label")
	List<WebElementFacade> listaTareas;
	
	@FindBy(xpath="//span[@class='label label-info ng-binding']")
	WebElementFacade nroTareas;
	
	
	public void clickbtnAñadir()
	{
		btnAñadir.click();
	}
	
	public void escribirTarea(String tarea) {
		txtTarea.sendKeys(tarea);
	}
	
	public List<WebElementFacade> getlistaTareas() {
		return listaTareas;
	}
	
	public String getnroTareas() {
		return nroTareas.getText();
	}
}
