package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
    	
    	int startMultiplier = 1;
		int endMultiplier = 10;
		
		for (int i = startMultiplier; i <= endMultiplier; i++) {
			System.out.printf("%d x %d = %d\n", i, numberTableToPrint, (i * numberTableToPrint));
		}
    	
    }

}
