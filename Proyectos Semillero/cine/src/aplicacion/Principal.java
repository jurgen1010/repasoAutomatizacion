package aplicacion;

import static utilidades.GeneradorDatos.getEspectador;
import static utilidades.GeneradorDatos.getPelicula;
import static utilidades.GeneradorDatos.getPrecio;

import modelos.Asiento;
import modelos.Cine;
import modelos.Espectador;
import utilidades.GeneradorDatos;

public class Principal {

	public static void main(String[] args) {
		
		Cine cine=new Cine(getPelicula(), getPrecio(), 20, 20);
		cine.mostrar();
		while (cine.cineLLeno()==false) {
			Espectador espectador=getEspectador();
			if (cine.puedeAcceder(espectador)){
				Asiento asiento=GeneradorDatos.getAsiento(cine);
				cine.asignar(asiento.getFila(), asiento.getLetra(), espectador);
			}
			else {
				System.out.println("no pudo entrar " + espectador);
			}
			
		}
		
		cine.mostrar();
		
	}

}
