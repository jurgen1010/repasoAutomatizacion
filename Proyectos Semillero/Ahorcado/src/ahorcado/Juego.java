package ahorcado;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Juego {

	static Scanner teclado = new Scanner(System.in);
	static Scanner nombre = new Scanner(System.in);
	static Scanner juego = new Scanner(System.in);
	static String palabra;
	static String PalabraAleatoria;
	static int Intentos = 6;
	static  Jugador Player;
	static String Ganador;
	public static void main(String[] args) {

//		for (int i = 0; i < palabrachar.length; i++) {
//			System.out.print("[" + palabrachar[i] + "]");
//		}
		int sw = 0;
		while (sw == 0) {
			Conexion ConexionBD = new Conexion();
			ConexionBD.ejecutarConexion();
			//Player Jugador = new Jugador();
			PalabraAleatoria = ConexionBD.getPalabra();
			char[] palabrachar = PalabraAleatoria.toCharArray();
			char[] vectoraux = new char[palabrachar.length];
			Ganador ="no";
			System.out.println("AHORCADITO");

			System.out.println("Ingrese nombre del jugador:");
			Player = new Jugador(nombre.next()); 
			
			//while (Intentos > 0) 
			while(Player.getIntentos()> 0 && Ganador.equals("no"))
			{
				System.out.println("\nNro de intentos :" + Player.getIntentos());

				System.out.println("\nIngrese una palabra o letra");
				String palabra = teclado.nextLine();
				Comparar(palabra, palabrachar, vectoraux);
				imprimir(Player.getIntentos());
			}
			
			System.out.println("desea seguir jugando:");
			System.out.println("0. Para continuar");
			System.out.println("1. Para salir");
			sw = juego.nextInt();
			//Intentos = 6;
		}

	}

	

	private static void imprimir(int intentos2) {
		switch (intentos2) {
		case 6:
			System.out.println(" ---------------------");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                     	   ");

			System.out.println("__________");
			break;
		case 5:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                         ");
			System.out.println(" |                     	   ");

			System.out.println("__________");
			break;
		case 4:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");

			System.out.println("__________");
			break;

		case 3:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / |   ");
			System.out.println(" |                 /   |   ");
			System.out.println(" |                /    |   ");
			System.out.println(" |                     |   ");

			System.out.println("__________");
			break;

		case 2:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");

			System.out.println("__________");
			break;

		case 1:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println(" |                    /  ");
			System.out.println(" |                   /      ");
			System.out.println(" |                  /       ");

			System.out.println("__________");
			break;

		case 0:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | X  X  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println(" |                    / \\");
			System.out.println(" |                   /   \\  ");
			System.out.println(" |                  /     \\ ");
			System.out.println("       PERDISTES                        ");
		}

	}

	public static void Comparar(String palabra, char[] palabraChar, char[] VectorAux) {
		if (palabra.length() == 1) {
			int aux = 0;
			for (int i = 0; i < palabraChar.length; i++) {
				if (palabraChar[i] == palabra.charAt(0)) {
					VectorAux[i] = palabra.charAt(0);
					aux++;
				}
			}
			if (aux == 0) {
				//Intentos--;
				Player.setIntentos(Player.getIntentos()-1);
			}
			aux = 0;
			for (int i = 0; i < VectorAux.length; i++) {
				System.out.print("[" + VectorAux[i] + "]");
			}
			System.out.println("\n");

		} else if (palabra.length() == palabraChar.length) {

			int cont = 0;
			char palabraRecibidaChar[] = palabra.toCharArray();
			for (int i = 0; i < palabraChar.length; i++) {
				if (palabraRecibidaChar[i] == palabra.charAt(i)) {
					cont++;
				}
			}

			if (palabra.length() == cont) {
				System.out.println("Palabra correcta");
				System.out.println("GANASTES");
				Ganador = "si";
			} else {
				
				System.out.println("Palabra incorrecta");
				for (int i = 0; i < VectorAux.length; i++) {
					System.out.print("[" + VectorAux[i] + "]");
				}
				System.out.println("\n");
				//Intentos--;
				Player.setIntentos(Player.getIntentos()-1);
				
			}
		} else if (palabra.length() != palabraChar.length) {

			System.out.println("Palabra incorrecta");
			for (int i = 0; i < VectorAux.length; i++) {
				System.out.print("[" + VectorAux[i] + "]");
			}
			System.out.println("\n");
			//Intentos--;
			Player.setIntentos(Player.getIntentos()-1);
		}
	}

}
