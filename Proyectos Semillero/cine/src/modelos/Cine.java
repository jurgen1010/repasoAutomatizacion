package modelos;

public class Cine {
	
	private Pelicula pelicula;
	private double precio;
	private Asiento asientos[][];
	private int contador=0;
	
	public Cine(Pelicula pelicula, double precio, int filas, int columnas) {
		this.pelicula=pelicula;
		this.precio=precio;
		asientos=new Asiento[filas][columnas];
		llenarAsientos();
	}
	
	public int getFilas() {
		return asientos.length;
	}
	
	public int getColumnas() {
		return asientos[0].length;
	}
	
	
	private void llenarAsientos() {
		int fila=asientos.length;
		for(int i=0;i<asientos.length;i++) {
			for (int j=0;j<asientos[0].length;j++) {
				asientos[i][j]=new Asiento((char) ('A' + j), fila);
			}
			fila--;
		}
		
//		for (int i = 0; i < asientos.length; i++) {
//      for (int j = 0; j < asientos[0].length; j++) {
//          	System.out.print(asientos[i][j].getFila() + " " + (char)asientos[i][j].getLetra() + " ");
//      }
//      System.out.println("");
//  }
		System.out.println("");
	}
	
	private Asiento getAsiento(int fila, char letra) {
		return asientos[asientos.length - fila-1][Integer.valueOf((char)(letra - 'A'))];
	}
	
	public void asignar(int fila, char letra, Espectador espectador) {
		Asiento asiento=getAsiento(fila, letra);
			if (asiento.ocupado()) {
				System.out.println("asiento ocupado, será asignado automaticamente.");
				asiento= getDisponible();
			}
			contador++;
		asiento.setEspectador(espectador);
		System.out.println("cliente asignado al asiento " + asiento.getFila() + asiento.getLetra());
	}
	
	public boolean puedeAcceder(Espectador espectador) {
		return espectador.tieneDinero(precio) && espectador.tieneEdad(pelicula.getEdadMinima());
	}
	
	private Asiento getDisponible() {
		Asiento asiento=null;
		for(int i=0;i<asientos.length;i++) {
			for (int j=0;j<asientos[0].length;j++) {
				if (asientos[i][j].ocupado()==false) {
					asiento=asientos[i][j];
					break;
				}
			}
		}
		return asiento;
	}
	
	
	public  boolean cineLLeno() {

		return getDisponible()==null;
	}
	
	public void mostrar() {
		 
        System.out.println("Información cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
    }
	
}
