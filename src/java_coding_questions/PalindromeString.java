package java_coding_questions;

public class PalindromeString {
	
	public static boolean isPalindrome(String str) {
		int len = str.length();
		int left = 0;
		int right = len - 1;
		
		while(left < right) {
			if(str.charAt(right) != str.charAt(left)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "racecar";
		System.out.println(isPalindrome(str));
	}

}
