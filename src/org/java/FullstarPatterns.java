package org.java;



public class FullstarPatterns {

	public int n = 5;

	public void rightSideIncrement() {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=i; j++) {
			
				System.out.print("* ");
			  	
			
			}
			
			for (int j = i; j <=n; j++) {
				
				System.out.print("^ ");
			}
			
			
			
			System.out.println();
			
			
		}

	}

	public void rightSideDecrement() {
	
		int num[] = {5,4,5,6,8,9,12,82,1,};
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[0]<num[i]) {
				
				num[0]=num[i];
			}
		}
		
		System.out.println(num[0]);
		

	}

	public void leftSideIncrement() {
		
		

	}

	public static void main(String[] args) {
		FullstarPatterns f = new FullstarPatterns();

		System.out.println("Right Side Increment");
		f.rightSideIncrement();
		System.out.println("Right Side Decrement");
		f.rightSideDecrement();
		f.leftSideIncrement();
	}

}
