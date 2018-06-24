package com.assignment.examples;

public class Stars {

	public static void main(String[] args) {
		int line = 7, star = 7;
		for (int j =1; j<=line ; j++) {
			
			for(int i =1; i<=star; i++) {
				
				System.out.print(" * ");
			}
			System.out.println();
			star--;
		}

	}

}
