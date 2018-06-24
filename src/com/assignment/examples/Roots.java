package com.assignment.examples;
import java.util.Scanner;
public class Roots {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		double a, b, c ;
		System.out.println("Enter the value of a: " );
		a = number.nextDouble();
		
		System.out.println("Enter the value of b: " );
		b = number.nextDouble();
		
		System.out.println("Enter the value of c: " );
		c = number.nextDouble();
		
		
	        double discriminant = b*b - 4*a*c;
	        double sqr = Math.sqrt(discriminant);
	        
	        if(discriminant<0)
	        {
	            System.out.println("\nRoots Are Imaginary\n");
	        }
	        else
	        {
	            double root1 = (-b + sqr) / (2*a);
	            double root2 = (-b - sqr) / (2*a);
	            System.out.println("\nRoot 1 = " + root1 + "\n");
	            System.out.println("\nRoot 2 = " + root2 + "\n");
	        }

}
}
