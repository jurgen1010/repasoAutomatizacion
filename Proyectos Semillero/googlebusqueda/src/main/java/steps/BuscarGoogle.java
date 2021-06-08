package steps;

import net.thucydides.core.annotations.Step;
import pages.GoogleHomePage;

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
