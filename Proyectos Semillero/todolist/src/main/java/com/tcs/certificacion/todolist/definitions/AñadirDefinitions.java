package com.tcs.certificacion.todolist.definitions;

import com.tcs.certificacion.todolist.steps.TodolistSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AñadirDefinitions {

	@Steps
	TodolistSteps todoliststeps;

	@Given("^que Jurgen se encuentra en la pagina de Todolist")
	public void queJurgenSeEncuentraEnLaPaginaDeTodolist()  {
	
		todoliststeps.abrirNavegador(); 
    
	}

	@When("^el ingresa la (.*).")
	public void elIngresaLaComer(String tarea)  {
	
		todoliststeps.añadirTarea(tarea);
		
	}

	@Then("^el podra ver la tarea (.*) en la lista.")
	public void elPodraVerLaTareaEnLaLista(String tarea)  {
    
		todoliststeps.comparar(tarea);
    
	}
}
