package com.examples.myproject;

public class App {

	public String sayHello() {
		return "Hello";
	}
	
	public String sayHelloWorld() {
		String hello = sayHello();
		String world = "World";
		System.out.println(hello + " " + world);
		return hello + world;
	}
}
