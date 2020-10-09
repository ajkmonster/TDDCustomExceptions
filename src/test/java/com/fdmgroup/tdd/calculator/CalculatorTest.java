package com.fdmgroup.tdd.calculator;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.fdmgroup.tdd.roman.RomanCalculator;

public class CalculatorTest {

	final static int error = 0;
	private Calculator calc;
	
	@Before
	public void init() {
		calc = new Calculator();
	}
	
	@Test
	public void test_Number1() throws CustomException {
		//Act
		int result = calc.add(6,4);
		
		
		//Assert
		assertEquals(10, result);
	}
	@Test
	public void test_Number2() {
		//Act
		int result = calc.subtract(6,4);
		
		
		//Assert
		assertEquals(2, result);
	}
	@Test
	public void test_Number3() {

		//Act
		int result = calc.mult(6,4);
		
		
		//Assert
		assertEquals(24, result);
	}
	@Test
	public void test_Number4() {

		//Act
		int result = calc.div(6,4);
		
		
		//Assert
		assertEquals(1, result);
	}
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test 
    public void test_Number5() {
    	thrown.expect(ArithmeticException.class);
    	thrown.expectMessage(("/ by zero"));
        int result = calc.div(6,0);
        
    }
    
    @Test (expected = CustomException.class)
    public void test_Number6() throws CustomException {
//    	thrown.expect(CustomException.class);
//    	thrown.expectMessage("Integer is too big");
        int result = calc.add(Integer.MAX_VALUE,1);
    	
    }

}
