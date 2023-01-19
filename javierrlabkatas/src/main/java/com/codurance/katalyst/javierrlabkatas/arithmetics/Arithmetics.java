package com.codurance.katalyst.javierrlabkatas.arithmetics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Arithmetics {

	/**
	 *
	 */
	public static final String NO_MORE_TOKENS_EXPECTED = "No more tokens expected";
	/**
	 *
	 */
	public static final String UNEXPECTED_TOKEN = "Expected token is: %s, but was: %s";
	/**
	 *
	 */
	public static final String INVALID_RECORD_ERROR = "Invalid record error";
	/**
	 *
	 */
	private static final String SEPARATOR = " ";

	private String[] tokens;
	private Deque<String> parentheses;
	private Deque<String> operators;
	private Deque<String> operands;

	public int parse(String transaction) throws IllegalArgumentException {
		int result = 0;

		parentheses = new ArrayDeque<>();
		operators = new ArrayDeque<>();
		operands = new ArrayDeque<>();

		tokens = transaction.split(SEPARATOR);
		for (String token : tokens) {
			if (token.equals("(")) {
				parentheses.push(token);
			} else if (token.equals(")")) {
				if (parentheses.isEmpty()) {
					throw new IllegalArgumentException(INVALID_RECORD_ERROR);
				}
				parentheses.pop();
			}
		}

		if (!parentheses.isEmpty()) {
			throw new IllegalArgumentException(INVALID_RECORD_ERROR);
		}

		return result;
	}
}
