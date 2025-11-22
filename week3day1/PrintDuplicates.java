package week3day1;

import java.util.Arrays;

public class PrintDuplicates {
	
		 int[] num={2, 5, 7, 7, 5, 9, 2, 3};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintDuplicates pd =new PrintDuplicates();
		int [] dupData =pd.num;
		
		Arrays.sort(dupData);
		
		System.out.println("duplicate value ");
		
		for(int i =0; i<dupData.length -1; i++) {
			if(dupData[i] ==dupData[i+1]) {
				System.out.println(dupData[i]);
			}
			
		}
		

	}

}
