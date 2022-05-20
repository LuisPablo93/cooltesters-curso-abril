package com.java.encapsulation;

public class Main {
	public static void main(String[] args) {

		Gato gato1 = new Gato();
//	gato1.colorOjos="Verde";
//	gato1.edad=6;
//	gato1.numPatas=4;
//	gato1.raza="Egipcio";

		gato1.setColorOjos("Azul");
		gato1.setEdad(3);
		gato1.setNumPatas(8);
		gato1.setRaza("Egipcio");

//	String hablar = maullar();

		System.out.println("Mi Gato tiene la Edad de: " + gato1.getEdad() + " años y tiene un Numero de: "
				+ gato1.getNumPatas() + " patas");

	}
}
