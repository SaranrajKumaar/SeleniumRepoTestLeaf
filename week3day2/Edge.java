package week3day2;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println(browserName+"takeSnap");
        System.out.println(browserVersion + "Clear takeSnap");
		
	}
	public void clearCookies() {
		System.out.println(browserName +"clearCookies");
        System.out.println(browserVersion + "clearCookies");
	}

}
