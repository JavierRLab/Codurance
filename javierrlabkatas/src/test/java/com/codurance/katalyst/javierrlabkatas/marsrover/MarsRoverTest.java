package com.codurance.katalyst.javierrlabkatas.marsrover;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverTest {

	@Test
	public void execute_empty_command() {
		assertEquals("0:0:N", new MarsRover().execute(""));
	}

	@ParameterizedTest
	@CsvSource({ "0:0:E,R", "0:0:S,RR", "0:0:N,RRRR" })
	public void execute_right_rotation(String expectedOutput, String command) {
		assertEquals(expectedOutput, new MarsRover().execute(command));
	}

	@ParameterizedTest
	@CsvSource({ "0:0:W,L", "0:0:S,LL", "0:0:E,LLL", "0:0:W,LLLLL" })
	public void execute_left_rotation(String expectedOutput, String command) {
		assertEquals(expectedOutput, new MarsRover().execute(command));
	}

}
