package com.google.certificacion.googlebusqueda.steps;

import com.google.certificacion.googlebusqueda.pages.GoogleHomePage;

import net.thucydides.core.annotations.Step;

public class BuscarGoogle {

	GoogleHomePage googleHomePage;
	
	@Step
	public void abrirNavegador() {
		googleHomePage.open();
	}
	
	@Step
	public void buscarGoogle(String expresion) {
		googleHomePage.ingresarBusqueda(expresion);
		googleHomePage.clickBuscar();
	}
}
