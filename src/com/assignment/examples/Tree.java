package com.assignment.examples;

public class Tree {

	public static void main(String[] args) {
		int line = 8, star = 1, space = line-1;
		
		for (int k = 1; k<=line; k++) {
			
			for (int j = 1; j<=space; j++) {
				
				System.out.print(" ");
				
			}
			
			for(int i=1; i<=star; i++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star = star + 2;
			
		}
		for(int m =0; m<3; m++) {
			
		for (int l=0; l<=6; l++) {
			if(l<6) {
				System.out.print(" ");
			}else
				System.out.println("***");
		}
		
		


	}

}
}