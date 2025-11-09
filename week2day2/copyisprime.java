package week2day2;

import java.util.Scanner;

public class copyisprime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		boolean isPrime=true;
		
		if(n<=1) {
			isPrime =false;
		}else {
			for(int i=2; i<n ;i++) {
				if(n%i ==0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println("This is prime Number "+ n);
		}else {
			System.out.println("This is not prime Number "+ n);
		}
		
	}

}
