package com.stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import stringCalculatorTDD.Calculator;

public class CalculatorTest {
	// TODO: for empty string it will return zero
	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	// TODO: for single string it will return same string
	// TODO: for two strings it will return sum of the two

}
