package java_coding_questions;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		
		 // Step 1: Handle base cases
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        if (num <= 3) return true;  // 2 and 3 are prime numbers

        // Step 2: Eliminate even numbers and multiples of 3
        if (num % 2 == 0 || num % 3 == 0) return false; 
        
        // Step 3: Check divisibility using optimized trial division
        // We only check numbers in the form of 6k ± 1 up to sqrt(num)
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        
        // Step 4: If no divisors found, num is prime
        return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        
        // Check for prime and print result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close(); // Close scanner to prevent resource leak

	}

}
