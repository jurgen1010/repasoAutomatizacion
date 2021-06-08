package modelos;

public class Asiento {
	private char letra;
	private int fila;
	private Espectador espectador=null;
	
	
	public Asiento(char letra, int fila) {
		this.letra = letra;
		this.fila = fila;
		this.espectador=null;
	}


	public char getLetra() {
		return letra;
	}


	public void setLetra(char letra) {
		this.letra = letra;
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public Espectador getEspectador() {
		return espectador;
	}


	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
	
	public boolean ocupado() {
		return espectador!=null;
	}
	
	@Override
	public String toString() {
		if(ocupado()) return "el asiento " + fila + letra + " esta ocupado por " + espectador;
		return "el asiento " + fila + letra + " esta vacío";
	}
	
}
