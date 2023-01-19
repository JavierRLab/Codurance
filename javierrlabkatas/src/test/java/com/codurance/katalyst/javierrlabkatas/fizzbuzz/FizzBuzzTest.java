package com.codurance.katalyst.javierrlabkatas.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * FizzBuzzShould
 */
public class FizzBuzzTest {

	@ParameterizedTest
	@CsvFileSource(resources = { "/com/codurance/katalyst/javierrlabkatas/fizzbuzz/fizzbuzz-testdata.csv" })
	public void convert_number_to_FizzBuzz_string(int input, String expectedOutput) {
		assertEquals(expectedOutput, new FizzBuzz().convert(input));
	}
}