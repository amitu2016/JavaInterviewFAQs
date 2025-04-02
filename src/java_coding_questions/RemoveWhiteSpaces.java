package java_coding_questions;

public class RemoveWhiteSpaces {
	
	public static String removeWhiteSpaces(String str) {
		StringBuilder ans = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				ans.append(str.charAt(i));
			}
		}
		
		return ans.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("My name is Amit Kumar"));
	}

}
