package week2day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		boolean isPrime = true;
		// less than start with n =0
		if (n <= 1) {
			isPrime = false;
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println("this is prime number " + n);
		} else {
			System.out.println("this is not prime number " + n);
		}

	}

}
