package week3day2;

public class AllBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chrome chrome = new Chrome();

		chrome.browserName = "Chrome";
		chrome.browserVersion = 122.5;

		chrome.clearCache();
		chrome.closeBrowser();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		System.out.println("-------Chrome--------");
		Edge edge = new Edge();
		edge.browserName = "Edge";
		edge.browserVersion = 22.5;

		edge.clearCookies();
		edge.takeSnap();
		edge.openURL();
		edge.closeBrowser();
		edge.navigateBack();
		System.out.println("-------Edge--------");

		Safari saf = new Safari();
		saf.browserName = "safari";
		saf.browserVersion = 985.2;

		saf.readerMode();
		saf.fullScreenMode();
		saf.openURL();
		saf.closeBrowser();
		saf.navigateBack();
		System.out.println("-------safari--------");

	}

}
