package com.tcs.certificacion.todolist.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.tcs.certificacion.todolist.pages.Todolist;

import net.thucydides.core.annotations.Step;

public class TodolistSteps {

	Todolist todolist;
	
	@Step
	public void abrirNavegador() {
		todolist.open();
	}
	@Step
	public void añadirTarea(String tarea) {
		todolist.escribirTarea(tarea);
		todolist.clickbtnAñadir();
	}
	@Step
	public void comparar(String tarea ) {
		String ultimaPos= todolist.getlistaTareas().get(todolist.getlistaTareas().size()-1).getText();
		assertEquals(tarea, ultimaPos);
		System.out.println(ultimaPos);
	}
	@Step
	public void eliminarTarea(String tarea) {
		
		for (WebElement e : todolist.getlistaTareas()) {
			if(e.getText().equals(tarea)) {
				e.click();	
				break;
			}			
		}	
	}
	@Step
	public void validarEliminar(String tarea) {
		boolean prueba=true;
		for (WebElement e : todolist.getlistaTareas()) {
			try {
			if(e.getText().equals(tarea)) {
				e.click();
				prueba=false;
				break;				
			}
			else {
				prueba=true;
			}
			}catch(Exception ex) {
				prueba=true;
			}
		}
		assertTrue(prueba);
	}
}
