package modelos;

public class Pelicula {
	
	private String titulo;
	private int duracionMin;
	private int edadMinima;
	private String director;
	
	public Pelicula(String titulo, int duracionMin, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracionMin = duracionMin;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public String getDirector() {
		return director;
	}
	
	@Override
	public String toString() {
		return "El titulo es " + titulo + 
				" , la duracion en minutos es " + duracionMin + 
				" , dirigida por " + director + 
				" y la edad minima es " + edadMinima;
	}
	
}
