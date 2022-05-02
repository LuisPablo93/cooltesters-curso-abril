package com.java;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
//for		
		for (i = 1; i <= 10; i++) {
			System.out.println("Numero For:" + i);
		}

		System.out.println("$$$$$$$$$$$$$$$$$$");
//while		
		while (i <= 20) {
			System.out.println("Numero While:" + i);
			i++;
		}

		System.out.println("$$$$$$$$$$$$$$$$$$");
//do while
		do {
			System.out.println("Numero do While:" + i);
			i++;
		} while (i <= 30);

	}
}
