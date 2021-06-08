package ahorcado;

public class Jugador {
	private String Nombre;
	private int Intentos=6;
	
	public void setIntentos(int intentos) {
		Intentos = intentos;
	}


	public Jugador(String Nombre) {
		this.Nombre=Nombre;
	}

	
	public int getIntentos() {
		return Intentos;
	}

	
	public String getNombre() {
		return Nombre;
	}
	
}
