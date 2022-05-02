package com.java.ejercicios;

public class gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isCatPlaying(true, 55);
	}

	public static void isCatPlaying(boolean estacion, int temperatura) {

		if (estacion == true) {
			if (temperatura >= 25 && temperatura <= 45) {
				System.out.println("Verdadero");
			} else {
				System.out.println("Falso");
			}

		} else {
			if (estacion == false)
				if (temperatura >= 25 && temperatura <= 35 && estacion == false) {
					System.out.println("Verdadero");

				} else {
					System.out.println("Falso");
				}
		}
	}
}
//		else if (estacion=false) {
//		do {
//			System.out.println("Verdadero");
//		} 
//		while (temperatura >= 25 && temperatura <=35);
//	} else {
//		System.out.println("Falso");
//	}
