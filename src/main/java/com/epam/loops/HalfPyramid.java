package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
    	
    	int len = cathetusLength;

		String[][] arr = new String[len][len];

		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j >= len - 1 - i; j--) {
				arr[i][j] = "*";
			}
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (arr[i][j] == null) {
					arr[i][j] = " ";
				}
				result.append(arr[i][j]);
			}
			result.append("\n");
		}

		System.out.println(new String(result));

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
