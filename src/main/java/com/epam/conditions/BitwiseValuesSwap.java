package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
    	
    	System.out.print("first = " + first + "\n" + "second = " + second + "\n");
    	
    	first = first ^ second;
    	second = second ^ first;
    	first = first ^ second;
    	
    	System.out.print("first = " + first + "\n" + "second = " + second + "\n");
    	
    	
    }

}
