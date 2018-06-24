package com.assignment.examples;
import java.util.Scanner;

public class Cake {

	public static void main(String[] args) {
		int cookies, cakes;
		double price, amt;
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the no of cookies: ");
		cookies = number.nextInt();
		
		System.out.println("Enter the no of cakes: ");
		cakes = number.nextInt();
		
		price = cookies * cakes;
		System.out.println("Total price: " +price);
		if(price>=10) {
						
		amt = price - (price * 5)/100;
		System.out.println("Final price after discount: " +amt);
		
	}
		else {
		System.out.println("No discount on the item");
	}
	

	}

}
