package java_coding_questions;

import java.util.Scanner;

//Q #1) Write a Java Program to reverse a string without using String inbuilt function.

public class ReverseStringWithoutInbuiltFunction {

	public static String reverseString(String s) {
		//Convert the string to character array
		char[] chars = s.toCharArray();
		int n = chars.length;
		
		//Define two pointers 
		int first = 0;
		int last = n - 1;
		
		//While the both pointers meet, swap each character
		while(last > first) {
			char temp = chars[first];
			chars[first] = chars[last];
			chars[last] = temp;
			first++;
			last--;
		}
		
		//Return the reversed string
		return new String(chars);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = reverseString(input);
		System.out.println(output);
		sc.close();
	}
	
	/*
	 * Explanation: This solution manually swaps the characters of the string from the start and
	end, moving towards the center, effectively reversing the string without using any built-in
	functions.
	*/

}
