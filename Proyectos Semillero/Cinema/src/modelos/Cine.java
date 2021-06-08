package modelos;

public class Cine {
		private Pelicula pelicula;
		private double precio;//ningun atributo puede ir publico en una clase, a no ser que sea una constante
		private Asiento asientos[][];
		
		public Cine(Pelicula pelicula, double precio, int filas, int columnas) {
			this.pelicula=pelicula;
			this.precio= precio;
			asientos = new Asiento[filas][columnas];//instanciamos las dimensiones del nuevo cine
			llenarAsientos();
			}
		
		public void llenarAsientos()
		{
			int fila = asientos.length;
			for (int i = 0; i < asientos.length; i++) {//filas
				for (int j = 0; j < asientos[0].length; j++) {//columnas
					asientos[i][j] = new Asiento((char)('A'+ j), i);
					
				}
				fila--;
			}
		}
		
		private Asiento getAsiento(int fila, char letra) {
			//return asientos[fila][letra];
			return asientos[asientos.length-fila][Integer.valueOf((char)(letra - 'A'))];
			
			
		}
		private void asignar(int fila , char letra,Espectador espectador) {
			Asiento asiento=getAsiento(fila,letra);
			if (asiento.ocupado()) {
				System.out.println("asiento ocupado, sera asignado automaticamente");
				for (int i = 0; i < asientos.length; i++) {//filas
					for (int j = 0; j < asientos[0].length; j++) {//columnas
						if(asientos[i][j].ocupado()==false) {
							asiento= asientos[i][j];
						}
						
					}
					
				}
			}
		}
}
