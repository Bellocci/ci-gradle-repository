package com.examples.myproject;

public class App {
	
	// Add method
	public String sayHello(String name) {
		if (name == null)
			return "Hello";
		else
			return "Hello " + name;
	}

	public String sayHello() {
		return sayHello(null);
	}
}
