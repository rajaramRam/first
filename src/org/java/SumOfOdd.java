package org.java;

public class SumOfOdd {

	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <=10; i++) {
		
				if (i%2==1) {
					
					System.out.println(i);
					sum = sum+i; 
				}				
		}
		System.out.println("Sum of Odd number is:"+sum);
		
	}
	
}
