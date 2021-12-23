package org.java;

public class MaxNum {

	public static void main(String[] args) {
		
		int num[] = {3,4,5,6,1,2,3,4,9,};
		
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[0]<num[i]) {
				
				num[0] = num[i];
			}
		}
		
		System.out.println(num[0]);
		
	}
}
