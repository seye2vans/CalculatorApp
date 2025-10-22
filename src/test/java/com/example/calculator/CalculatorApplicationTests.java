package com.example.calculator;

import com.example.calculator.service.calculatorService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CalculatorApplicationTests {

	private calculatorService calculator = new calculatorService();
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
}
