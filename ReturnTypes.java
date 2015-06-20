package com.digitek.test;

// Class
public class ReturnTypes {
	// Main Methods
	public static void main(String[] args) {
		multiplication();
		// Method with return types
		int result1 = subtraction();
		int result2 = result1 - 1;
		System.out.println("result2 " + result2);
		int result3 = result1 - 5;
		System.out.println("result3 " + result3);
		// Method with parameters types
		addisionWithParameters(133, 11);
		addisionWithParameters(5, 5);
		addisionWithParameters(14, 9);

	}

	// Method that does not return anything
	public static void multiplication() {
		// Variables
		int number1 = 14;
		int number2 = 11;
		// Condision
		int result = number1 * number2;
		System.out.println("result " + result);
	}

	// Method that returns an int type
	public static int subtraction() {
		// Variables
		int number1 = 52;
		int number2 = 12;
		// Condision
		int sum = number1 - number2;
		System.out.println("sum " + sum);
		return sum;

	}

	// Method that returns an string type
	public static int addisionWithParameters(int number1, int number2) {
		// Condision
		int total = number1 + number2;
		System.out.println("total " + total);
		return total;
	}

}
