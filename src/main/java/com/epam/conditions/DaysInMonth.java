package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
    	
    	if(checkYear(year) && checkMonth(month)) { 
    		switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("31");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("30");
					break;
				case 2:
					if (isLeapYear(year)) { 
						System.out.println("29");
					}else {
						System.out.println("28");
					}
					break;
			}
    	}else {
			System.out.println("invalid date");
		}

    }
    
    private boolean checkYear(int year) {
    	return year > 0 ? true : false;    	
    }
    
    private boolean checkMonth(int month) {
    	return month >= 1 && month <= 12 ? true : false;
    }

    private boolean isLeapYear(int year) {
    	return year % 4 == 0 ? true : false;
    }
}
