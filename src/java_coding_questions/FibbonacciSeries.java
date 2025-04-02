package java_coding_questions;

public class FibbonacciSeries {
	
	public static int fibbonacci(int num) {
		if(num <= 1) return num;
		
		return fibbonacci(num - 1) + fibbonacci(num - 2);
	}
	
	public static void main(String[] args) {
		System.out.println(fibbonacci(10));
	}

}
