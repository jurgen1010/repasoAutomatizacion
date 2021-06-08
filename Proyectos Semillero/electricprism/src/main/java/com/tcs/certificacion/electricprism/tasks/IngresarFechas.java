package com.tcs.certificacion.electricprism.tasks;

import com.tcs.certificacion.electricprism.interactions.CambiarFrame;
import com.tcs.certificacion.electricprism.interactions.RemoveReadOnly;
import com.tcs.certificacion.electricprism.userinterfaces.PageHome;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class IngresarFechas implements Task{

	private String fecha1,fecha2,fecha3;
	public IngresarFechas(String fecha1) {
		this.fecha1=fecha1;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
				actor.attemptsTo(CambiarFrame.switchFrame(),
				RemoveReadOnly.enTarget(PageHome.CAMPO_FECHA_DEFAULT).conFecha(fecha1),
				RemoveReadOnly.enTarget(PageHome.CAMPO_FECHA_DASHBOARD).conFecha(fecha2),
				RemoveReadOnly.enTarget(PageHome.CAMPO_FECHA_EXPERIMENTAL).conFecha(fecha3));
		
		
	}
	public static IngresarFechas enDefault(String fecha1) {
		return Tasks.instrumented(IngresarFechas.class, fecha1);
	}
	public IngresarFechas enDashBoard(String fecha2) {
		this.fecha2=fecha2;
		return this;
	}
	public IngresarFechas enExperimental(String fecha3) {
		this.fecha3=fecha3;
		return this;
	}
}
