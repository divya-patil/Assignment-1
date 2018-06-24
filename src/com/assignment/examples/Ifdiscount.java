package com.assignment.examples;

import java.util.Scanner;

public class Ifdiscount {

	public static void main(String[] args) {
		double price, amt;
		Scanner rate = new Scanner(System.in);
		System.out.println("Enter the price of item: ");
		price = rate.nextDouble();

		if (price >= 10) {

			amt = price - (price * 5) / 100;
			System.out.println("Final price after discount: " + amt);

		} else {
			System.out.println("No discount on the item");
		}

	}
}
