package com.java.access;

public class HelloWorld {
	public void sayHelloPublic(){
		System.out.println("Hola Mundo - im public method");
		sayHelloProtected();
	}
	
	protected void sayHelloProtected() {
		System.out.println("Hola Mundo - im protected method");
	}
	
	void  sayHelloDefault() {
		System.out.println("Hola Mundo - im default method");
	}
	
	private void sayHelloPrivate() {

		System.out.println("Hola Mundo - im default method");
	}
	}


