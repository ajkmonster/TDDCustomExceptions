package com.fdmgroup.tdd.calculator;

public interface ICalculator {
	public int add(int x ,int y) throws CustomException;
	public int subtract(int x, int y);
	public int mult(int x, int y);
	public int div(int x, int y);
}
