package com.bancolombia.certificacion.banistmo.models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;


public class Datos {
	
	private static String usuario,contrasena,cuentaOrigen,cuentaDestino,valorTransferencia,tipotransferencia;
	
	public static String getTipotransferencia() {
		return tipotransferencia;
	}
	public static String getUsuario() {
		return usuario;
	}
	public static String getContrasena() {
		return contrasena;
	}
	public static String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public static String getCuentaDestino() {
		return cuentaDestino;
	}
	public static String getValorTransferencia() {
		return valorTransferencia;
	}
	public static void leerData() {
		File archivo = new File("C:\\Users\\1583722\\Desktop\\Ahorcado\\datostransferencia.txt");

		BufferedReader datos = null;
		String linea = "";

		try {
			datos = new BufferedReader(new FileReader(archivo));

			while (datos.ready()) {
				linea = datos.readLine();

			}
			usuario=linea.split(",")[0];
			contrasena=linea.split(",")[1];
			cuentaOrigen=linea.split(",")[2];
			cuentaDestino=linea.split(",")[3];
			valorTransferencia=linea.split(",")[4];
			tipotransferencia=linea.split(",")[5];
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				datos.close();
			} catch (IOException e1) {
			}
		}
		//return linea;

	}

}
