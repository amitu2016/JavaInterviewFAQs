package java_coding_questions;

public class ArmstrongNumber {
	
	public static boolean isArmstrong(int num) {
		int sum = 0; 
		int original = num;
		int digits = String.valueOf(num).length();
		
		while(num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num /= 10;
		}
		
		return original == sum;
		
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));

	}

}
