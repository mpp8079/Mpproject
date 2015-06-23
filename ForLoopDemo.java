package com.digitek.loops;

public class ForLoopDemo {

// adedd by manish patel
	
	public static void main(String[] args) {

		printNameRepeatedly5Times();
//		printNameRepeatedly2Times();
//		printNameRepeatedly6Times();
	}
	
	// Use for loop when you know the no. of times to execute the code
	public static void printNameRepeatedly5Times() {
		
	//	for (initial value; expression; increment) {
	//		code to be executed in repetition
	// }
	for(int counter=1; counter <= 5; counter= counter+1) {
			System.out.println("printNameRepeatedly5Times(): This is for loop statement " + counter);
		}
	}
	
	public static void printNameRepeatedly2Times() {
		for(int counter=0; counter<=4; counter = counter+2) {
			System.out.println("printNameRepeatedly5Times(): This is for loop statement "+ counter);
		}
	}
	
	public static void printNameRepeatedly6Times() {
		for(int counter=0; counter<=4; counter = counter+2) {
			System.out.println("printNameRepeatedly6Times(): This is for loop statement");
		}
	}
	
}
