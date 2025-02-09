package java_coding_questions;

import java.util.Scanner;

/*
 * Q #2) Write a Java Program to swap two numbers without using the third
variable.
*/

public class SwapTwoNumbersWitoutTempVariable {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before Swapping :  a = "+a+" b = "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping :  a = "+a+" b = "+b);
		sc.close();
	}
	
	/*
	 * Explanation: This method uses arithmetic operations to swap two numbers without a
	temporary variable. It first adds the two numbers and stores the result in a, then subtracts b
	from the new a to recover the original a and assigns it to b, and finally subtracts the new b
	from the new a to recover the original b.*/

}
