package com.google.certificacion.googletraductor.steps;

import com.google.certificacion.googletraductor.pages.InicioGoogle;

public class IngresarAppTraductor {
	
	InicioGoogle iniciogoogle;
	
	public void abrirNavegador() {
		iniciogoogle.open();
	}
	
	public void abrirAppTraductor() {
		iniciogoogle.clickMenu();
		iniciogoogle.clickTraductor();
	}

}
