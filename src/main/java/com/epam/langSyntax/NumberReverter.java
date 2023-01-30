package com.epam.langSyntax;

public class NumberReverter {

	public int revert(int number) {

		String[] digits = String.valueOf(number).split("");

		// swap
		String temp = digits[0];
		digits[0] = digits[digits.length - 1];
		digits[digits.length - 1] = temp;
		
		String joinedString = String.join("", digits);
		
		int reversedNumber = Integer.parseInt(joinedString);
		
		return reversedNumber;

	}

}
