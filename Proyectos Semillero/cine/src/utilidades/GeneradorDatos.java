package utilidades;

import modelos.Asiento;
import modelos.Cine;
import modelos.Espectador;
import modelos.Pelicula;

public class GeneradorDatos {
	
	private static final String nombrePelicula[]= 
		{
			"Terminator",
			"El Señor de los Anillos",
			"Bajos instintos",
			"El Conjuro",
			"La Monja",
			"Los Minions",
			"Los Juegos del Hambre",
			"Hereditario",
			"El Origen"
		};
	
	private static final String nombrePersonas[]=
		{
			"Diana",
			"Pedro",
			"Juan",
			"Elvis",
			"Steven",
			"Deicy",
			"Johana",
			"Alejandro",
			"Jurgen",
			"Salustrio"
		};
	
	public static Pelicula getPelicula() {
		return new Pelicula(nombrePelicula[aleatorio(0, nombrePelicula.length-1)], aleatorio(90, 240), aleatorio(8, 18), nombrePersonas[aleatorio(0, nombrePersonas.length-1)]);	}
	
	public static Espectador getEspectador() {
		return new Espectador(
				nombrePersonas[aleatorio(0, nombrePersonas.length-1)],
				Double.valueOf(aleatorio(5000, 15000)),
				aleatorio(2, 30));
	}
	
	public static Asiento getAsiento(Cine cine) {
		return new Asiento(
				(char) aleatorio(Integer.valueOf('A'), Integer.valueOf((char)('A' + cine.getColumnas()-1))),
						aleatorio(0, cine.getFilas()-1));					
	}
	
	public static double getPrecio() {
		return Double.valueOf(aleatorio(6000, 12000));
	}
	
	private static int aleatorio(int limiteInf, int limiteSup ) {
		return (int) (Math.random() * (limiteSup-limiteInf)) + limiteInf;
	}
	
}
