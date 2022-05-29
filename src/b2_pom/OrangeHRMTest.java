package b2_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	WebDriver driver;
	//LoginPage lp;
	LoginPage2 lp;
	
	
	@BeforeClass
	void setup()
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test(priority=1)
	void test_logo()
	{
		//lp=new LoginPage(driver);
		lp=new LoginPage2(driver);
		boolean st=lp.checkLogoPresence();
		Assert.assertEquals(st, true);
		
	}
	@Test(priority=2)
	void test_login()
	{
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	

}
