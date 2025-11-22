package week3day1;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = {52,3,4,5,5,45,6,43,3};
		
		for (int i =0; i<number.length; i++) {
			System.out.println("print all number lit in arat "+number[i]);
			
		}
		
		int max = number[0];
		int min =number[0];
		
	for (int l=0; l<number.length ;l++) {
		if (number[l]<min){
			min=number[l];
		}else if (number[l]>max) {
			max=number[l];
		}
	}
	System.out.println("max"+ max);
	System.out.println("min"+min);
	
Arrays.sort(number);
System.out.println("mini sort"+number[0]);

System.out.println("max sort"+ number[number.length-1]);

		
		
		

	}

}
