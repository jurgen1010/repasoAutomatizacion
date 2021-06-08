package com.tcs.certificacion.calculadora.methods;

public class CalculadoraMethods {
	
	private  String numero, numero2;
	
	public CalculadoraMethods(String numero, String numero2) {
		this.numero = numero;
		this.numero2 = numero2;
	}
	
	public  void convertir() {
		if(this.numero.equals("2"))
			this.numero = "Dos";
		if(this.numero2.equals("3"))
			this.numero2 = "Tres";
	}
	
	public  String getNumero() {
		return this.numero;
	}
	
	public  String getNumero2() {
		return this.numero2;
	}
}
