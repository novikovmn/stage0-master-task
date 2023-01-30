package com.epam.loops;

public class Pyramid {

	public void printPyramid(int cathetusLength) {
		int rows = cathetusLength;
		int cols = (rows * 2) - 1;
		int item = cathetusLength;

		int[][] arr = new int[rows][cols];

		for (int j = 0; j <= cols / 2; j++) {
			for (int i = rows - 1; i >= rows - 1 - j; i--) {
				arr[i][j] = item - j;
				arr[i][cols - 1 - j] = item - j;
			}
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					result.append(" ");
				} else {
					result.append(arr[i][j]);
				}
			}
			result.append("\n");
		}

		System.out.println(new String(result));
	}

	public static void main(String[] args) {
		new Pyramid().printPyramid(7);
	}

}
