package com.myownproject1;

	public class arrayExam1 {
	
		public static void main(String[] args) {
	
					stringArray();
					intArray();
			}
				
		public static void stringArray() {
			
				String[] days = {"mon ", "tue ", "wed ", "thu ", "fri "};
			
				for(int counter=0; counter<days.length; counter++) {
				System.out.println("Refill Meds - for Mr. Patel "+ days[ counter ]  +  counter + " time:" );
			}
		}
		
		public static void intArray() {
			
			int[] remainingRefills = {10,20,30,40,50};
			
				for(int counter=0; counter<remainingRefills.length; counter++) {
				System.out.println("Refill Meds - number "+ remainingRefills [counter]  + " Refill:" + counter);
			}
		}
	
}