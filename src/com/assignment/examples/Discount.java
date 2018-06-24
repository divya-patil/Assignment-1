package com.assignment.examples;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		double price, amt;
		Scanner rate = new Scanner(System.in);
		System.out.println("Enter the price of item: ");
		price = rate.nextDouble();

		amt = price - (price * 5) / 100;
		System.out.println("Final price is: " + amt);

	}

}
