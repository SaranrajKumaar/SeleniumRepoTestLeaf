package week2_day2;

import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OpenTapsLogin {

	public static void main(String[] args) {
		///assignment 2
		// TODO Auto-generated method stub
		String accountName = "S3Name";
		String newAccountName = accountName;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/");
		// maximum the window
		driver.manage().window().maximize();
		// user name
		driver.findElement(By.id("username")).sendKeys("democsr");
		// password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		// login Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Demo B2b CSR
		driver.findElement(By.linkText("CRM/SFA")).click();
		// clicking on accounts
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		// clicking on create accounts
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();

		// account Name
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		// description
		driver.findElement(By.cssSelector("textarea[name='description']")).sendKeys("Selenium Automation Tester");
		// industry
		WebElement industry = driver.findElement(By.cssSelector("select[name='industryEnumId']"));
		Select s1 = new Select(industry);
		s1.selectByValue("IND_SOFTWARE");
		// ownership
		WebElement ownership = driver.findElement(By.cssSelector("select[name='ownershipEnumId']"));
		Select s2 = new Select(ownership);
		s2.selectByVisibleText("S-Corporation");
		// source
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select s3 = new Select(source);
		s3.selectByValue("LEAD_EMPLOYEE");
		// marketCampagin
		WebElement marketCampagin = driver.findElement(By.id("marketingCampaignId"));
		Select s4 = new Select(marketCampagin);
		s4.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s5 = new Select(state);
		s5.selectByValue("TX");
		// create account button
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		try {
			String duplicate = driver.findElement(By.xpath("//span[text()='Duplicates found:']/following-sibling::a"))
					.getText();
			String dupValue = duplicate.split("\\(")[0].trim();
			System.out.println("duplicate value is :" + dupValue);
			if (dupValue.equalsIgnoreCase(accountName)) {
				System.out.println("Duplicate account name Found" + accountName);
				int sec = LocalTime.now().getSecond();

				newAccountName = accountName + sec;

				driver.findElement(By.id("accountName")).clear();
				driver.findElement(By.id("accountName")).sendKeys(newAccountName);
				System.out.println("New account name: " + newAccountName);// new name
				// create account button
				driver.findElement(By.cssSelector("input[type='submit']")).click();

				String accountValueElementDup = driver
						.findElement(By.xpath("//span[text()='Account Name']/parent::td/following-sibling::td/span"))
						.getText();
				// split space
				String acutalTextDup = accountValueElementDup.split("\\(")[0].trim();
				// assertion
				Assert.assertEquals(newAccountName, acutalTextDup);
				System.out.println("value of text from the screen" + acutalTextDup);
				System.out.println("new passing string value" + newAccountName);
			}
		} catch (Exception e) { // no duplicated
			System.out.println("No Duplicate name are found");
			String accountValueElement = driver
					.findElement(By.xpath("//span[text()='Account Name']/parent::td/following-sibling::td/span"))
					.getText();
			// split space
			String acutalText = accountValueElement.split("\\(")[0].trim();
			// assertion
			Assert.assertEquals(accountName, acutalText);
			System.out.println("value of text from the screen" + acutalText);
			System.out.println("passing string value" + accountName);
		}

		driver.close();

	}

}
