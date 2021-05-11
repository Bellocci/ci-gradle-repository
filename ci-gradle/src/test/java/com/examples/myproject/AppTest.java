package com.examples.myproject;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	
	private App app;

	@Before
	public void setup() {
		app = new App();
	}

	@Test
	public void testSayHello() {
		assertThat(app.sayHello()).isEqualTo("Hello");
	}
}
