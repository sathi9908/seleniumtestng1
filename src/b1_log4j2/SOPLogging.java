package b1_log4j2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SOPLogging {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Chrome Browser got launched");
	
		driver.get("https://demo.opencart.com/");
		System.out.println("opencart Application got opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser got maximized");
	}
	
	@Test
	public void testRegistration() {
			
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
		driver.findElement(By.linkText("Register")).click();
		System.out.println("Register link got clicked");
				
		driver.findElement(By.id("input-firstname")).sendKeys("JOHN");//Firstname
		System.out.println("Provided First Name");
		
		driver.findElement(By.id("input-lastname")).sendKeys("CANEDY"); //Lastname
		System.out.println("Provided Last Name");
		
		driver.findElement(By.id("input-email")).sendKeys("kdhfhd@gmail.com"); //Email
		System.out.println("Provided Email");
		
		driver.findElement(By.id("input-telephone")).sendKeys("123456789"); //Telephone
		System.out.println("Provided Telephone");
		
		driver.findElement(By.id("input-password")).sendKeys("test123"); //Password
		System.out.println("Provided Password");
				
		driver.findElement(By.id("input-confirm")).sendKeys("test123"); //confirm Password
		System.out.println("Provided Confirm Password");
		
		driver.findElement(By.xpath("//input[@name='agree']")).click(); //privacy policy
		System.out.println("Agreed privacy policy");
		
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click(); //Continue button
		System.out.println("Continue link got clicked");
		
				
		String confmsg=driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
		System.out.println("Confirmation message captured");
		
		if(confmsg.equals("Your Account Has Been Created!")) 
		{
			
			System.out.println("Success: User Registered");
			Assert.assertTrue(true);
		}
		else 
		{
			System.out.println("Error: User Not Registered");
			Assert.assertTrue(false);
		}
		
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
		System.out.println("Chrome Browser got Closed");
	}
}