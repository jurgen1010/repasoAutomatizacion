package com.tcs.certificacion.traductorgoogle.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.traductorgoogle.interactions.Borrar;
import com.tcs.certificacion.traductorgoogle.userinterface.Traductor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Traducir implements Task{
	
	private String palabra,idiomaOrigen,idiomaDestino;
	
	public Traducir(String palabra) {
		this.palabra=palabra;
		}

	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Traductor.LISTA_IDIOMA_ORIGEN)
				,Click.on(Traductor.IDIOMA_ORIGEN.called("idioma origen "+ idiomaOrigen).of(idiomaOrigen))
				,Click.on(Traductor.LISTA_IDIOMA_DESTINO)
				,Click.on(Traductor.IDIOMA_DESTINO.called("idioma destino "+idiomaDestino).of(idiomaDestino))
				,Enter.theValue(palabra).into(Traductor.PALABRA_A_TRADUCIR)
				);		
//		actor.attemptsTo(Borrar.campo(Traductor.PALABRA_A_TRADUCIR));
//		System.out.println("kyai");
	}
	
	public static Traducir laPalabra(String palabra) {
		return instrumented(Traducir.class,palabra);
	}
	
	public Traducir conElIdiomaOrigen(String idiomaOrigen) {
		this.idiomaOrigen=idiomaOrigen;
		return this;
	}
	
	public Traducir yElIdiomaDestino(String idiomaDestino) {
		this.idiomaDestino=idiomaDestino;
		return this;
	}

}
