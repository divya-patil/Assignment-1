package com.assignment.examples;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		
		double a, sum=0;
		Scanner val = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Enter number: ");
			a = val.nextInt();
			sum = sum + a;
			
			if(a != 0) {
			System.out.println("Sum: " +sum);
			continue;
		}
			
			else {
				System.out.println("Sum: " +sum);
				break;
				
			}
}
}
}	
