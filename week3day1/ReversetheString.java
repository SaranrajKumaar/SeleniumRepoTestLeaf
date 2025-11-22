package week3day1;

public class ReversetheString {
	
	public static void main(String[] args) {
		String companyName ="TestLeaf";
		
		char [] num =companyName.toCharArray();
		 System.out.print("Reversed String: ");
		for(int i=num.length-1 ; i>=0 ;i--) {
			System.out.print(num[i]);
		}
	}

}
