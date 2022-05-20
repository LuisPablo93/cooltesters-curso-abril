package com.java.encapsulation;

public class Gato {

	private String colorOjos;
	private int edad;
	private int numPatas;
	private String raza;

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumPatas() {
		if (numPatas > 10) {
			return -1;
		} else
			return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

//Encapsulation

//	public void maullar() {
//		System.out.println("El animal esta maullando");
//	}

}
