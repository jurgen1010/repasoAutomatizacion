package com.google.certificacion.googletraductor.steps;

import static org.junit.Assert.assertEquals;

import com.google.certificacion.googletraductor.pages.TraductorGooglePage;

import net.thucydides.core.annotations.Step;

public class Traductor {
	
	TraductorGooglePage traductorgoogle;
	
	@Step
	public void seleccionarIdiomaOrigen(String idiomaorigen) {
		traductorgoogle.clickIdiomaOrigen();
		traductorgoogle.elegirIdiomaOrigen(idiomaorigen);
	}
	
	@Step
	public void seleccionarIdiomaDestino(String idiomadestino) {
		traductorgoogle.clickIdiomaDestino();
		traductorgoogle.elegirIdiomaDestino(idiomadestino);
	}
	
	@Step
	public void escribirTraduccion(String palabra) {
		traductorgoogle.escribirTraduccion(palabra);
	}
	
	@Step 
	public String palabraTraduccion() {
		return traductorgoogle.palabraTraduccion();
	}

}
