package com.java;

public class Humano {

	String colorOjos;
	double altura;
	String colorPiel;
	int edad;

	// Constructor
	public Humano(String colorOjos, double altura, String colorPiel, int edad) {
		this.colorOjos = colorOjos;
		this.altura = altura;
		this.colorPiel = colorPiel;
		this.edad = edad;
	}

	public Humano() {

	}

	public void dormir() {
		System.out.println("El Humano esta Durmiendo");
	}

}
