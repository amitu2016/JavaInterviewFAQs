package java_coding_questions;

public class SecondHighestInArray {
	
	public static int secondHighest(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(num > max) {
				second_max = max;
				max = num;
			}else if(num > second_max && num != max) {
				second_max = num;
			}
		}
		
		return second_max;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 1, 7, 4, 2, 8, 11};
		
		System.out.println(secondHighest(arr));
	}

}
