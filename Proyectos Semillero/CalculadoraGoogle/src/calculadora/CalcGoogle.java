package calculadora;

import org.openqa.selenium.WebDriver;

public class CalcGoogle {

	public static  double suma(double a, double b) {
		return a+b;
	}
	
	public static double resta(double a, double b) {
		return a-b;
	}
	public static double multiplicacion(double a, double b) {
		return a*b;
	}
	public static double division(double a, double b) {
		
		try {
			return a/b;
		} catch (Exception e) {
			return 0;
		}
		
	}
}
