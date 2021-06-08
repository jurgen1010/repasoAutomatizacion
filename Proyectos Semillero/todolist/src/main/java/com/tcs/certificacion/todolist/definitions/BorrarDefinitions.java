package com.tcs.certificacion.todolist.definitions;

import com.tcs.certificacion.todolist.steps.TodolistSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BorrarDefinitions {

	@Steps
	TodolistSteps todoliststeps;
	@Given("^que Jurgen se encuentra la pagina de Todolist con la tarea (.*) agregada.$")
	public void queJurgenSeEncuentraLaPaginaDeTodolistConLaTareaNadarAgregada(String tarea)  {
	    // Write code here that turns the phrase above into concrete actions
		todoliststeps.abrirNavegador();
		todoliststeps.añadirTarea(tarea);
	    
	}
	
	@When("^el selecciona la tarea (.*).")
	public void elSeleccionaLaTareaNadar(String tarea)  {
	    // Write code here that turns the phrase above into concrete actions
		todoliststeps.eliminarTarea(tarea);
	}

	@Then("^el no podra ver la tarea (.*) en la lista.")
	public void elNoPodraVerLaTareaEnLaLista(String tarea)  {
	    
		todoliststeps.validarEliminar(tarea);
	}
}
