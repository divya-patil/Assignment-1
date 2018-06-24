package com.assignment.examples;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner fact = new Scanner (System.in);
		int n, mul = 1;
		System.out.println("Enter a number n: ");
		n = fact.nextInt();
			
		for (int i=1; i<=n; i++) {
			mul = mul * i;
		
		}
		System.out.println("factorial is: " +mul);
	}

}
