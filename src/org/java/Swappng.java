package org.java;

import java.util.Scanner;

public class Swappng {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int inputA = s.nextInt();
		
		System.out.println("A value:"+inputA);
		
		int inputB = s.nextInt();
		
		System.out.println("B value:"+inputB);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Swapping of Two numbers");
		
		int c = inputA;
		
		inputA = inputB;
		
		
		inputB= c;
		
		System.out.println("Swapping Two num:"+inputA);
		System.out.println("Swapping Two num:"+inputB);
		
		
		
	}
}
