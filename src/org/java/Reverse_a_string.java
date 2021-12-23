package org.java;

public class Reverse_a_string {

	public static void main(String[] args) {
		
		String name = "rajaram";
		
		String name1="";
		
		int i = name.length();
		
		for(int j = i-1; j>=0; j--) {
			
			name1=name1+name.charAt(j);
			
			
			
		}
		System.out.println(name1);
	}

}
