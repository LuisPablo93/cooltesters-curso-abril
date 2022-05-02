package com.java.ejercicios;

public class imprimirVerificador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEqual(9, 9, 9);
	}

	public static void printEqual(int x, int y, int z) {
		if (x == y && y == z) {
			System.out.println("Todos los numeros son iguales");
		} else if (x != y && y != z) {
			System.out.println("Todos los numeros son diferentes");

		} else {
			System.out.println("Ni todos son iguales o diferentes");
		}

	}

}
