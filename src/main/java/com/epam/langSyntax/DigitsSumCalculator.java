package com.epam.langSyntax;

public class DigitsSumCalculator {

    public int calculateSum(int number) {
    	
    	int sum = 0;
    	
    	String[] splittedNumber = String.valueOf(number).split("");
    	
    	int[] digits = new int[splittedNumber.length];
    	
    	for (int i = 0; i < splittedNumber.length; i++) {
    		digits[i] = Integer.parseInt(splittedNumber[i]);
		}
    	
    	for (int i = 0; i < digits.length; i++) { 
			sum += digits[i];
		}
    	
    	return sum;
    }

}
