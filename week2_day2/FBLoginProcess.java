package week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FBLoginProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the Page" +driver.getTitle());
		//email text box
		driver.findElement(By.id("email")).sendKeys("BAACK");
		//password
		driver.findElement(By.id("pass")).sendKeys("wihite@123");
		//logib button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String actualText=driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();
		Assert.assertEquals(actualText, "The password that you've entered is incorrect.");

	}

}
