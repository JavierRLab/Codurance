package com.codurance.katalyst.javierrlabkatas.marsrover;

public class MarsRover {

	private static final char[] COMPASS_DIRECTIONS = new char[] { 'N', 'E', 'S', 'W' };
	private int currentCompassDirection = 0;

	public String execute(String command) {

		for (char currentCommand : command.toCharArray()) {

			if (currentCommand == 'L') {
				rotateLeft();
			} else if (currentCommand == 'R') {
				rotateRight();
			}
		}

		return String.format("0:0:%s", COMPASS_DIRECTIONS[currentCompassDirection]);
	}

	private void rotateLeft() {
		currentCompassDirection = (COMPASS_DIRECTIONS.length
				+ currentCompassDirection - 1) % COMPASS_DIRECTIONS.length;
	}

	private void rotateRight() {
		currentCompassDirection = (currentCompassDirection + 1) % COMPASS_DIRECTIONS.length;
	}
}
