package week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	public static void main(String[] args) {
		
	ChromeOptions option = new ChromeOptions();
	option.addArguments("guest");
			
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.cssSelector("#password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
		//complany name 
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Info SMA");
		//firstName 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saran");
		WebElement source =driver.findElement(By.id("createLeadForm_dataSourceId"));
		//source
		Select select = new Select(source);
		select.selectByValue("LEAD_CONFERENCE");
		
		WebElement industry =driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		Select select1 = new Select(industry);
		select1.selectByVisibleText("Distribution");
				
	}

}
