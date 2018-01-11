package com.calculator;

public abstract class Calculator<T> {

	public abstract T addition(T number1, T number2);

	public abstract T subtraction(T number1, T number2);

	public abstract T multiplication(T number1, T number2);
}
