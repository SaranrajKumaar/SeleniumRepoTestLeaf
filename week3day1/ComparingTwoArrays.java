package week3day1;

import java.util.Iterator;

public class ComparingTwoArrays {
	public static void main(String[] args) {
		  int[] a = {3, 2, 11, 4, 6, 7};
	        int[] b = {1, 2, 8, 4, 9, 7};
	        System.out.println("Taking duplicate value");
	        for(int i=0 ; i<a.length ;i++) {
	        	for(int j=0; j<b.length ;j++) {
	        	
	        		if(b[j]==a[i]) {
	        			System.out.println(a[i]);
	        		}
	        	}
	        }
	}

}
