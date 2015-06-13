package com.digitech.business;

public class MathOperationJava {
	
	public static void main(String[] args) {
			addition();
			substraction();
			multipiction();
			division();
	}
	//Raj Patel
	public static void addition() {
		int number1 = 20;
		int number2 = 10;
		int sum = number1 + number2;
		System.out.println("Sum Total " + sum);
	}
	
	public static void substraction() {
		int number1 = 20;
		int number2 = 10;
		int Substract = number1 - number2;
		System.out.println("Substract Result " + Substract);
	}
	
	public static void multipiction() {
		int number1 = 20;
		int number2 = 10;
		int Multipication = number1 * number2;
		System.out.println("Multipication Result " + Multipication);
	}
	
	public static void division() {
		int number1 = 20;
		int number2 = 10;
		int Divied = number1 / number2;
		System.out.println("Divied Result " + Divied);
	}
}

