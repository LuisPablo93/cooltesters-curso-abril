package com.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humano Luis=new Humano();
		
		Luis.colorOjos="Cafe";
		Luis.altura=1.68;
		Luis.colorPiel="Blanco";
		Luis.edad=28;
		
		System.out.println("Luis tiene una altura de:"+Luis.altura);
		
		Humano Carlos= new Humano("Azul",1.80,"Blanco",31);
		System.out.println("La edad de carlos ess: "+Carlos.edad);
		
		Carlos.dormir();
		
				
		

	}

}
