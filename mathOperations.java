package com.digitek.business;

public class mathOperations {
	
   public static void main(String[] args){
	   additionOfTwoNumbers();
	   substractionOfTwoNumbers();
	   multiplicationOfTwoNumbers();
	   divisionOfTwoNumbers();
	   
   }

// Added comments   
	private static void substractionOfTwoNumbers() {//scope of method
		//int : datatype, number: variable, = : used to assign value, 
		//; for ending statement
		
		int number1 = 20;
		int number2 = 10;
		
		int subtract = number1 - number2;
		System.out.println("substract result: " + subtract);			
	}
	private static void additionOfTwoNumbers() { 
		
		int number1 = 1;
		int number2 = -10;
		
		int sum = number1 + number2;
		System.out.println("sum: " + sum);
	}	
	private static void multiplicationOfTwoNumbers() { 		
		int number1 = 100;
		int number2 = 5;
		
		int multiplication = number1 * number2;
		System.out.println("multiplication result: " + multiplication);	
	}
	private static void divisionOfTwoNumbers() { 		
		int number1 = 100;
		int number2 = 10;
		
		int division = number1 / number2;
		System.out.println("division result: " + division);
	}
}






	
	
