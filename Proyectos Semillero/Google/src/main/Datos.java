package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class Datos {
	static private String[] vector = new String[16];
	
	private String nombres,apellidos,addres,email,telefono,genero,
	lenguages,skills,hobbieCricket,hobbieMovie,hobbieHockey,country1,conuntry2,
	añoNacimiento,mesNacimiento,diaNacimiento,password,confirmPassword;
	// ArrayList<String> al = new ArrayList<String>();
	public String getNombres() {
		return nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getAddres() {
		return addres;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getGenero() {
		return genero;
	}
	public String getLenguages() {
		return lenguages;
	}
	public String getSkills() {
		return skills;
	}
	public String getHobbieCricket() {
		return hobbieCricket;
	}
	public String getHobbieMovie() {
		return hobbieMovie;
	}
	public String getHobbieHockey() {
		return hobbieHockey;
	}
	public String getCountry1() {
		return country1;
	}
	public String getConuntry2() {
		return conuntry2;
	}
	public String getAñoNacimiento() {
		return añoNacimiento;
	}
	public String getMesNacimiento() {
		return mesNacimiento;
	}
	public String getDiaNacimiento() {
		return diaNacimiento;
	}
	public String getPassword() {
		return password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public static Datos Datos() throws FileNotFoundException, IOException {
		Leertxt();
		return new Datos(vector[0],vector[1],vector[2],vector[3],vector[4],
				vector[5],vector[6],vector[7],vector[8],vector[9],vector[10],
				vector[11],vector[12],vector[13],vector[14],vector[15],vector[16]);
	}
	
	private Datos(String nombres, String apellidos,String addres,String email,String telefono,
			String genero,String hobbieCricket,String hobbieMovie,String hobbieHockey,
			String lenguages,String skills,String country1,String country2,
			String añoNacimiento,String mesNacimiento,String diaNacimiento,String password) {
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.addres=addres;
		this.email=email;
		this.telefono=telefono;
		this.genero=genero;
		this.lenguages=lenguages;
		this.skills=skills;
		this.hobbieCricket=hobbieCricket;
		this.hobbieMovie=hobbieMovie;
		this.hobbieHockey=hobbieHockey;
		this.country1=country1;
		this.conuntry2=country2;
		this.añoNacimiento=añoNacimiento;
		this.mesNacimiento=mesNacimiento;
		this.diaNacimiento=diaNacimiento;
		this.password=password;
	}

	public static void Leertxt() throws FileNotFoundException, IOException {
		String cadena;
		FileReader f = new FileReader("C:\\Users\\1583722\\Desktop\\Ahorcado\\Datos.txt");
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			vector = cadena.split(",");
			

		}
//		for (int i = 0; i < vector.length; i++) {
//			System.out.println("[" + vector[i] + "]");
//		}
		b.close();
	}



}
