package com.codurance.katalyst.javierrlabkatas.arithmetics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArithmeticsTest {

	static Arithmetics arithmetics;

	@BeforeAll
	public static void initAll() {
		arithmetics = new Arithmetics();
	}

	@Test
	public void parse_empty_parenthesis() throws IllegalArgumentException {
		assertEquals(0, arithmetics.parse("()"));
		assertEquals(0, arithmetics.parse("(())"));
	}

	@Test
	public void parse_wrong_parentesis() {
		assertThrows(IllegalArgumentException.class,
				() -> arithmetics.parse("())"),
				Arithmetics.INVALID_RECORD_ERROR);
		assertThrows(IllegalArgumentException.class,
				() -> arithmetics.parse("(()"),
				Arithmetics.INVALID_RECORD_ERROR);
	}

	@Test
	public void parse_1_plus_1() {
		assertEquals(2, arithmetics.parse("( 1 + 1 )"));
	}

}
