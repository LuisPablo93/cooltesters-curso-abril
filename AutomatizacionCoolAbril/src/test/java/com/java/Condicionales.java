package com.java;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limiteVelocidadCarretera=110;
		int limiteVelocidadCalle=80;
		int limiteVelocidadZonaEscolar=50;
		int limiteVelocidad=79;
		boolean isZonaEscolar=false;
		boolean isCalle=true;
		boolean isCarretera=false;
		
		
		
		if (isZonaEscolar)
		{
			 limiteVelocidad=50;
					{
				if (limiteVelocidad > limiteVelocidadZonaEscolar)
					System.out.println("Multa - Zona Escolar");
			 else {
			System.out.println("Descuento - Zona Escolar");
		}
				}
		} else if (isCalle) {
			if (limiteVelocidad > limiteVelocidadCalle) 
				System.out.println("Multa - Calle");
			 else {
				System.out.println("Descuento - Calle");
			}
		} else if (isCarretera)
		{
			if (limiteVelocidad > limiteVelocidadCarretera) 
				System.out.println("Multa - Carretera");
			else {
				System.out.println("Descuento - Carretera");
			}
		}
					
					
		
		

	}

}
