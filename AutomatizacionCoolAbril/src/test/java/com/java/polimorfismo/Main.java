package com.java.polimorfismo;

public class Main {
	
	public static void main (String[] args) {
	
	Animal gato1 = new Gato();
	gato1.speak();
	
	gato1= new Perro();
	gato1.speak();
	
	gato1=new Gallo();
	gato1.speak();
	
}
}