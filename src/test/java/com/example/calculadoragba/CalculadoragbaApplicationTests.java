package com.example.calculadoragba;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.calculadoragba.model.Calculator;

@SpringBootTest
class CalculadoragbaApplicationTests {

	private Calculator calculator = new Calculator();
	@Test
	void contextLoads() {
	}
	@Test
	public void testSum(){
	assertEquals(5, calculator.sum(3,2));
	}
}
