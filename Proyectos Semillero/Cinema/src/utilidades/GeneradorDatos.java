package utilidades;

import modelos.Pelicula;

public class GeneradorDatos {
	private static final String nombrePelicula[] = 
		{"Terminator",
		 "El Señor de los Anillos",
		 "Bajos instintos",
		 "El conjuro",
		 "La Monja",
		 "Los Minios",
		 "Los  Juegos del Hambre",
		 "Hereditario",
		 "El origen",
		 
		 
		};
	private static final String nombrePeronas[] = 
		{"Diana",
		 "Pedro",
		 "Jurgen",
		 "Elvis",
		 "Daniela",
		 "Pepito",
		 "Oscar",
		 "Samuel",
		 "Lorena",
		 
		 
		};
	
	public static Pelicula getPelicula()
	{
		return new Pelicula( " ", 1, 1," ");
	}
	
}
