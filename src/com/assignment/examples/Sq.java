package com.assignment.examples;
import java.util.Scanner;
public class Sq {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the value of a:" );
		a = value.nextInt();
		System.out.println("Enter the value of b:" );
		b = value.nextInt();
		for (int i=a; i<=b; i++) {
			System.out.println(i + " " + i*i);
			
		}
		

	}

}
