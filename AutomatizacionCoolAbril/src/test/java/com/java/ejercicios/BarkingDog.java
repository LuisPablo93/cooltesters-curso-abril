package com.java.ejercicios;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shouldWakeUp(true, 23);
	}

	public static void shouldWakeUp(boolean barking, int hourOfDay) {
		if (barking == true) {
			if (hourOfDay > 1 && hourOfDay < 8) {
				System.out.println("TRUE");
			} else if (hourOfDay > 22 && hourOfDay < 24) {
				System.out.println("TRUE");
			} else {
				System.out.println("FALSE");
			}

		} else if (barking == false) {
			System.out.println("FALSE");
		}
	}
}
