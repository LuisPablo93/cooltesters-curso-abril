package com.java.ejercicios;

public class verificadorSumaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hasEqualSum(2, 1, 3);

	}

	public static void hasEqualSum(int x, int y, int z) {
		int sumaNum = x + y;

		if (z == sumaNum) {
			System.out.println("TRUE");
		} else
			System.out.println("FALSE");
	}

}
