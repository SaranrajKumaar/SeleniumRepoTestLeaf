package week3day2;

public class Browser {
	
	String browserName;
	double browserVersion;
    public void openURL() {
        System.out.println(browserName + "Opening URL");
        System.out.println(browserVersion + "Opening URL");
    }

    public void closeBrowser() {
        System.out.println(browserName + "Closing Browser");
        System.out.println(browserVersion + "Closing Browser");
    }

    public void navigateBack() {
        System.out.println(browserName + "Navigating Back");
        System.out.println(browserVersion + "Navigating Back");
    }

}
