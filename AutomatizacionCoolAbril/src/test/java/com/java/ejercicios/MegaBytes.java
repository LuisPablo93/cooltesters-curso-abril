package com.java.ejercicios;

public class MegaBytes {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		int XX = kiloBytes;
		int YY;
		int ZZ;
//		int MM;

		YY = XX / 1024;
		ZZ = XX % 1024;

		if (kiloBytes > 0) {

			System.out.println(+XX + " KB = " + YY + " MB y " + ZZ + " KB");
//			System.out.println(MM);
		} else {
			System.out.println("Valor no válido");
		}
	}

}
