package com.java.access;

public class Main extends HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello = new HelloWorld();
		
		hello.sayHelloPublic();
		
		hello.sayHelloProtected();
		
		hello.sayHelloDefault();
	}

}
