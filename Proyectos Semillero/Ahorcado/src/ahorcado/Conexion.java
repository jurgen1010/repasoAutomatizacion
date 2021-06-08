package ahorcado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.swing.JOptionPane;
public class Conexion {
	private static String Palabra;
	private static String Pista;

	public static void ejecutarConexion() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {

			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException cnfex) {

			System.out.println("Problem in loading or " + "registering MS Access JDBC driver");
			cnfex.printStackTrace();
		}

		try {

			String dbURL = "jdbc:ucanaccess://C:\\Users\\1583722\\Desktop\\Material de estudio\\Java\\Palabras1.accdb";

			connection = DriverManager.getConnection(dbURL);
			System.out.println("Se conectó exitosamente a la BD");
			statement = connection.createStatement();
			int IdAleatorio = new Random().nextInt(10) + 1;
			resultSet = statement.executeQuery("SELECT * FROM Palabras WHERE ID ="+IdAleatorio);

			while (resultSet.next()) {
				System.out.println(resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t");
				Palabra = resultSet.getString(2);
				Pista = resultSet.getString(3);
			}
			
		} 
		catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
	}

	public static String getPalabra() {
		return Palabra;
	}

	public static void setPalabra(String palabra) {
		Palabra = palabra;
	}

	public static String getPista() {
		return Pista;
	}

	public static void setPista(String pista) {
		Pista = pista;
	}

	
}
