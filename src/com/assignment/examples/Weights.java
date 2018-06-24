package com.assignment.examples;
import java.util.Scanner;

public class Weights {

	public static void main(String[] args) {
		Scanner wght = new Scanner(System.in);
		int left, right, sum1=0, sum2=0;; 
		
		
		
		while(true) {
			System.out.println("Enter left side weight: ");
			left = wght.nextInt();
			
			System.out.println("Enter right side weight: ");
			right = wght.nextInt();
			
		if(left != right) {			
			sum1 = sum1 + left;
			sum2 = sum2 + right;
			if(sum1 == sum2){
				System.out.println("Both are same weights " +sum1 +"=" +sum2);
				break;
			}else {
				System.out.println("Both are not same weights");
			}
			continue;
		}else {
			System.out.println("Both are same weights " +left +"=" +right);
			break;
		}
		
		
	
	}

}
}