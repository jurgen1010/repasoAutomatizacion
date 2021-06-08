package com.tcs.certificacion.calculadora.methods;

public class CalculadoraMethods {
	private static String numero, numero2;
	
	public CalculadoraMethods(String numero, String numero2) {
		this.numero = numero;
		this.numero2 = numero2;
	}
	
	public static  void convertir() {
		if(numero.equals("2")) {
			numero = "Dos";
		}
		
		if(numero2.equals("3")) {
			numero2 = "Tres";
		}
	}
	
	public static String getNumero() {
		return numero;
	}
	
	public static String getNumero2() {
		return numero2;
	}
}
