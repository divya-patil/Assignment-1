package com.assignment.examples;
import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		int sub[] = new int[6];
		int i;
		double total=0, avg;
		Scanner marks = new Scanner(System.in);
		
		System.out.println("Enter subject marks: ");
		for (i=0; i<6; i++) {
			
			sub[i] = marks.nextInt();
			total = total + sub[i];
			
		}
		avg = total/6;
		System.out.println("Total: " +total);		
		System.out.println("Average: " +avg);
	}

}
