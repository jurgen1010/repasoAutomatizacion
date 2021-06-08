package com.tcs.certificacion.calculadora.operador;

public class Operador {
	private static String operador;
	public Operador(String operador) {
		this.operador = operador;
	}
	public static void aritmetico() {
		if(operador.equals("+")) {
			operador="Más";
		}
	}
	
	public static String getOperador() {
		return operador;
	}
}
