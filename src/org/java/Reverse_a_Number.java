package org.java;

public class Reverse_a_Number {

	
	public void starPatternIncrement() {
		// TODO Auto-generated method stub

		for (int i = 0; i <5; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				System.out.print("^ ");
			}
			
			System.out.println();
		}
		
	}
	
	public void starPatternDecrement() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = i; j <5; j++) {
				
				System.out.print("^ ");
				
			}
			
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		
		Reverse_a_Number r = new Reverse_a_Number();
		r.starPatternIncrement();
		System.out.println("\n");
		r.starPatternDecrement();
		System.out.println("\n");
		
		System.out.println("\n");
		
	}
	
	
	
	
}
