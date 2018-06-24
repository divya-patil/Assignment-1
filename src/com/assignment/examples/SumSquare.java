package com.assignment.examples;
import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		
		double a, sum=0, sq;
		Scanner val = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Enter number: ");
			a = val.nextInt();
			
			sq = Math.pow(a, 2);
			//sq = (a*(a+1)*(2*a+1))/6;
			sum = sq + sum;
			
			
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
