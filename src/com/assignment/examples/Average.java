package com.assignment.examples;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		int sub[] = new int[6];
		int i;
		double total=0, avg;
		Scanner marks = new Scanner(System.in);
		
		for (int j=1; j<=3; j++) {
		System.out.println("Enter subject marks: ");		
			
		for (i=0; i<6; i++) {
			
			sub[i] = marks.nextInt();
			total = total + sub[i];
			
		}
		avg = total/6;
		System.out.println("Total: " +total);		
		System.out.println("Average: " +avg);
		System.out.println();

	}

}
}