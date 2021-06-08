package modelos;

public class Espectador {
	
	private String nombre;
	private double dinero;
	private int edad;
	
	public Espectador(String nombre, double dinero, int edad) {
		this.nombre = nombre;
		this.dinero = dinero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public double getDinero() {
		return dinero;
	}

	public int getEdad() {
		return edad;
	}
	
	public boolean tieneEdad(int edad) {
		return this.edad>=edad;
	}
	
	public boolean tieneDinero(double precio) {
		return precio<=this.dinero;
	}
	
	public void pagar(double precio) {
		this.dinero=this.dinero-precio;
	}

	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", dinero=" + dinero + ", edad=" + edad + "]";
	}
	
	
	
	

}
