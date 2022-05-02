package com.java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Dias[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		System.out.println(Dias[1]);

		String Nombres[][] = new String[2][2];
		Nombres[0][0] = "Luis";
		Nombres[0][1] = " Subias";
		Nombres[1][0] = "Carlos";
		Nombres[1][1] = " Hernández";

		System.out.println("Mi nombre y Apellido es: " + Nombres[0][0] + Nombres[0][1]);
		System.out.println("El nombre de mi compañero es: " + Nombres[1][0] + Nombres[1][1]);

		String Colores[][][] = new String[1][1][1];
		Colores[0][0][0] = "Naranja";
		System.out.println(Colores[0][0][0]);

	}

}
