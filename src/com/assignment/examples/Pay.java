package com.assignment.examples;
import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		double hours, payrate, salary;
		
		System.out.println("Enter number of hours worked: ");
		hours = enter.nextDouble();
		
		System.out.println("Enter payrate value per hour: ");
		payrate = enter.nextDouble();
		
		salary = hours*payrate;
		System.out.println("Salary: " +salary);

	}

}
