package com.fdmgroup.tdd.roman;

public class RomanCalculator implements IRoman {

	private int result;
	
	public int convert(String input) {
		
		if(input.contentEquals("I")) {
			result = 1;
		}
		else if (input.contentEquals("X")){
			result = 10;
		}
		return result;
	}
}
