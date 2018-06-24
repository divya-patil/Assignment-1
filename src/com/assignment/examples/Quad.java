package com.assignment.examples;
import java.util.Scanner;
public class Quad {

	public static void main(String[] args) {
		Scanner no = new Scanner(System.in);
		
		int x, output;
		System.out.println("Input: ");
		x = no.nextInt();
		
		output = (int) (3*Math.pow(x, 2) - 8*x+4);
		System.out.println("Output: " +output);
		System.out.println("explanation: 3*"+x + "*" +x +"- 8*" +x + "+4 =" +output);
	}

}
