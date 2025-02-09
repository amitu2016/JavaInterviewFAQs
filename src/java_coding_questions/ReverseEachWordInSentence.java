package java_coding_questions;

import java.util.Scanner;
import java.util.Stack;

public class ReverseEachWordInSentence {
	
	public static String reverseEachWord(String s) {
		Stack<Character> stack = new Stack<>();
		
		int n = s.length();
		
		String ans = "";
		
		 // Traverse given string and push all
        // characters to stack until we see a space.
		for(int i = 0; i < n; i++) {
			
			if(s.charAt(i) != ' ') {
				stack.push(s.charAt(i));
				
			// When we see a space, we print
	        // contents of stack.	
			}else {
				
				while(stack.empty() == false) {
					ans+=stack.pop();
				}
				ans+=" ";
			}
			
		}
		
		// Since there may not be space after
        // last word.
		while(stack.empty() == false) {
			ans+=stack.pop();
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String ans = reverseEachWord(input);
		System.out.println(ans);
		sc.close();
	}

}
