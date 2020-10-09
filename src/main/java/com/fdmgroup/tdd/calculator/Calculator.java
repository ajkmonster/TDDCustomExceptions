package com.fdmgroup.tdd.calculator;

public class Calculator implements ICalculator{

	private static int result;
	
	public int add(int x, int y) throws CustomException {
		if (x == Integer.MAX_VALUE || y == Integer.MAX_VALUE) {
			throw new CustomException("Integer is too big");
		}
		else {
		result = x + y;
		return result;
		}
	}

	public int subtract(int x, int y) {
		result = x - y;
		return result;
	}

	public int mult(int x, int y) {
		result = x * y;
		return result;
	}

	public int div(int x, int y) {
//		if (y == 0) {
//			System.out.println("Zero division error");
//			result = 0;
//		}
//		else {
			result = x/y;
//		}
		
		return result;
	}

	
}
