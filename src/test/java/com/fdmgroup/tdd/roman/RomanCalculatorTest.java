package com.fdmgroup.tdd.roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanCalculatorTest {

	@Test
	public void test_Number1() {
		//Arrange
		RomanCalculator roman = new RomanCalculator();
		//Act
		int result = roman.convert("I");
		
		
		//Assert
		assertEquals(1, result);
	}
	
	@Test
	public void test_Number10() {
		RomanCalculator roman = new RomanCalculator();
		
		int result = roman.convert("X");
		
		assertEquals(10, result);
		
	}
}
