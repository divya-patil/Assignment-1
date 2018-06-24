package com.assignment.examples;
import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		Scanner wh = new Scanner(System.in);
		
		int i, sum = 0;
		System.out.println("Enter an integer: ");
		i = wh.nextInt();
		
		while(i > 0) {
			sum = sum + i;
			System.out.println("sum: " +sum);
		}

	}

}
