package com.java.ejercicios;

public class SumaImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isOdd(14);
		suOdd(1, 10);
	}

	public static void isOdd(int number) {

		if (number < 0) {
			System.out.println("FALSE");
			number = 0;
		} else if (number % 2 > 0) {
			System.out.println("TRUE");
			number = 1;
		} else {
			System.out.println("FALSE");
			number = 0;
		}
	}

	public static void suOdd(int start, int end) {
		int play = start;
		String sumRango []= new String [start];
		
		if (end < start && start < 0 && end < 0) {
			System.out.println("-1");
		} else {
			for (start = play; start <= end; start++) {
				isOdd(start);
			
				System.out.println(start);
				start++;
			}

		}

	}
}
