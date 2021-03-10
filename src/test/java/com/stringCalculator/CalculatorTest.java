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
	@Test
	public void shouldReturnNumberOnSingleString() {
		assertEquals(1, Calculator.add("1"));
	}
	// TODO: for two strings separated by commas it will return sum of the two
	@Test
	public void shouldReturnSumofNumbersOnTwoStrings() {
		assertEquals(3, Calculator.add("1,2"));
	}
}
