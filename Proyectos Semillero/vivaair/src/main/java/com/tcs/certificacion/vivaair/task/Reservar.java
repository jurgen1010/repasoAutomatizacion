package com.tcs.certificacion.vivaair.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.vivaair.userinterfaces.ReservarVuelo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Reservar implements Task{

	private String nombres,apellidos,genero,numerodocumento,asistencia,email,celular;
	public Reservar (String nombres) {
		this.nombres=nombres;
	}
	public <T extends Actor> void performAs(T actor) {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(Enter.theValue(nombres).into(ReservarVuelo.NOMBRES),
					     Enter.theValue(apellidos).into(ReservarVuelo.APELLIDOS),
					     Click.on(ReservarVuelo.LISTA_GENERO),
					     Click.on(ReservarVuelo.OPCION_GENERO.of(genero)),
					     Enter.theValue(numerodocumento).into(ReservarVuelo.NUMERO_DE_DOCUMENTO),
					     Click.on(ReservarVuelo.ASISTENCIA.of(asistencia)),
					     Enter.theValue(email).into(ReservarVuelo.EMAIL),
					     Enter.theValue(email).into(ReservarVuelo.CONFIRMAR_EMAIL),
					     Enter.theValue(celular).into(ReservarVuelo.CELULAR),
					     Click.on(ReservarVuelo.BOTON_CONTINUAR)
						);
		
	}
	public static Reservar conNombres(String nombres) {
		return instrumented(Reservar.class, nombres);
	}
	public Reservar conApellidos(String apellidos) {
		this.apellidos=apellidos;
		return this;
	}
	public Reservar conGenero(String genero) {
		this.genero=genero;
		return this;
	}
	public Reservar conNroDocumento(String numerodocumento) {
		this.numerodocumento=numerodocumento;
		return this;
	}
	public Reservar conAsistencia(String asistencia) {
		this.asistencia=asistencia;
		return this;
	}
	public Reservar conEmail(String email) {
		this.email=email;
		return this;
	}
	
	public Reservar conCelular(String celular) {
		this.celular=celular;
		return this;
	}

	
}
