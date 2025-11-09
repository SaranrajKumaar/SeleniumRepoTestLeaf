package week2day2;

import java.util.Scanner;

public class EvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :  " );
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+ " even number");
		}else {
			System.out.println(n+ " odd number");
		}

	}

}
