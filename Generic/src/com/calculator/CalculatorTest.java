package com.calculator;

public class CalculatorTest {

	@SuppressWarnings("unchecked")
	public static <T extends Number> T add(T x, T y) {
		Double sum;
		sum = x.doubleValue() + y.doubleValue();
		return (T) sum;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Number> T subtract(T x, T y) {
		Double subtract;
		subtract = x.doubleValue() - y.doubleValue();
		return (T) subtract;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Number> T multiplication(T x, T y) {
		Double multiplication;
		multiplication = x.doubleValue() * y.doubleValue();
		return (T) multiplication;
	}

	public static void main(String[] args) {
		System.out.println(add(10.25, 20));
		System.out.println(subtract(10, 20));
		System.out.println(multiplication(2, 5));
	}

}
