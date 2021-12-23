package org.java;

import java.util.Scanner;

public class NEwReverse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("enter a number  i will reverse it");
		
		int i = s.nextInt();
		
		System.out.println("You'r enterd number:"+i);
		
		int reverse = 0;
		while (i>0) {
			
			int remainder = i % 10 ;
			
			i = i / 10;
			
			reverse = (reverse * 10)+ remainder;
		}
		
		System.out.println("Reversed number is:"+reverse);
		
		
	}
}
