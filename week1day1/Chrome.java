package week1day1;
public class Chrome {
	
	private float version =91.0f;
	private String developer= "Google";
	public boolean beta = false;
	protected int year =2008;
	public char shortCutKey ='C';
	
	public void displayInfo(){
		System.out.println("version is " +version);
		System.out.println("developer is " +developer);
		System.out.println("beta is "+ beta);
		System.out.println("year is "+ year);
		System.out.println("shortcutKey is "+ shortCutKey);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome chrome = new Chrome();
		chrome.displayInfo();
		
		

		

		

	}

}
